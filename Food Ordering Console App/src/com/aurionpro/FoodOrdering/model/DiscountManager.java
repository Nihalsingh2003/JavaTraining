package com.aurionpro.FoodOrdering.model;

import java.util.ArrayList;
import java.util.List;

public class DiscountManager {
	private List<SimpleDiscountRule> discountRules;

	public DiscountManager() {
		discountRules = new ArrayList<>();

		discountRules.add(new SimpleDiscountRule(500.0, 10.0, true));
	}

	public List<SimpleDiscountRule> getDiscountRules() {
		return discountRules;
	}

	public void addDiscountRule(SimpleDiscountRule rule) {
		discountRules.add(rule);
		System.out.println("Discount rule added.");
	}

	public void removeDiscountRule(int index) {
		if (index >= 0 && index < discountRules.size()) {
			discountRules.remove(index);
			System.out.println("Discount rule removed.");
		} else {
			System.out.println("Invalid index.");
		}
	}

	public void updateDiscountRule(int index, double minAmount, double percentage, boolean active) {
		if (index >= 0 && index < discountRules.size()) {
			SimpleDiscountRule rule = discountRules.get(index);
			rule.setMinOrderAmount(minAmount);
			rule.setDiscountPercentage(percentage);
			rule.setActive(active);
			System.out.println("Discount rule updated.");
		} else {
			System.out.println("Invalid index.");
		}
	}

	public void toggleDiscountActive(int index) {
		if (index >= 0 && index < discountRules.size()) {
			SimpleDiscountRule rule = discountRules.get(index);
			rule.setActive(!rule.isActive());
			System.out.println("Discount rule is now " + (rule.isActive() ? "Active" : "Inactive"));
		} else {
			System.out.println("Invalid index.");
		}
	}

	public double applyBestDiscount(double orderAmount) {
		double maxDiscountAmount = 0;
		SimpleDiscountRule bestRule = null;

		for (SimpleDiscountRule rule : discountRules) {
			if (rule.isActive() && orderAmount > rule.getMinOrderAmount()) {
				double discountAmount = orderAmount * (rule.getDiscountPercentage() / 100);
				if (discountAmount > maxDiscountAmount) {
					maxDiscountAmount = discountAmount;
					bestRule = rule;
				}
			}
		}

		if (bestRule != null) {
			System.out.printf("Best discount applied: %.2f%% off = ₹%.2f\n", bestRule.getDiscountPercentage(),
					maxDiscountAmount);
			return orderAmount - maxDiscountAmount;
		}
		return orderAmount;
	}
}
