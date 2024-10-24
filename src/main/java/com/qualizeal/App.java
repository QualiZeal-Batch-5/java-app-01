package com.qualizeal.javaapp01;
import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;
 
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		long result1 = twoNonDecimalNumbersSum.add(100,20);
		System.out.println(result1);
		long result2 = twoNonDecimalNumbersSum.add(10,20);
		System.out.println(result2);		
	}
}