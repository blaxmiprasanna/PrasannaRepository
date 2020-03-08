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
@DisplayName("Multiply two numbers by using calculator")
public class MultiplyTwoNumberTest {

	@DisplayName("Multiply two numbers")
	@Feature("using calcualtor function multiply two numbers")
	@Description("Using calculator multiply two numbers")
	@Step("Multiply 6 and 3 number")
	@Test
	public void multiplyNumber() {
		MyCalculator calculate = new MyCalculator();
		assertThat(calculate.multiplyTwoNumbers(6, 3), equalTo(18));
	}

}
