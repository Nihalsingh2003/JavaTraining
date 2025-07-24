package com.aurionpro.Stream.model;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 6, 8, 45, 34);
//	list.stream().filter(number->number%2==0).toList().forEach(System.out::println);

		List<String> namesList = Arrays.asList("nihal", "aditya", "Adi", "singh", "aditya");

//	long coun=namesList.stream().filter(str->str.toUpperCase().startsWith("A")).count();
//System.out.println(coun);
		List<String> emptyList = Arrays.asList("Nihal", " ", "Adi", "Singh", "");
//	emptyList.stream().filter(str->!str.isEmpty()&&!str.isBlank()).toList().forEach(System.out::println);

		List<Integer> marksList = Arrays.asList(34, 40, 54, 23);
//		marksList.stream().filter(marks -> marks >= 40).toList().forEach(System.out::println);
		
//		namesList.stream().map(String::toUpperCase).toList().forEach(System.out::println);
		
//		list.stream().map(number->number*number).toList().forEach(System.out::println);
		
//		namesList.stream().map(name->"Mr/Ms "+name).toList().forEach(System.out::println);
		
		List<Double> prices=Arrays.asList(23.0,56.0,78.0,45.0);
		prices.stream().map(pri->pri*0.1).forEach(System.out::println);
		
		
		
		
	}
}
