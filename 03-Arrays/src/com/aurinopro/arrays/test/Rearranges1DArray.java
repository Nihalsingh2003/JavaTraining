package com.aurinopro.arrays.test;

import java.util.Arrays;

public class Rearranges1DArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int[] copyArray =new int[array.length] ;
		int start=0;
		int end=array.length-1;
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) {
				copyArray[start]=array[i];
				start++;
			}else {
				copyArray[end]=array[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(copyArray));
	}
}
