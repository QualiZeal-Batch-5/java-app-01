package com.qualizeal;
import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;
 
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		long result1=twoNonDecimalNumbersSum.add(-1,0); 
		System.out.println(result1);
	}
}