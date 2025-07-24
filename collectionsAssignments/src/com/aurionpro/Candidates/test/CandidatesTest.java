package com.aurionpro.Candidates.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Candidates.model.Candidates;
import com.aurionpro.Candidates.model.SortByName;

public class CandidatesTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Candidates> list = new ArrayList<Candidates>();
		while (true) {
			try {
				boolean isTrue = false;
				while (!isTrue) {
					System.out.println("--- Candidate Menu ---");
					System.out.println("1. Add Candidate");
					System.out.println("2. Display Candidates");
					System.out.println("3. Sort Candidates");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					int choice = scanner.nextInt();
					scanner.nextLine();
					switch (choice) {
					case 1:
						int n = 0;
						while (true) {
							try {
								System.out.print("How many candidates do you want to add? ");
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
							System.out.print("Enter name: ");
							String name = scanner.nextLine();

							while (true) {
								try {
									System.out.print("Enter age: ");
									int age = scanner.nextInt();
									scanner.nextLine();

									if (age <= 0) {
										System.out.println("Age should be greater than zero.");
										continue;
									}

									list.add(new Candidates(name, age));
									System.out.println("Candidate added successfully.");
									break;
								} catch (InputMismatchException e) {
									System.out.println("Please enter only integer value for age.");
									scanner.next();
								}
							}
						}
						break;

					case 2:
						if (list.size() == 0) {
							System.out.println("First Enter details of Candidates!");
							isTrue = false;
							break;
						} else {
							System.out.println(list);
							isTrue = false;
						}

						break;
					case 3:
						if (list.size() == 0) {
							System.out.println("First Enter details of Candidates!");
							isTrue = false;
							break;
						} else {
							Collections.sort(list, new SortByName());
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
