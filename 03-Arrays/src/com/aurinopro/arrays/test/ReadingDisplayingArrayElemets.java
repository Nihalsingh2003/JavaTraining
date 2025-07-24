package com.aurinopro.arrays.test;

import java.util.Scanner;

public class ReadingDisplayingArrayElemets {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the Size of Array.");
	int arraySize=scanner.nextInt();
	
	int[] array=new int[arraySize];
	System.out.println("Value Entered:");
	for(int i=0;i<array.length;i++) {
		array[i]=scanner.nextInt();
	}
	
	System.out.println("Displaying:");
	for(int result:array) {
		System.out.println(result);
	}
	scanner.close();
}
}
