package com.aurionpro.arraylists.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		ArrayList<Integer> number2 = new ArrayList<>();
		number.add(3);
		number.add(1, 5);
		number2.addAll(Arrays.asList(1, 2, 3, 4));
		number.addAll(1, Arrays.asList(10, 20, 30, 40));
		number.addAll(number2);
//		number.clear();
//		number.ensureCapacity(10);
		System.out.println(number.get(2));
//		number.clear();
//		System.out.println(number.isEmpty());
//		System.out.println(number.clone());
		System.out.println(number.lastIndexOf(3));
		System.out.println(Arrays.toString(number.toArray()));
		System.out.println(number.contains(3));
		System.out.println(number.indexOf(3));
//		number.remove(0);
//		number.removeAll(number2);
//		number.remove(Integer.valueOf(3));
		Collections.replaceAll(number, 1, 3);
//		number.trimToSize();
		System.out.println(number.size());

		System.out.println(number);
	}
}
