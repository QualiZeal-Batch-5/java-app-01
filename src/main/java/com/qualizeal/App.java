package com.qualizeal.javaapp01;
 
import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;
 
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		long result = twoNonDecimalNumbersSum.add(10,2);
        System.out.println(result);		
	}
}