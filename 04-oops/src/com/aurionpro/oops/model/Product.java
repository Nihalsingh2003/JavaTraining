package com.aurionpro.oops.model;

public class Product {
private String productName;
private double price;
private int quantity;

public String getName() {
	return productName;
}
public double getPrice() {
	return price;
}
public int getQuantity() {
	return quantity;
}

public void setName(String productName) {
	this.productName=productName;
}
public void setPrice(double price) {
	this.price=price;
}
public void setQuantity(int quantity) {
	this.quantity=quantity;
}
//public Product(String productName,double price,int quantity) {
//	this.productName=productName;
//	this.price=price;
//	this.quantity=quantity;
//}
public void calculateTotal() {
	System.out.println(productName+": " + price*quantity);
}
}
