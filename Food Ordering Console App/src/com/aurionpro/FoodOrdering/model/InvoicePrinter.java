package com.aurionpro.FoodOrdering.model;

import java.util.List;

public class InvoicePrinter {
	public static void printInvoice(List<OrderItem> items, double total, double discount, String paymentMode,
			DeliveryPartner partner, String customerName, String customerAddress) {
		System.out.println("\n=========== INVOICE ===========");
		System.out.println("Customer Name   : " + customerName);
		System.out.println("Delivery Address: " + customerAddress);
		System.out.println("----------------------------------");
		System.out.printf("%-20s %-10s %-10s %-10s\n", "Item", "Price", "Qty", "Total");
		for (OrderItem item : items) {
			System.out.printf("%-20s ₹%-9.2f %-10d ₹%-10.2f\n", item.getItemName(), item.getUnitPrice(),
					item.getQuantity(), item.getTotalPrice());
		}
		System.out.println("----------------------------------");
		System.out.printf("Subtotal        : ₹%.2f\n", total);
		System.out.printf("Discount        : ₹%.2f\n", discount);
		System.out.printf("Final Amount    : ₹%.2f\n", total - discount);
		System.out.println("Payment Mode    : " + paymentMode);
		System.out.println("Delivery Partner: " + partner.getName() + " (" + partner.getContactNumber() + ")");
		System.out.println("==================================");
	}
}
