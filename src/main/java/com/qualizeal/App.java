package com.qualizeal;
import com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum;
public class App {
	public static void main(String[] args) {

		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		long res1 = twoNonDecimalNumbersSum.add(10,2);
		System.out.println(res1);
		long res2 = twoNonDecimalNumbersSum.add(10,-1);
		System.out.println(res2);
		long res3 = twoNonDecimalNumbersSum.add(0,16);
		System.out.println(res3);
	}
}