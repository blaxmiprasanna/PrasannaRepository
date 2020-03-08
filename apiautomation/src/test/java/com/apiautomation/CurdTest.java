package com.apiautomation;

import org.junit.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

@Epic("Fetch all student information")
@DisplayName("Fetch all student details")
public class CurdTest extends TestBase {
	RequestFactory request = new RequestFactory();

	@DisplayName("Get Student Test")
	@Feature("Display student details")
	@Description("Test to fetch all student details from DB")
	@Step("Get all student details from DB")
	@Test
	public void getStudentDetails() throws Exception {
		initUrl();
		request.getAllStudent().then().log().body().statusCode(200);
		request.getAllStudent().then().log().all();

	}

}
