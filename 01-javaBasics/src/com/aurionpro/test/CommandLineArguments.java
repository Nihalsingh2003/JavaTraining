package com.aurionpro.test;

public class CommandLineArguments {
	public static void main(String[] args) {
		int numberOne = Integer.parseInt(args[0]);
		int numberTwo = Integer.parseInt(args[1]);

		System.out.print(numberOne + numberTwo);

	}
}
