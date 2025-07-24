package com.aurionpro.trycatch.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number1;
		int number2;
		try {
			System.out.println("Enter a number1:");
			 number1 = scanner.nextInt();
			System.out.println("Enter a number2:");
			 number2 = scanner.nextInt();
			int result = number1 / number2;
			System.out.println("Result:" + result);

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e);
		};
	}
}
