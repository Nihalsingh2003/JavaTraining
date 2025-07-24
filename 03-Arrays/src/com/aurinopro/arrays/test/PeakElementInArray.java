package com.aurinopro.arrays.test;

import java.util.Scanner;

public class PeakElementInArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please Enter the Size of Array.");
	int arraySize = scanner.nextInt();
	int[] array = new int[arraySize];
	System.out.println("Enter value:");
	for (int i = 0; i < array.length; i++) {
		array[i] = scanner.nextInt();
	}
	
	for(int i=0;i<array.length-1;i++) {
		if(array[i]>array[i+1]) {
			System.out.println("The PeakElement is:" + array[i] );
		}
		if(array[i+1]>=array[i-1] && array[i]>=array[i+1]) {
			System.out.println("The PeakElement is:" + array[i] );
		}
	}
	scanner.close();
}
}
//Confusion