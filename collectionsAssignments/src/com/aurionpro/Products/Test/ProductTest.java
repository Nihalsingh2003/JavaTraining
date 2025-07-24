package com.aurionpro.Products.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Products.model.Product;
import com.aurionpro.Products.model.SortByPrice;
import com.aurionpro.Products.model.SortBycategory;

public class ProductTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Product> list = new ArrayList<Product>();
		while (true) {
			try {
				boolean isTrue = false;
				while (!isTrue) {
					System.out.println("--- Product Menu ---");
					System.out.println("1. Add Products");
					System.out.println("2. Display Products");
					System.out.println("3. Sort Products");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					int choice = scanner.nextInt();
					scanner.nextLine();
					switch (choice) {
					case 1:
						int n = 0;
						while (true) {
							try {
								System.out.print("How many Products do you want to add? ");
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
							System.out.println("Enter the Details of Products-" + (i + 1));
							System.out.print("Enter Product category: ");
							String category = scanner.nextLine();
							System.out.print("Enter Product name: ");
							String name = scanner.nextLine();

							while (true) {
								try {
									System.out.print("Enter Product price: ");
									int price = scanner.nextInt();
									scanner.nextLine();

									if (price <= 0) {
										System.out.println("Please enter a valid price ");
										continue;
									}

									list.add(new Product(category, name, price));
									System.out.println("Product added successfully.");
									break;
								} catch (InputMismatchException e) {
									System.out.println("Please enter only integer value for Price.");
									scanner.next();
								}
							}
						}
						break;

					case 2:
						if (list.size() == 0) {
							System.out.println("First Enter details of Product!");
							isTrue = false;
							break;
						} else {
							System.out.println(list);
							isTrue = false;
						}

						break;
					case 3:
						if (list.size() == 0) {
							System.out.println("First enter details of products!");
							break;
						}

						// new arraylist for categories
						ArrayList<String> categories = new ArrayList<>();
						for (Product result : list) {
							if (!categories.contains(result.getCategory().toLowerCase())) {
								categories.add(result.getCategory().toLowerCase());
							}
						}

						System.out.println("--- Available Categories ---");
						for (String category : categories) {
							System.out.println("- " + category);
						}
						String selectedCategory = "";
						while (true) {
							System.out.print("Enter a valid category to sort: ");
							selectedCategory = scanner.nextLine().toLowerCase();
							if (categories.contains(selectedCategory)) {
								break;
							} else {
								System.out.println("Invalid category. Please try again.");
							}
						}

//						ArrayList<Product> filteredList = new ArrayList<>();
//						for (Product result : list) {
//							if (result.getCategory().equalsIgnoreCase(selectedCategory)) {
//								filteredList.add(result);
//							}
//						}
						Collections.sort(list,new SortBycategory());

						Collections.sort(list, new SortByPrice());
						System.out.println(list);

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
