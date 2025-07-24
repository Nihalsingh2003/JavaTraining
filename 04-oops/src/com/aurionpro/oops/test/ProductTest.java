package com.aurionpro.oops.test;

import java.util.Scanner;

import com.aurionpro.oops.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of product you have:");
		int productCount=scanner.nextInt();
		Product[] product = new Product[productCount];
		scanner.nextLine();
		for(int i=0;i<productCount;i++) {
			System.out.println("For Product"+(i+1));
			System.out.println("Please Enter Product Name: ");
			String productName = scanner.nextLine();
			System.out.println("Please Enter Product Price: ");
			double productPrice = scanner.nextDouble();
			System.out.println("Please Enter Product Name: ");
			int productQuantity = scanner.nextInt();
			scanner.nextLine();
			product[i]=new Product();
			product[i].setName(productName);
			product[i].setPrice(productPrice);
			product[i].setQuantity(productQuantity);
		}
		for(Product result:product) {
			result.calculateTotal();
		}
		scanner.close();
	}
}
