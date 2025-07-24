package com.aurionpro.forloop.test;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 245;
		int reversedNumber = 0;
		for (int i = 0; i < number;) {
			int lastDigit = number % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			number = number / 10;
		}
		System.out.print("reversedNumber:" + reversedNumber);
	}
}
