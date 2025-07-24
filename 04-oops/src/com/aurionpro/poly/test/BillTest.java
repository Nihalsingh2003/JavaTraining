package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.Bill;

public class BillTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the item Name:");
	String item = scanner.nextLine();
	System.out.println("Enter the Item quantity:");
	int qty=scanner.nextInt();
	System.out.println("Enter the Item price");
	double price=scanner.nextDouble();
	System.out.println("Enter the discount:");
	double discount=scanner.nextDouble();
	System.out.println("Enter the tax");
	double tax=scanner.nextDouble();
	Bill bill=new Bill();
	bill.generateBill(price, item, qty);
	bill.generateBill(item, qty, discount, price);
	bill.generateBill(item, tax, price, qty, discount);
	scanner.close();
}
}
