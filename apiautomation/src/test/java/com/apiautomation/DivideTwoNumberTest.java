package com.apiautomation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import apiautomation.MyCalculator;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

@Epic("Calculator")
@DisplayName("Divide two numbers by using calculator")
public class DivideTwoNumberTest {

	@DisplayName("Divide two numbers")
	@Feature("using calcualtor function divide two numbers")
	@Description("Using calculator divide two numbers")
	@Step("Divide 6 and 3 number")
	@Test
	public void divideNumber() {
		MyCalculator calculate = new MyCalculator();
		assertThat(calculate.divideTwoNumbers(6, 3), equalTo(2));
	}

}
