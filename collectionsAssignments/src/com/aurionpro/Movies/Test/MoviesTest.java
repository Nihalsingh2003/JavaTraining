package com.aurionpro.Movies.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Movies.model.Movies;
import com.aurionpro.Movies.model.SortByYear;

public class MoviesTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Movies> list = new ArrayList<Movies>();
		while (true) {
			try {
				boolean isTrue = false;
				while (!isTrue) {
					System.out.println("--- Movies Menu ---");
					System.out.println("1. Add Movies");
					System.out.println("2. Display Movies");
					System.out.println("3. Sort Movies");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					int choice = scanner.nextInt();
					scanner.nextLine();
					switch (choice) {
					case 1:
						int n = 0;
						while (true) {
							try {
								System.out.print("How many Movies do you want to add? ");
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
							System.out.println("Enter the Details of Movies-"+(i+1));
							System.out.print("Enter Movie name: ");
							String name = scanner.nextLine();

							while (true) {
								try {
									System.out.print("Enter Movie Year: ");
									int year = scanner.nextInt();
									scanner.nextLine();

									 int currentYear = Calendar.getInstance().get(Calendar.YEAR);

						                if (year < 1900 || year > currentYear) {
						                    System.out.println("Please enter a valid year between 1900 and " + currentYear + ".");
						                    continue;
						                }

									list.add(new Movies(name, year));
									System.out.println("Movie added successfully.");
									break;
								} catch (InputMismatchException e) {
									System.out.println("Please enter only integer value for Year.");
									scanner.next();
								}
							}
						}
						break;

					case 2:
						if (list.size() == 0) {
							System.out.println("First Enter details of Movies!");
							isTrue = false;
							break;
						} else {
							System.out.println(list);
							isTrue = false;
						}

						break;
					case 3:
						if (list.size() == 0) {
							System.out.println("First Enter details of Movies!");
							isTrue = false;
							break;
						} else {
							System.out.println("Sort Movies by Year and Title completed");
							Collections.sort(list, new SortByYear());
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
