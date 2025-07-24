package com.aurionpro.test;

public class SwapWithThirdVariable {
	public static void main(String[] args) {
		int numberOne = 4;
		int numberTwo = 2;
		int temporary = 0;

		temporary = numberOne;
		numberOne = numberTwo;
		numberTwo = temporary;
		System.out.println("NumberOne: " + numberOne + " NumhberTwo:" + numberTwo);

	}
}
