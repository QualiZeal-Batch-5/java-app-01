package com.qualizeal;

import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;
 
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		long result1 = twoNonDecimalNumbersSum.add(10, 2);
		System.out.println(result1);
		long result2 = twoNonDecimalNumbersSum.add(2, 10);
		System.out.println(result2);

	}
}