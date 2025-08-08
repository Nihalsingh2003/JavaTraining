package com.aurionpro.FoodOrdering.model;

public class FoodMenu {

	private String foodName;
	private double foodPrice;
	private String foodCategory;

	public FoodMenu(String foodName, double foodPrice, String foodCategory) {

		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodCategory = foodCategory;
	}

	public String getFoodName() {
		return foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	@Override
	public String toString() {
		return "foodName=" + foodName + ", foodPrice=" + "$" + foodPrice;
	}

}
