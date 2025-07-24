package com.aurionpro.typesofFunctionalInterfaces.model;

import java.util.function.Function;

public class FunctionExample {
public static void main(String[] args) {
	Function<Integer, Integer> function=number->(number*number);
	System.out.println(function.apply(4));
}
}
