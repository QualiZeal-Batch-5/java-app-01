package com.qualizeal.javaapp01.operation;

public class TwoNonDecimalNumbersSum {
	public long add(int num1, int num2) {
		long result = num1 + num2;
		if(num1 == 0 || num2 == 0) {
			result = -2;
		}
		if(num1 < 0 || num2 < 0) {
			result = -1;
		}
		return result;
	}
}