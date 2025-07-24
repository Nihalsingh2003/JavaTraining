package com.aurionpro.abstraction.test;

import java.util.Scanner;

import com.aurionpro.abstraction.model.CommercialCustomer;
import com.aurionpro.abstraction.model.CustomerType;
import com.aurionpro.abstraction.model.ResidentialCustomer;

public class CustomerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput;
		ResidentialCustomer[] residentialCustomer = new ResidentialCustomer[3];
		CommercialCustomer[] commercialCustomer=new CommercialCustomer[3];
		while (true) {
			System.out.println("Please Select CustomerType 1-2:");
			for (CustomerType result : CustomerType.values()) {
				System.out.println(result.ordinal() + 1 + "." + result);
			}
			if (scanner.hasNextInt()) {
				userInput = scanner.nextInt();
				if (userInput == 1 || userInput == 2) {
					break;
				} else {
					System.out.println("Invalid option. Please enter 1 or 2.\n");
				}
			} else {
				System.out.println("Invalid input. Please enter a number (1 or 2).\n");

			}

		}
		scanner.nextLine();
		switch (userInput) {
		case 1:
			String name = null;
			for (int i = 0; i < residentialCustomer.length; i++) {

				// Validate Name
				while (true) {
					System.out.println("Enter  Name:");
					name = scanner.nextLine();

					boolean hasDigit = false;
					for (int j = 0; j < name.length(); j++) {
						if (Character.isDigit(name.charAt(j))) {
							hasDigit = true;
							break;
						}
					}

					if (hasDigit) {
						System.out.println("Invalid name. Name should not contain numbers. Please try again.");
					} else if (name.trim().isEmpty()) {
						System.out.println("Name cannot be empty. Please enter a valid name.");
					} else {
						break;
					}
				}

				System.out.println("Enter unitsConsumed");
				double unitsConsumed = scanner.nextDouble();
				scanner.nextLine();

				residentialCustomer[i] = new ResidentialCustomer(name, unitsConsumed);
				residentialCustomer[i].calculateBill();
			}
			break;
		case 2:
			String commercialName = null;
			for (int i = 0; i < residentialCustomer.length; i++) {

				// Validate Name
				while (true) {
					System.out.println("Enter Name:");
					name = scanner.nextLine();

					boolean hasDigit = false;
					for (int j = 0; j < name.length(); j++) {
						if (Character.isDigit(name.charAt(j))) {
							hasDigit = true;
							break;
						}
					}

					if (hasDigit) {
						System.out.println("Invalid name. Name should not contain numbers. Please try again.");
					} else if (name.trim().isEmpty()) {
						System.out.println("Name cannot be empty. Please enter a valid name.");
					} else {
						break;
					}
				}

				System.out.println("Enter unitsConsumed");
				double unitsConsumed = scanner.nextDouble();
				scanner.nextLine();

				commercialCustomer[i] = new CommercialCustomer(commercialName, unitsConsumed);
				commercialCustomer[i].calculateBill();
			}

		}
	}
}
