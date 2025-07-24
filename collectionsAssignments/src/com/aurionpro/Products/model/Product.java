package com.aurionpro.Products.model;

public class Product {
	String category;
	String name;
	double price;

	public Product(String category, String name, double price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [category=" + category + ", name=" + name + ", price=" + price + "]";
	}

	public String getCategory() {

		return category;
	}

}
