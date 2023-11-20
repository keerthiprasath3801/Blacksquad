package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utilityclass {
	public String url;
	public String EmailId;
	public String Password;
 
	public utilityclass() {
		data();
	}
	public void data() {
		File file = new File("C:\\BlackSquad_PilotProject\\BlackSquad_PilotProject_1\\Thomascook\\src\\test\\resources\\features\\login.feature");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		EmailId = prop.getProperty("EmailId");
		Password = prop.getProperty("Password");
	}
}
