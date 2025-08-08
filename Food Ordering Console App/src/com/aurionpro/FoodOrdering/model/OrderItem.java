package com.aurionpro.FoodOrdering.model;

public class OrderItem {
	private String itemName;
	private double unitPrice;
	private int quantity;

	public OrderItem(String itemName, double unitPrice, int quantity) {
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return unitPrice * quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}
}
