package apiautomation;

import io.qameta.allure.Step;

public class MyCalculator {

	int number1;
	int number2;

	@Step("Add two number: {0} & {1}")
	public int addTwoNumbers(int number1, int number2) {
		return number1 + number2;
	}

	@Step("Subtract two number: {0} & {1}")
	public int subtractTwoNumbers(int number1, int number2) {
		return number1 - number2;
	}

	@Step("Divide two number: {0} & {1}")
	public int divideTwoNumbers(int number1, int number2) {
		return number1 / number2;
	}

	@Step("Multiply two number: {0} & {1}")
	public int multiplyTwoNumbers(int number1, int number2) {
		return number1 * number2;
	}
}
