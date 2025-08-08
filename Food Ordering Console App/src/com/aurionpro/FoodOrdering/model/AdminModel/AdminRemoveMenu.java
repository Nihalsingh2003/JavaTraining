package com.aurionpro.FoodOrdering.model.AdminModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.FoodOrdering.model.FoodMenu;
import com.aurionpro.FoodOrdering.model.MenuStore;

public class AdminRemoveMenu {

	public static void removeMenu() {
		Scanner scanner = new Scanner(System.in);
		if (MenuStore.Menu.isEmpty()) {
			System.out.println("No Menu Available to remove please add some Menu");
			return;
		}
		HashMap<String, List<FoodMenu>> groupedMenu = new HashMap<>();

		for (FoodMenu result : MenuStore.Menu) {
			groupedMenu.computeIfAbsent(result.getFoodCategory(), k -> new ArrayList<>()).add(result);
		}

		List<String> category = new ArrayList<>(groupedMenu.keySet());

		while (true) {
			System.out.println("Please select a Category (or type 'q' to quit):");
			for (int i = 0; i < category.size(); i++) {
				System.out.println((i + 1) + ". " + category.get(i));
			}

			String choice = scanner.nextLine();

			if (choice.equalsIgnoreCase("q")) {
				System.out.println("Exiting menu.");
				break;
			}

			if (!choice.matches("\\d+")) {
				System.out.println("Invalid input. Please enter a number between 1 and " + category.size());
				continue;
			}

			int selectedIndex = Integer.parseInt(choice);
			if (selectedIndex < 1 || selectedIndex > category.size()) {
				System.out.println("Invalid choice. Please choose between 1 and " + category.size());
				continue;
			}

			String selectedCategory = category.get(selectedIndex - 1);
			List<FoodMenu> items = groupedMenu.get(selectedCategory);

			System.out.println("Menu Items in '" + selectedCategory + "':");
			for (int j = 0; j < items.size(); j++) {
				System.out.println((j + 1) + ". " + items.get(j));
			}

			System.out.print("Enter the number of the item you want to remove (or type 'q' to go back): ");
			String removeItemChoice = scanner.nextLine();

			if (removeItemChoice.equalsIgnoreCase("q")) {
				continue;
			}

			if (!removeItemChoice.matches("\\d+")) {
				System.out.println("Invalid input. Please enter a valid number.");
				continue;
			}

			int removeItemIndex = Integer.parseInt(removeItemChoice);
			if (removeItemIndex < 1 || removeItemIndex > items.size()) {
				System.out.println("Invalid choice. Please choose between 1 and " + items.size());
				continue;
			}

			FoodMenu itemToRemove = items.get(removeItemIndex - 1);
			MenuStore.Menu.remove(itemToRemove); 
			System.out.println("Item removed successfully: " + itemToRemove.getFoodName());

		}
	}
}
