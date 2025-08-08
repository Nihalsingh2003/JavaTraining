package com.aurionpro.FoodOrdering.model.AdminModel;

import java.util.List;
import java.util.Scanner;

import com.aurionpro.FoodOrdering.model.DiscountManager;
import com.aurionpro.FoodOrdering.model.SimpleDiscountRule;

public class AdminDiscountManger {
	public static void adminDiscountManger() {
		Scanner scanner = new Scanner(System.in);
		DiscountManager discountManager = new DiscountManager();

		while (true) {
			System.out.println("\n--- Admin Discount Management ---");
			System.out.println("1. View Discount Rules");
			System.out.println("2. Add New Discount Rule");
			System.out.println("3. Update Discount Rule");
			System.out.println("4. Toggle Discount Active/Inactive");
			System.out.println("5. Remove Discount Rule");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			String choice = scanner.nextLine();

			switch (choice) {
			case "1":
				List<SimpleDiscountRule> rules = discountManager.getDiscountRules();
				if (rules.isEmpty()) {
					System.out.println("No discount rules available.");
				} else {
					System.out.println("Current Discount Rules:");
					for (int i = 0; i < rules.size(); i++) {
						System.out.println((i + 1) + ". " + rules.get(i));
					}
				}
				break;

			case "2": // Add
				double minAmount = 0;
				double percentage = 0;
				boolean active;

				while (true) {
					try {
						System.out.print("Enter minimum order amount: ₹");
						minAmount = Double.parseDouble(scanner.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Please enter a valid number for minimum order amount.");
					}
				}

				while (true) {
					try {
						System.out.print("Enter discount percentage: ");
						percentage = Double.parseDouble(scanner.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Please enter a valid number for discount percentage.");
					}
				}

				while (true) {
					System.out.print("Activate discount? (yes/no): ");
					String input = scanner.nextLine().toLowerCase();
					if (input.equals("yes")) {
						active = true;
						break;
					} else if (input.equals("no")) {
						active = false;
						break;
					} else {
						System.out.println("Please type 'yes' or 'no'.");
					}
				}

				discountManager.addDiscountRule(new SimpleDiscountRule(minAmount, percentage, active));
				break;

			case "3":
				int updateIndex = -1;
				while (true) {
					try {
						System.out.print("Enter rule number to update: ");
						updateIndex = Integer.parseInt(scanner.nextLine()) - 1;
						if (updateIndex >= 0 && updateIndex < discountManager.getDiscountRules().size())
							break;
						else
							System.out.println("Invalid rule number.");
					} catch (NumberFormatException e) {
						System.out.println("Please enter a valid rule number.");
					}
				}

				while (true) {
					try {
						System.out.print("Enter new minimum order amount: ₹");
						minAmount = Double.parseDouble(scanner.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Invalid amount. Please try again.");
					}
				}

				while (true) {
					try {
						System.out.print("Enter new discount percentage: ");
						percentage = Double.parseDouble(scanner.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Invalid percentage. Please try again.");
					}
				}

				while (true) {
					System.out.print("Activate discount? (yes/no): ");
					String input = scanner.nextLine().toLowerCase();
					if (input.equals("yes")) {
						active = true;
						break;
					} else if (input.equals("no")) {
						active = false;
						break;
					} else {
						System.out.println("Please type 'yes' or 'no'.");
					}
				}

				discountManager.updateDiscountRule(updateIndex, minAmount, percentage, active);
				break;

			case "4":
				int toggleIndex = -1;
				while (true) {
					try {
						System.out.print("Enter rule number to toggle active/inactive: ");
						toggleIndex = Integer.parseInt(scanner.nextLine()) - 1;
						if (toggleIndex >= 0 && toggleIndex < discountManager.getDiscountRules().size())
							break;
						else
							System.out.println("Invalid rule number.");
					} catch (NumberFormatException e) {
						System.out.println("Please enter a valid rule number.");
					}
				}
				discountManager.toggleDiscountActive(toggleIndex);
				break;

			case "5":
				int removeIndex = -1;
				while (true) {
					try {
						System.out.print("Enter rule number to remove: ");
						removeIndex = Integer.parseInt(scanner.nextLine()) - 1;
						if (removeIndex >= 0 && removeIndex < discountManager.getDiscountRules().size())
							break;
						else
							System.out.println("Invalid rule number.");
					} catch (NumberFormatException e) {
						System.out.println("Please enter a valid rule number.");
					}
				}
				discountManager.removeDiscountRule(removeIndex);
				break;

			case "6":
				System.out.println("Exiting admin discount manager.");
				
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
			if("6".equals(choice)) {
				break;
			}
		}
	}
}
