package com.qualizeal.javaapp01;

import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum sum = new TwoNonDecimalNumbersSum();
		System.out.println(sum.add(10, 20));
		System.out.println(sum.add(0, 12));
		System.out.println(sum.add(2, -90));
	}
}