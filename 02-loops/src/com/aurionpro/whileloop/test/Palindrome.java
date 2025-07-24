package com.aurionpro.whileloop.test;

public class Palindrome {
	public static void main(String[] args) {
		int number = 121;
		int temporary = number;
		int reversedNumber = 0;
		while (temporary > 0) {
			int lastDigit = temporary % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temporary /= 10;
		}

		if (reversedNumber == number) {
			System.out.print("The number is palindrome");
		} else {
			System.out.print("The number is not palindrome");
		}
	}
}
