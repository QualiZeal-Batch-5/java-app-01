package com.qualizeal.javaapp01.operation;

public class App{
	public static void main(String[] args){
		
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum =  new TwoNonDecimalNumbersSum();
		
		long result1 = twoNonDecimalNumbersSum.add(10,2);
		long result2 = twoNonDecimalNumbersSum.add(2,10);
		long result3 = twoNonDecimalNumbersSum.add(10,-2);
		long result4 = twoNonDecimalNumbersSum.add(-10,2);
		long result5 = twoNonDecimalNumbersSum.add(-10,-2);
		long result6 = twoNonDecimalNumbersSum.add(10,0);
		long result7 = twoNonDecimalNumbersSum.add(0,2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		
	}
}