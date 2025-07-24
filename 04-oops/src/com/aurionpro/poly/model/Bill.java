package com.aurionpro.poly.model;

public class Bill {

	public void generateBill(double price, String item, int qty) {
		System.out.println("------Bill------");
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Price per item: $" + price);
		System.out.println("Total: $" + (price * qty));
	}

	public void generateBill(String item, int qty, double discount, double price) {
		double subTotal = price * qty;
		double discountAmount = subTotal * (discount / 100);
		double totalAmount = subTotal - discountAmount;
		System.out.println("------- BILL -------");
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Price per item: $" + price);
		System.out.println("Subtotal: $" + subTotal);
		System.out.println("Discount (" + discount + "%): -$" + discountAmount);
		System.out.println("Total: $" + totalAmount);
	}

	public void generateBill(String item, double tax, double price, int qty, double discount) {
		double subTotal = price * qty;
		double discountAmount = subTotal * (discount / 100);
		double taxAmount = (subTotal - discountAmount) * (tax / 100);
		double totalAmount = subTotal - discountAmount + taxAmount;
		System.out.println("------- BILL -------");
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Price per item: $" + price);
		System.out.println("Subtotal: $" + subTotal);
		System.out.println("Discount (" + discount + "%): -$" + discountAmount);
		System.out.println("Tax (" + tax + "%): -$" + taxAmount);
		System.out.println("Total: $" + totalAmount);
	}

}
