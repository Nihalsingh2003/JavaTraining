package com.aurinopro.arrays.test;

import java.util.Scanner;

public class SumOfElementsOfArrays {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the Size of Array.");
	int arraySize=scanner.nextInt();
	int totalSum=0;
	int[] array=new int[arraySize];
	System.out.println("Enter value:");
	for(int i=0;i<array.length;i++) {
		array[i]=scanner.nextInt();
	}
	 for(int i=0;i<array.length;i++) {
		totalSum+=array[i];
	 }
	 System.out.println("Total sum of Elements of array is: " + totalSum);
	 scanner.close();
}
}
