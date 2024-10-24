package com.qualizeal.javaapp01.operation;

public class TwoNonDecimalNumbersSum {
	int result = 0;
	public long add(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			result = -2;
		}
		else if(num1 < 0 || num2 < 0) {
			result = -1;
		}
		else{
			result = num1 + num2;
		}
	return result;
	}
}
