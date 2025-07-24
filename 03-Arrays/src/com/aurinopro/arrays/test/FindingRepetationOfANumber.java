package com.aurinopro.arrays.test;

import java.util.Scanner;

public class FindingRepetationOfANumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int counter=0;
	System.out.println("Please Enter the Size of Array.");
	int arraySize = scanner.nextInt();
	int[] array = new int[arraySize];
	System.out.println("Enter value:");
	for (int i = 0; i < array.length; i++) {
		array[i] = scanner.nextInt();
	}
	System.out.println("Enter Number to find the Repetation:");
	int number=scanner.nextInt();
	for(int i=0;i< array.length; i++) {
		if(array[i]==number) {
			counter++;
		}
	}
	System.out.println("The number " + number +" is Repeated " + counter + " times.");
	scanner.close();
	
}
}
