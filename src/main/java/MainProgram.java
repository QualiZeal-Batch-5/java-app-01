package com.qualizeal.javaapp01.operation;
import com.qualizeal.javaapp01.operation.sum.TwoNonDecimalNumbersSum;
public class MainProgram {
	public static void main(String[] args){
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
		var result = twoNonDecimalNumbersSum.add(10,2);
		System.out.println(result);
	}
}
	