package com.aurionpro.FoodOrdering.model;

public class SimpleDiscountRule {
	private double minOrderAmount;
	private double discountPercentage;
	private boolean isActive;

	public SimpleDiscountRule(double minOrderAmount, double discountPercentage, boolean isActive) {
		this.minOrderAmount = minOrderAmount;
		this.discountPercentage = discountPercentage;
		this.isActive = isActive;
	}

	public double getMinOrderAmount() {
		return minOrderAmount;
	}

	public void setMinOrderAmount(double minOrderAmount) {
		this.minOrderAmount = minOrderAmount;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	@Override
	public String toString() {
		return String.format("MinOrder=₹%.2f, Discount=%.2f%%, Active=%s", minOrderAmount, discountPercentage,
				isActive);
	}
}
