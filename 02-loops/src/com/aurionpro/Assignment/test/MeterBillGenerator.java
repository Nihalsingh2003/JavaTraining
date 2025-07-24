package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class MeterBillGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter the number of units consumed:");
		int unitConsumedByUser = scanner.nextInt();

		int meterCharge = 75;
		int charge = 0;
		int totalWaterBill = 0;
		if (unitConsumedByUser <= 100) {
			charge = unitConsumedByUser * 5;

		} else {
			if (unitConsumedByUser <= 250) {
				charge = unitConsumedByUser * 10;

			} else {
				charge = unitConsumedByUser * 20;

			}
		}
		totalWaterBill = charge + meterCharge;
		System.out.print("Your Total water Bill is: " + totalWaterBill);
		scanner.close();

	}
}
