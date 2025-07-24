package com.aurionpro.Products.model;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {

		return Double.compare(product1.price, product2.price);
	}

}
