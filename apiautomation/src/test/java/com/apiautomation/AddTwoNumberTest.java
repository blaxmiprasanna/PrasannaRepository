package com.apiautomation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import apiautomation.MyCalculator;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;

@Epic("Calculator")
@DisplayName("Add two numbers by using calculator")
public class AddTwoNumberTest {

	@DisplayName("Add two numbers")
	@Feature("using calcualtor function add two numbers")
	@Description("Using calculator add two numbers")
	@Test
	public void addNumber() {
		MyCalculator calculate = new MyCalculator();
		assertThat(calculate.addTwoNumbers(2, 3), equalTo(5));
	}

}
