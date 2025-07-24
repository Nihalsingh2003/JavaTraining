package com.aurionpro.Stream.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(600, 30, 500, 200, 900, 700, 800);
		List<String> list2 = Arrays.asList("Nihal","singh","om","Raj","sahil","Aditya");


		list.stream().filter(price -> price > 500).skip(2).forEach(System.out::println);
		list2.stream().filter(name->name.length()>3).skip(3).forEach(System.out::println);
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Integer sum=list3.stream().filter(number->number%2==0).limit(2).reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
}
