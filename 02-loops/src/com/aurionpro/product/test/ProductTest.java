package com.aurionpro.product.test;

import java.util.Scanner;

import com.aurionpro.Assignment.test.Products;



public class ProductTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of productArray:");
		int productArraySize=scanner.nextInt();
		Products[] product=new Products[productArraySize];
		scanner.nextLine();
		for(int i=0;i<productArraySize;i++) {
			System.out.println("Enter the details of product"+(i+1));
			System.out.println("Enter product name: ");
			String productName=scanner.nextLine();
			System.out.println("Enter product price: ");
			int productPrice=scanner.nextInt();
			scanner.nextLine();
			product[i]=new Products(productName,productPrice);
			
		}
		System.out.println("Product with price less then 1000");
		for(Products result:product) {
			result.Display();
		}
		scanner.close();
		
	}
}
