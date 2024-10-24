package com.qualizeal.javaapp01.operation;
public class TwoNonDecimalNumbersSum {
	public long add(int number1,int number2) {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}
		else if (number1 == 0 || number2 == 0) {
			return -2;
		}
		else {
			return number1 + number2;
		}
	}
}