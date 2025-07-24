package com.aurionpro.typesofFunctionalInterfaces.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<List<Integer>> consumer1 = list -> list.forEach(System.out::println);
		consumer1.accept(Arrays.asList(1,2,3,4,5));
	}
}
