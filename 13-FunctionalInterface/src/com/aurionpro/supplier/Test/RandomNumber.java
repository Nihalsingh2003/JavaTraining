package com.aurionpro.supplier.Test;

import java.util.function.Supplier;

public class RandomNumber {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((int) (Math.random() * 5));
			}
			return null;
		};
		supplier.get();
	}
}
