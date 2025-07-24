package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class CurrencyDenominationProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter withdrawal amount:");
		int userEnteredAmount = scanner.nextInt();
		int count2000Notes = 0;
		int count500Notes = 0;
		int count200Notes = 0;
		int count100Notes = 0;

		if (userEnteredAmount > 50000) {
			System.out.println("Amount exceeds withdrwal limit of 50000.");
		} else if (userEnteredAmount % 100 != 0) {
			System.out.println("Amount should be in multiples of 100.");
		} else {

			// for 2000 notes
			count2000Notes = userEnteredAmount / 2000;
			userEnteredAmount = userEnteredAmount - (count2000Notes * 2000);

			// for 500 notes:
			count500Notes = userEnteredAmount / 500;
			userEnteredAmount = userEnteredAmount - (count500Notes * 500);

			// for 200 notes
			count200Notes = userEnteredAmount / 200;
			userEnteredAmount = userEnteredAmount - (count200Notes * 200);

			// for 100 notes
			count100Notes = userEnteredAmount / 100;
			userEnteredAmount = userEnteredAmount - (count100Notes * 100);

			if (count2000Notes > 0) {
				System.out.println("Two Thousand: " + count2000Notes);
			}
			if (count500Notes > 0) {
				System.out.println("Five Hundred: " + count500Notes);
			}
			if (count200Notes > 0) {
				System.out.println("Two Hundred: " + count200Notes);
			}
			if (count100Notes > 0) {
				System.out.println("One Hundred: " + count100Notes);
			}
		}
		scanner.close();

	}
}
