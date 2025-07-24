package com.aurionpro.whileloop.test;

public class SumOfDigit {
public static void main(String[] args) {
	int number=26;
	int sumOfDigit=0;
	while(number>0) {
		int lastDigit=number%10;
		sumOfDigit+=lastDigit;
		number/=10;
	}
	System.out.print("SumofDigit: " + sumOfDigit);
}
}
