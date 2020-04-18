package com.fcs.ecdb.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fcs.ecdb.config.DriverConfig;
import com.fcs.ecdb.constant.ApplicationProperties;
import com.fcs.ecdb.entity.DataDTO;
import com.fcs.ecdb.exception.WrongCaptchaException;
import com.fcs.ecdb.fileop.FileOperation;
import com.fcs.ecdb.util.InputDataFilter;
import com.fcs.ecdb.util.JSONToObj;

public class AppMain {

	private JFrame f;
	private JTextField tCaptcha;
	private JButton bRun, bFilter, bSetCaptcha, browseFile;
	private JLabel lblCaptcha, lblFilterFile, lblFilePath, lblRecordFound;
	private JFileChooser jfc;

	private WebDriver driver = null;

	private String fileName = null;
	private String captcha = "";

	private InputDataFilter dataFilter = new InputDataFilter();
	private List<String> eIds = new ArrayList<String>();

	private DriverConfig driverConfig = new DriverConfig();

	private JSONToObj jsonToObj = new JSONToObj();
	private FileOperation fileOperation = new FileOperation();

	public AppMain() {
		f = new JFrame("ECDB");

		lblFilterFile = new JLabel();
		lblFilterFile.setText("Select Input file");
		lblFilterFile.setBounds(10, 10, 200, 40);
		f.add(lblFilterFile);

		browseFile = new JButton();
		browseFile.setText("Browse");
		browseFile.setBounds(120, 10, 100, 40);
		f.add(browseFile);

		jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		f.add(jfc);

		lblFilePath = new JLabel();
		lblFilePath.setText("");
		lblFilePath.setBounds(10, 50, 300, 40);
		f.add(lblFilePath);

		bFilter = new JButton();
		bFilter.setText("Filter");
		bFilter.setBounds(10, 100, 100, 40);
		f.add(bFilter);

		lblRecordFound = new JLabel();
		lblRecordFound.setText("");
		lblRecordFound.setBounds(120, 100, 100, 40);
		f.add(lblRecordFound);

		bRun = new JButton();
		bRun.setText("Run");
		bRun.setBounds(240, 100, 100, 40);
		f.add(bRun);

		lblCaptcha = new JLabel();
		lblCaptcha.setText("Enter Capcha");
		lblCaptcha.setBounds(10, 150, 100, 40);
		f.add(lblCaptcha);

		tCaptcha = new JTextField();
		tCaptcha.setBounds(120, 150, 100, 40);
		f.add(tCaptcha);

		bSetCaptcha = new JButton();
		bSetCaptcha.setText("Set Captcha");
		bSetCaptcha.setBounds(240, 150, 120, 40);
		f.add(bSetCaptcha);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		browseFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("File access cancel.");
				int returnVal = jfc.showOpenDialog((Component) e.getSource());

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = jfc.getSelectedFile();
					try {
						fileName = file.toString();
						lblFilePath.setText(fileName);
					} catch (Exception ex) {
						System.out.println("problem accessing file" + file.getAbsolutePath());
					}
				} else {
					System.out.println("File access cancelled by user.");
				}
			}
		});

		bFilter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					eIds = dataFilter.processInputFilter(fileName);
					lblRecordFound.setText("Records =" + eIds.size());

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		bRun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					driver = driverConfig.loadDriver();
					driver.get(ApplicationProperties.INSTANCE.getProperties().getProperty("ecWebSite"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		bSetCaptcha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FileOutputStream fos = null;
				OutputStreamWriter osw = null;
				FileWriter failWriter = null;

				try {

					fos = new FileOutputStream("out-data.csv");

					failWriter = new FileWriter("fail-id.txt");

					System.out.println(captcha);

					String head = ApplicationProperties.INSTANCE.getProperties().getProperty("csvHeader");

					osw = new OutputStreamWriter(fos, "UTF-8");
					osw.write(head + System.lineSeparator());

					for (String eId : eIds) {
						String ecWebSite = ApplicationProperties.INSTANCE.getProperties().getProperty("ecWebSiteOrgn")
								+ eId;
						String ecWebSiteMidUrl = ApplicationProperties.INSTANCE.getProperties()
								.getProperty("ecWebSiteMidUrl") + captcha;
						String finalUrl = ecWebSite + ecWebSiteMidUrl;

						driver.get(finalUrl);
						System.out.println(finalUrl);
						Thread.sleep(1500);
						String res = driver.findElement(By.tagName("body")).getAttribute("innerHTML");

						fileOperation.processing(res, eId, osw, failWriter);

					}

				} catch (InterruptedException | WrongCaptchaException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				finally {
					try {
						// failBufferWriter.close();
						osw.close();
						failWriter.close();
						// outBufferWriter.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}

		});

		tCaptcha.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent evt) {
				captcha = ((JTextField) evt.getSource()).getText() + String.valueOf(evt.getKeyChar());
			}
		});

	}

}
