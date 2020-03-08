package com.apiautomation;

import io.restassured.RestAssured;

public class TestBase {

	public void initUrl() throws Exception {
		try {
			ReadPropertyFile read = new ReadPropertyFile();
			RestAssured.baseURI = read.prop.getProperty("baseURI");
			String port = read.prop.getProperty("port");
			RestAssured.port = Integer.parseInt(port);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
