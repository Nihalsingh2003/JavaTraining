package com.aurionpro.Flights.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Flights.model.Flights;
import com.aurionpro.Flights.model.SortByFare;

public class FlightsTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Flights> list = new ArrayList<Flights>();
		while (true) {
			try {
				boolean isTrue = false;
				while (!isTrue) {
					System.out.println("--- Flights Menu ---");
					System.out.println("1. Add Flight");
					System.out.println("2. Display Flight");
					System.out.println("3. Sort Flight");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					int choice = scanner.nextInt();
					scanner.nextLine();
					switch (choice) {
					case 1:
						int n = 0;
						while (true) {
							try {
								System.out.print("How many Flights do you want to add? ");
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
							System.out.println("Enter the Details of Flight-"+(i+1));
							System.out.print("Enter Flight name: ");
							String name = scanner.nextLine();

							while (true) {
								try {
									System.out.print("Enter Flight Fare: ");
									int fare = scanner.nextInt();
									scanner.nextLine();

									if (fare <= 0) {
										System.out.println("Fare should be greater than zero.");
										continue;
									}

									list.add(new Flights(name, fare));
									System.out.println("Flight added successfully.");
									break;
								} catch (InputMismatchException e) {
									System.out.println("Please enter only integer value for Fare.");
									scanner.next();
								}
							}
						}
						break;

					case 2:
						if (list.size() == 0) {
							System.out.println("First Enter details of Flights!");
							isTrue = false;
							break;
						} else {
							System.out.println(list);
							isTrue = false;
						}

						break;
					case 3:
						if (list.size() == 0) {
							System.out.println("First Enter details of Flight!");
							isTrue = false;
							break;
						} else {
							System.out.println("Sort Flights by Fare (Descending) completed");
							Collections.sort(list, new SortByFare());
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
