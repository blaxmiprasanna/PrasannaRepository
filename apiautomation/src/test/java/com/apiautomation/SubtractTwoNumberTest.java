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
@DisplayName("Subtract two numbers by using calculator")
public class SubtractTwoNumberTest {

	@DisplayName("Subtract two numbers")
	@Feature("using calcualtor function subtract two numbers")
	@Description("Using calculator subtract two numbers")
	@Step("Subtract 6 and 3 number")
	@Test
	public void subtractTwoNumber() {
		MyCalculator calculate = new MyCalculator();
		calculate.addTwoNumbers(6, 3);
		assertThat(calculate.subtractTwoNumbers(6, 3), equalTo(3));
	}

}
