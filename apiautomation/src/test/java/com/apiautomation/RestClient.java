package com.apiautomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestClient {
	public Response doGetStudentRequest(String request) {
		return RestAssured.given().when().get(request);
	}

	public Response doPostStudentRequest(String uri, Object body) {
		return RestAssured.given().contentType(ContentType.JSON).when().body(body).post(uri);
	}

	public Response doDeleteStudentRequest(String studentId) {
		return RestAssured.given().contentType(ContentType.JSON).when().delete(studentId);
	}

}
