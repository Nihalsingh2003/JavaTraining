package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.SafeCalculator;

public class SafeCalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number in integer");
		int a = scanner.nextInt();
		System.out.println("Enter the number in integer");
		int b = scanner.nextInt();
		System.out.println("Enter the number in double");
		double number1 = scanner.nextDouble();
		System.out.println("Enter the number in double");
		double number2 = scanner.nextDouble();
		SafeCalculator safeCalculator = new SafeCalculator();
		safeCalculator.divide(a, b);
		safeCalculator.divide(number1, number2);
		scanner.close();
	}
}
