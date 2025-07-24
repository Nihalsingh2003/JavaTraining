package com.aurionpro.Products.model;

import java.util.Comparator;

public class SortBycategory implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		
		return product1.category.compareToIgnoreCase(product2.category);
	}

}
