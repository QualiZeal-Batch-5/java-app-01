package com.qualizeal;

import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;

public class App {
	public static void main(String[] args) {
		
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		long result = twoNonDecimalNumbersSum.add(2,3); 
		System.out.println(result);
		
	}
}