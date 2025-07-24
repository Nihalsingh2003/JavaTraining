package com.aurionpro.linkedlists.model;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> names=new LinkedList<>();
	names.add("Nihal");
	names.addAll(Arrays.asList("Aditya","pravin","Raj"));
	names.addFirst("Amitesh");
	names.addLast("Nihal");
	System.out.println(names.size());
	System.out.println(names.contains("Nihal"));
//	names.set(5, "sahil");
//	names.remove(0);
//	names.remove("Nihal");
	System.out.println(names.getFirst());
	System.out.println(names.getLast());
	System.out.println(names.indexOf("Nihal"));
	System.out.println(names.lastIndexOf("Nihal"));
	System.out.println(names);
}
}
