package com.aurionpro.poly.model;

public class SafeCalculator {
	public int divide(int a, int b) {
		if (b != 0) {
			System.out.println("Result: " + (a / b));
		} else {
			System.out.println("Invalid");
		}
		return 1;
	}

	public int divide(double a, double b) {
		if (b != 0) {
			System.out.println("Result: " + (a / b));
		} else {
			System.out.println("Invalid");
		}
		return 1;
	}
}
