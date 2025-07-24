package com.aurionpro.supplier.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Product {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Samsung Galaxy S24 Ultra", "Nike Air Max 270", "Sony WH-1000XM5",
				"Apple MacBook Air (M3)", "Dove Moisturizing Body Wash", "Canon EOS R10 Mirrorless Camera",
				"Fitbit Charge 6 Fitness Tracker", "Instant Pot Duo 7-in-1");

		Supplier<List<String>> listof = () -> {
			List<String> list2 = new ArrayList<String>();
			for (int i = 0; i < 5; i++) {
				list2.add(list.get((int) (Math.random() * 5)));
			}
			return list2;
		};
		List<String> randomProducts = listof.get();
		for (String product : randomProducts) {
			System.out.println(product);
		}

	}
}
