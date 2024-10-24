package com.qualizeal.javaapp01.operation;

public class TwoNonDecimalNumbersSum{
	public long add(int num1,int num2){
	
		if(num1==0||num2==0)
			return -2;
		if(num1<0||num2<0)
			return -1;
		long result = num1+num2;
	
		return result;
    }
}