package com.aurionpro.typesofFunctionalInterfaces.model;

import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {
	Predicate<Integer> isOdd=number->number%2==1;
	System.out.println(isOdd.test(43));
}
}
