package com.aurionpro.test;

public class LeapYearProgram {
	public static void main(String[] args) {
		int year = 2004;

		if (year % 4 == 0 && year % 400 == 0 && year % 100 == 0) {
			System.out.print("It is  a leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.print("It is  a leap year");

		} else {
			System.out.print("it is not a leap year");
		}
	}
}
