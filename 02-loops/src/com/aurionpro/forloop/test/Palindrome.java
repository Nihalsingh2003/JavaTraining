package com.aurionpro.forloop.test;

public class Palindrome {
	public static void main(String[] args) {
		int number = 242;
		int temporary = number;
		int reversedNumber = 0;
		for (int i = 0; i < temporary;) {
			int lastDigit = temporary % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temporary = temporary / 10;
		}
//	System.out.print(reversedNumber);
		if (reversedNumber == number) {
			System.out.print("number is palindrome");
		} else {
			System.out.print("number is not palindrome");
		}
	}
}
