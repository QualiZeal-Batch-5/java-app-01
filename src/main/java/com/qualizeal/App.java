package com.qualizeal;

import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		System.out.println(twoNonDecimalNumbersSum.add(10, 2));
		System.out.println(twoNonDecimalNumbersSum.add(10, 0));
		System.out.println(twoNonDecimalNumbersSum.add(-10, 2));
	}
}