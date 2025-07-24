package com.aurionpro.Assignment.test;

public class Products {
	String productName;
	int price;
public Products(String productName,int price) {
	this.productName=productName;
	this.price=price;
}
public void Display() {
	if(price<1000) {
		System.out.println("ProductName: "+productName);
	}
}
}
