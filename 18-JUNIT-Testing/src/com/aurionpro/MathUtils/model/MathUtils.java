package com.aurionpro.MathUtils.model;

public class MathUtils {
	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}
}
