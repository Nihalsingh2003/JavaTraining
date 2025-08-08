package com.aurionpro.FoodOrdering.model.AdminModel;

import com.aurionpro.FoodOrdering.model.FoodMenu;
import com.aurionpro.FoodOrdering.model.MenuStore;

import java.util.Scanner;

public class AdminAddMenu {

	public static void addMenu() {
		Scanner scanner = new Scanner(System.in);
		int itemCount;

		while (true) {
			System.out.println("How many food items do you want to add?");
			String input = scanner.nextLine();
			if (input.matches("\\d+")) {
				itemCount = Integer.parseInt(input);
				break;
			} else {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		}

		for (int i = 1; i <= itemCount; i++) {
			System.out.println("Enter details for food item #" + i);

			System.out.print("Enter food name: ");
			String foodNameInput = scanner.nextLine().trim();
			String foodName = formatString(foodNameInput);

			double foodPrice = 0.0;
			while (true) {
				System.out.print("Enter food price: ");
				String priceInput = scanner.nextLine();

				if (priceInput.matches("\\d+(\\.\\d+)?")) {
					foodPrice = Double.parseDouble(priceInput);
					break;
				} else {
					System.out.println("Invalid price. Please enter a valid number.");
				}
			}

			System.out.print("Enter food category: ");
			String foodCategoryInput = scanner.nextLine().trim();
			String foodCategory = formatString(foodCategoryInput);

			boolean alreadyExists = MenuStore.Menu.stream()
					.anyMatch(item -> item.getFoodName().equalsIgnoreCase(foodName)
							&& item.getFoodCategory().equalsIgnoreCase(foodCategory));

			if (alreadyExists) {
				System.out.println("This food item already exists in the '" + foodCategory + "' category. Skipping...");
				continue;
			}

			MenuStore.Menu.add(new FoodMenu(foodName, foodPrice, foodCategory));
			System.out.println("Food item added: " + foodName + " - $" + foodPrice + " (" + foodCategory + ")");
		}
	}

	private static String formatString(String input) {
		if (input == null || input.isEmpty())
			return input;
		return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
	}
}
