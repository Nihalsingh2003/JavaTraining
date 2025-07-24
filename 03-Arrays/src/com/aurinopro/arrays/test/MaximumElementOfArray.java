package com.aurinopro.arrays.test;

import java.util.Scanner;

public class MaximumElementOfArray {
public static void main(String[]  args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the Size of Array.");
	int arraySize=scanner.nextInt();
	int maxElement=0;
	int[] array=new int[arraySize];
	System.out.println("Enter value:");
	for(int i=0;i<array.length;i++) {
		array[i]=scanner.nextInt();
	}
	 for(int i=0;i<array.length;i++) {
		 if(array[i]>maxElement) {
			 maxElement=array[i];
		 }
	 }
	 System.out.println("Maximum of an array is: " + maxElement);
	 scanner.close();
}
}
