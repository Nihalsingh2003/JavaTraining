package com.aurionpro.typesofFunctionalInterfaces.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println(randomNumber.get());
		
		Supplier<LocalTime> currentTime=()->LocalTime.now();
		System.out.println(currentTime.get());
		
		int random=(int)(Math.random() * 3);
		
		List<String> list=new ArrayList<String>();
		list.addAll(Arrays.asList("nihal","singh","raj"));
		Supplier<String> listof=()-> list.get(random);
		System.out.println(listof.get());

		
	}
}
