package com.aurionpro.Transactions.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Transactions.model.SortByAmount;
import com.aurionpro.Transactions.model.Transactions;

public class TransactionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Transactions> list = new ArrayList<Transactions>();
		while (true) {
			try {
				boolean isTrue = false;
				while (!isTrue) {
					System.out.println("--- Transaction Menu ---");
					System.out.println("1. Add Transaction");
					System.out.println("2. Display Transaction");
					System.out.println("3. Sort Transaction");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					int choice = scanner.nextInt();
					scanner.nextLine();
					switch (choice) {
					case 1:
						int n = 0;
						while (true) {
							try {
								System.out.print("How many Transaction do you want to add? ");
								n = scanner.nextInt();
								scanner.nextLine();

								if (n <= 0) {
									System.out.println("Please enter a number greater than 0.");
								} else {
									break;
								}
							} catch (InputMismatchException e) {
								System.out.println("Invalid input. Please enter a valid number.");
								scanner.next();
							}
						}
						for (int i = 0; i < n; i++) {
							System.out.println("Enter the Details of Transaction-" + (i + 1));

							while (true) {
								try {
									int id;
									double amount;

									while (true) {
										try {
											System.out.print("Enter Transaction ID: ");
											id = scanner.nextInt();
											if (id <= 0) {
												System.out.println("ID should be greater than zero.");
												continue;
											}
											break;
										} catch (InputMismatchException e) {
											System.out.println("Invalid input. Please enter a valid integer for ID.");
											scanner.next();
										}
									}

									while (true) {
										try {
											System.out.print("Enter Transaction Amount: ");
											amount = scanner.nextDouble();
											if (amount <= 0) {
												System.out.println("Amount should be greater than zero.");
												continue;
											}
											break;
										} catch (InputMismatchException e) {
											System.out
													.println("Invalid input. Please enter a valid number for amount.");
											scanner.next();
										}
									}

									list.add(new Transactions(id, amount));
									System.out.println("Transaction added successfully.");
									break;

								} catch (Exception e) {
									System.out.println("Unexpected error occurred: " + e);
									scanner.next();
								}
							}
						}
						break;

					case 2:
						if (list.size() == 0) {
							System.out.println("First Enter details of Transactions!");
							isTrue = false;
							break;
						} else {
							System.out.println(list);
							isTrue = false;
						}

						break;
					case 3:
						if (list.size() == 0) {
							System.out.println("First Enter details of Transactions!");
							isTrue = false;
							break;
						} else {
							System.out.println("Sort Transactions by Amount (Descending),sort by id completed");
							Collections.sort(list, new SortByAmount());
							System.out.println(list);
							isTrue = false;
						}
						break;
					case 4:
						System.out.println("Exiting program. Goodbye!");
						return;
					}

				}

			} catch (InputMismatchException e) {
				System.out.println("Please enter only integer value" + e);
				scanner.next();

			}
		}
	}
}
