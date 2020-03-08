package com.apiautomation;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

	Properties prop;
	FileInputStream fis;
	String File = "C:\\Users\\blaxm\\workspace\\apiautomation\\application.properties";

	public ReadPropertyFile() throws Exception {
		prop = new Properties();
		fis = new FileInputStream(File);
		prop.load(fis);
	}

}
