package com.aurionpro.EcommerceTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Ecommercemodel.CreditCard;
import com.aurionpro.Ecommercemodel.IPaymentGateway;
import com.aurionpro.Ecommercemodel.NetBanking;
import com.aurionpro.Ecommercemodel.UPI;

public class Checkout {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IPaymentGateway iPaymentGateway = null;
		double userEnteredAmount;
		boolean isTrue = false;
		while (!isTrue) {
			try {
				System.out.println("Please select the Payment Method:");
				System.out.println("1. CreditCard");
				System.out.println("2. UPI");
				System.out.println("3. NetBanking");
				System.out.println("4. Exit");
				int userInput = scanner.nextInt();

				switch (userInput) {
				case 1:
					iPaymentGateway = new CreditCard();
					break;
				case 2:
					iPaymentGateway = new UPI();
					break;
				case 3:
					iPaymentGateway = new NetBanking();
					break;
				case 4:
					System.out.println("Exiting program. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Please select 1, 2, or 3.");
					continue;
				}

				while (true) {
					try {
						System.out.println("Please enter the Amount to Pay:");
						userEnteredAmount = scanner.nextDouble();
						if (userEnteredAmount < 0) {
							System.out.println("Amount cannot be less than zero. Try again!");
						} else {
							System.out.println("Processing payment of " + userEnteredAmount);
							int result = iPaymentGateway.pay(userEnteredAmount);

							if (result != 0) {

								iPaymentGateway.cashBack(userEnteredAmount);
								System.out.println("------------------------");
								isTrue = false;
								break;

							} else {
								System.out.println("Payment Failed. Please try again.");
								break;
							}
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input. Please enter a numeric amount.");
						scanner.next();
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer value." + e);
				scanner.next();
			}
		}
	}
}
