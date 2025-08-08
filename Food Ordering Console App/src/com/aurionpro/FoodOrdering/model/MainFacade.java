package com.aurionpro.FoodOrdering.model;

import java.util.Scanner;

import com.aurionpro.FoodOrdering.model.AdminModel.AdminAddMenu;
import com.aurionpro.FoodOrdering.model.AdminModel.AdminDiscountManger;
import com.aurionpro.FoodOrdering.model.AdminModel.AdminRemoveMenu;

public class MainFacade {

	public void start() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to the Food Ordering System!");
			System.out.println("Please choose an option:");
			System.out.println("1. Admin");
			System.out.println("2. Customer");
			System.out.println("3. Exit");

			System.out.print("Enter your choice (1, 2, or 3): ");
			String input = scanner.nextLine();

			switch (input) {
			case "1":
				System.out.println("You selected Admin.");
				while (true) {
					System.out.println("\n--- Admin Menu ---");
					System.out.println("1. Manage Menu");
					System.out.println("2. Manage Discount");
					System.out.println("3. Manage Delivery Agent");
					System.out.println("4. Back to Main Menu");

					System.out.print("Enter your choice (1-4): ");
					String choice = scanner.nextLine();

					switch (choice) {
					case "1":
						System.out.println("You chose Manage Menu.");
						while (true) {
							System.out.println("\n--- Admin Menu ---");
							System.out.println("1. Add Menu");
							System.out.println("2. Remove Menu");
							System.out.println("3. Show Menu");
							System.out.println("4. Exit");

							System.out.print("Enter your choice (1-2): ");
							String mangeMenu = scanner.nextLine();
							switch (mangeMenu) {
							case "1":
								AdminAddMenu.addMenu();
								break;
							case "2":
								AdminRemoveMenu.removeMenu();
								break;
							case "3":
								ShownMenu.showMenu();
								break;
							case "4":
								break;
							default:
								System.out.println("Invalid choice. Please enter 1, 2 ,3 or 4");
							}
							if ("4".equals(mangeMenu)) {
								break;

							}
						}

						break;
					case "2":
						System.out.println("You chose Manage Discount.");
						AdminDiscountManger.adminDiscountManger();

						break;
					case "3":
						System.out.println("You chose Manage Delivery Agent.");

						break;
					case "4":
						System.out.println("Returning to Main Menu...");
						break;
					default:
						System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
					}
					if ("4".equals(choice)) {
						break;
					}
					System.out.println();
				}

				break;
			case "2":
				System.out.println(" You selected Customer.");

				break;
			case "3":
				System.out.println("Exiting the program. Goodbye!");
				return;
			default:
				System.out.println("Invalid choice. Please enter 1, 2, or 3.\n");
			}

			System.out.println();
		}
	}
}