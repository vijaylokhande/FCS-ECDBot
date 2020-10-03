package com.fcs.ecdb.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputDataFilter {

	public List<String> processInputFilter(String inputFilePath) throws IOException {
		List<String> eIds = new ArrayList<String>();
		if (!"".equals(inputFilePath)) {
			File file = new File(inputFilePath);
			if (file != null) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String st;
				while ((st = br.readLine()) != null) {

					if (!st.contains("Avail") && !st.contains("Phot") && !st.contains("~") && !st.contains("<")) {

						String[] stArray = st.split(" ");

						if (stArray.length > 0) {

							for (String s : stArray) {
								if (s != null && s.length() >= 10) {
									Pattern p = Pattern.compile("^[a-zA-Z0-9/]+$");
									Matcher m = p.matcher(s);
									if (m.find()) {

										if (s.endsWith("II")) {
											String ss = (String) s.subSequence(0, 10);

											System.out.println("OLD - "+ss);
											ss = new String(eIdCorrection(ss));
											System.out.println("NEW - "+ss);
											eIds.add(ss);
										} else {
											System.out.println("OLD - "+s);
											s = new String(eIdCorrection(s));
											System.out.println("NEW - "+s);
											eIds.add(s);
										}
									}
								}

							}
						}
					}
				}
			}
		}
		return eIds;
	}

	public String eIdCorrection(String id) {
		

		String newId = "";

		id=id.trim();
		
		if(id.contains("/") && id.length() == 16) {
			
			String alphId = "";
			String numId = "";
			String newAlphId = "";
			String newNumId = "";
			

			alphId = id.substring(0, 2);
		//	System.out.println(alphId);
			numId = id.substring(2,16);
		//	System.out.println(numId);
			
			Pattern p1 = Pattern.compile("[A-Z]");
			Pattern p2 = Pattern.compile("[0-9]");
			Matcher m1 = p1.matcher(alphId);
			Matcher m2 = p2.matcher(numId);
			
			if (!m1.matches()) {

				for (int i = 0; i < 2; i++) {

					newAlphId += replaceNumWithAlpha(alphId.charAt(i) + "");	

				}
				
				
			} else {
				System.out.println("Not match");
				newAlphId = alphId;
			}

			if (!m2.matches()) {
				for (int i = 2; i < 14; i++) {		
					
					if(i==2 || i==5 || i==9)
						newNumId +="/";
					else	
						newNumId += replaceAlphaWithNum(numId.charAt(i) + "");
				}

			} else {
				System.out.println("Not match");
				newNumId = numId;
			}
			
			if (newAlphId.length() == 2 && newNumId.length() == 14) {
				newAlphId=newAlphId.concat(newNumId);
				newId=newAlphId;
				//System.out.println("correction done -> "+newId);
			}
			else {
				newId=id;
			}
			
			
		}
		else {
			
			String alphId = "";
			String numId = "";
			String newAlphId = "";
			String newNumId = "";

		alphId = id.substring(0, 3);
	//	System.out.println(alphId);
		numId = id.substring(3,10);
	//	System.out.println(numId);

		Pattern p1 = Pattern.compile("[A-Z]");
		Pattern p2 = Pattern.compile("[0-9]");
		Matcher m1 = p1.matcher(alphId);
		Matcher m2 = p2.matcher(numId);

		if (!m1.matches()) {

			for (int i = 0; i < 3; i++) {

				newAlphId += replaceNumWithAlpha(alphId.charAt(i) + "");	

			}

		} else {
			System.out.println("Not match");
			newAlphId = alphId;
		}

		if (!m2.matches()) {
			for (int i = 0; i < 7; i++) {				
				newNumId += replaceAlphaWithNum(numId.charAt(i) + "");
			}

		} else {
			System.out.println("Not match");
			newNumId = numId;
		}
		
	//	System.out.println(newAlphId);
	//	System.out.println(newNumId);

		if (newAlphId.length() == 3 && newNumId.length() == 7) {
			newAlphId=newAlphId.concat(newNumId);
			newId=newAlphId;
			//System.out.println("correction done -> "+newId);
		}
		else {
			newId=id;
		}
		
		}

		return newId;
	}

	public String replaceNumWithAlpha(String str) {
		String replace = null;
		switch (str) {
		case "1":
			replace = "I";
			break;
		case "2":
			replace = "Z";
			break;
		case "5":
			replace = "S";
			break;
		case "0":
			replace = "O";
			break;

		default:
			replace=str;
			break;
		}

		return replace;
	}

	public String replaceAlphaWithNum(String str) {
		String replace = null;
		switch (str) {
		case "I":
		case "l":
		case "i":
		case "L":
		case "T":
			replace = "1";
			break;
		case "Z":
		case "z":
			replace = "2";
			break;
		case "S":
		case "s":
			replace = "5";
			break;
		case "O":
		case "o":
		case "a":
		case "D":
		case "Q":
			replace = "0";
			break;
		case "R":
			replace="6";
			break;
		default:
			replace=str;
			break;
		}

		return replace;
	}
}
