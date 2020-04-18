package com.fcs.ecdb.fileop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.fcs.ecdb.entity.DataDTO;
import com.fcs.ecdb.entity.Doc;
import com.fcs.ecdb.entity.Response;
import com.fcs.ecdb.exception.WrongCaptchaException;
import com.fcs.ecdb.util.JSONToObj;

public class FileOperation {

	private JSONToObj jsonToObj = new JSONToObj();

	public void processing(String res,String id,OutputStreamWriter outWriter,FileWriter failWriter) throws IOException, WrongCaptchaException {

		if (res != null && !"".equals(res)) {

			if (!"Wrong Captcha".equalsIgnoreCase(res)) {

				String data = new String(res.getBytes("UTF-8"));
				if (data != null && !"".equals(data)) {
					DataDTO dataDTO = jsonToObj.convert(res);
					Response response = dataDTO.getResponse();
					if (response != null) {
						List<Doc> docs = response.getDocs();
						if (docs != null && docs.size() > 0) {
							Doc doc = docs.get(0);
							if (doc != null) {
								outWriter.write(doc.toString() + System.lineSeparator());
							} else {
								failWriter.write(id + System.lineSeparator());
							}
						} else {
							failWriter.write(id + System.lineSeparator());
						}
					} else {
						failWriter.write(id + System.lineSeparator());
					}
				} else {
					failWriter.write(id + System.lineSeparator());
				}
			} else {
				failWriter.write(id + System.lineSeparator());
				throw new WrongCaptchaException(
						"Captcha is wrong captcha. Please restart the app and try again");
			}
		} else {
			failWriter.write(id + System.lineSeparator());
		}

	}
}

