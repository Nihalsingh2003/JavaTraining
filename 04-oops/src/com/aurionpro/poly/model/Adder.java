package com.aurionpro.poly.model;

public class Adder {
	int number1;
	int number2;
	int number3;

	double number5;
	double number6;

	public int add(int number1, int number2) {
		return number1 + number2;
	}

	public int add(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

	public double add(double number5, double number6) {
		return number5 + number6;
	}

}
