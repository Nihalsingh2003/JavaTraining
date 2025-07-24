package com.aurinopro.arrays.test;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8, 7, 1 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length -i- 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
