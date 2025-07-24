package com.aurionpro.forloop.test;

public class ArmstrongNumberProgram {
	public static void main(String[] args) {
		int number = 153;
		int originalNumber = number;
		int lengthOfNumber = String.valueOf(number).length();
		int sum = 0;
		for (int i = 0; i <= lengthOfNumber; i++) {
			int lastDigit = number % 10;
			sum = sum + (int) Math.pow(lastDigit, lengthOfNumber);
			number /= 10;
		}
		System.out.print(sum);
		if (sum == originalNumber) {
			System.out.print("The number is Armstrong");
		} else {
			System.out.print("The number is not Armstrong");
		}
	}
}
