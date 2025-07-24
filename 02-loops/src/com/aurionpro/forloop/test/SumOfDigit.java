package com.aurionpro.forloop.test;

public class SumOfDigit {
	public static void main(String[] args) {
		int number = 105;
		int sum = 0;
		for (int i = 0; i < number;) {
			int lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;

		}
		System.out.print("SumOfDigit:" + sum);
	}
}
