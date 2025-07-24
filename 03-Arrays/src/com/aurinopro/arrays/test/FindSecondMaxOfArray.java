package com.aurinopro.arrays.test;

import java.util.Scanner;

public class FindSecondMaxOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Size of Array.");
		int arraySize = scanner.nextInt();
		int maxElement = 0;
		int secondMaxElement = 0;
		int[] array = new int[arraySize];
		System.out.println("Enter value:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxElement) {
				secondMaxElement = maxElement;
				maxElement = array[i];
			} else {
				if (array[i] > secondMaxElement) {
					secondMaxElement = array[i];
				}
			}
		}
		System.out.println("The SecondMaxElement is: " + secondMaxElement);
		scanner.close();
	}
}
