package com.qualizeal.javaapp01.operation;

public class App {
	
	public static void main(String[] args) {
		
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum() ;

		var result1 = twoNonDecimalNumbersSum.add(10,2);
		var result2 = twoNonDecimalNumbersSum.add(2,10);
		var result3 = twoNonDecimalNumbersSum.add(10,-2);
		var result4 = twoNonDecimalNumbersSum.add(-10,2);
		var result5 = twoNonDecimalNumbersSum.add(-10,-2);
		var result6 = twoNonDecimalNumbersSum.add(10,0);
		var result7 = twoNonDecimalNumbersSum.add(0,2);
		var result8 = twoNonDecimalNumbersSum.add(0,0);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
	}
}
		
		