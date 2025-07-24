package com.auriopro.interfaces.accountOperations.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.auriopro.interfaces.accountOperations.model.CurrentAccount;
import com.auriopro.interfaces.accountOperations.model.IAccountOperations;
import com.auriopro.interfaces.accountOperations.model.LoanAccount;
import com.auriopro.interfaces.accountOperations.model.SavingsAccount;

public class AccountOperationsTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IAccountOperations iaccountOperations = null;
		int operationType;
		int userInput;
		while (true) {
			try {
				System.out.println("Please select the AccountType;");
				System.out.println("1.SavingsAccount");
				System.out.println("2.CurrentAccount");
				System.out.println("3.LoanAccount");
				System.out.println("4.EXIT");
				userInput = scanner.nextInt();

				switch (userInput) {
				case 1:
					iaccountOperations = new SavingsAccount();
					break;

				case 2:
					iaccountOperations = new CurrentAccount();
					break;
				case 3:
					iaccountOperations = new LoanAccount();
					break;
				case 4:
					System.out.println("Exiting program. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Please select 1, 2, or 3.\n");
					continue;

				}
				boolean istrue = false;
				while (!istrue) {
					while (true) {
						try {
							System.out.println("Please select one option from below");
							System.out.println("1.deposit");
							System.out.println("2.withdraw");
							System.out.println("3.checkBalance");
							System.out.println("4.EXIT");
							operationType = scanner.nextInt();
							if (operationType == 1 || operationType == 2 || operationType == 3||operationType == 4) {
								break;
							} else {
								System.out.println("Invalid option. Please enter 1-3.\n");
							}
						} catch (InputMismatchException e) {
							System.out.println(e + ":Please enter only integer value");
							scanner.next();
						}

					}

					if (operationType == 1) {
						double userEnteredAmmount;

						while (true) {
							try {
								System.out.println("Please enter the Amount");
								userEnteredAmmount = scanner.nextDouble();
								if (userEnteredAmmount < 0) {
									System.out.println("Can not enter less then zero,Try again!");
								} else {
									iaccountOperations.deposit(userEnteredAmmount);

									istrue = false;
									break;
								}
							} catch (InputMismatchException e) {
								System.out.println(e + ":Please enter Amount in Number");
								scanner.next();
							}

						}

					} else if (operationType == 2) {
						double userEnteredAmmount;

						while (true) {
							try {
								System.out.println("Please enter the Amount");
								userEnteredAmmount = scanner.nextDouble();
								if (userEnteredAmmount < 0) {
									System.out.println("Amount Can not enter less then zero,Try again!");
								} else {
									int result = iaccountOperations.withdraw(userEnteredAmmount);
									if (result != 0) {
										System.out.println("Withdrawal successful. Exiting...");
										istrue = false;
										break;
									}
									
								}
							} catch (InputMismatchException e) {
								System.out.println(e + ":Please enter Amount in Number");
								scanner.next();
							}

						}

					} else if (operationType == 3) {
						iaccountOperations.checkBalance();
						istrue = false;
						
					}else {
						break;
					}
				}

			} catch (InputMismatchException e) {
				System.out.println(e + ":Please enter only integer value");
				scanner.next();
			}
		}

	}
}
