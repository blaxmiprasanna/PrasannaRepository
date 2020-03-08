package com.apiautomation;

import java.util.List;

import io.restassured.response.Response;

public class RequestFactory {
	RestClient restClient = new RestClient();

	public Response getAllStudent() {
		Response responses = restClient.doGetStudentRequest("/list");
		return responses;
	}

	public Response CreateNewClient(String URL, String firstName, String lastName, String email, String programme,
			List<String> courses) {
		StudentPojo body = new StudentPojo();
		body.setFirstName(firstName);
		body.setLastName(lastName);
		body.setEmail(email);
		body.setProgramme(programme);
		body.setCourses(courses);
		return restClient.doPostStudentRequest(URL, body);
	}

	public Response deleteStudentDetails(String studentId) {
		Response responses = restClient.doDeleteStudentRequest("/" + studentId);
		return responses;
	}
}
