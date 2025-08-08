package com.aurionpro.FoodOrdering.model;

import java.util.ArrayList;
import java.util.List;

public class MenuStore {
	public static List<FoodMenu> Menu = new ArrayList<>();

	static {
		if (Menu.isEmpty()) {
			Menu.add(new FoodMenu("Veg Sandwich", 4.99, "Fast Food"));
			Menu.add(new FoodMenu("French Fries", 2.99, "Fast Food"));
			Menu.add(new FoodMenu("Cheese Pizza", 8.50, "Fast Food"));
			Menu.add(new FoodMenu("Chocolate Shake", 3.25, "Fast Food"));

			Menu.add(new FoodMenu("Veg Hakka Noodles", 6.50, "Chinese"));
			Menu.add(new FoodMenu("Spring Rolls", 4.75, "Chinese"));
			Menu.add(new FoodMenu("Fried Rice", 5.99, "Chinese"));
			Menu.add(new FoodMenu("Schezwan Paneer", 7.25, "Chinese"));
		}
	}
}
