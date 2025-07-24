package com.aurinopro.arrays.test;

import java.util.Scanner;

public class PalindromeArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please Enter the Size of Array.");
	int size=scanner.nextInt();
	int[] array=new int[size];
	int end=array.length-1;
	boolean isPalindrome=true;
	System.out.println("Please Enter the Values of Array");
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
	}
	for(int i=0;i<array.length/2;i++) {
		if(array[i]!=array[end--]) {
			isPalindrome=false;
			break;
		}
	}
	if(isPalindrome) {
		System.out.println("The Array is isPalindrome!");
	}else {
		System.out.println("The Array is not isPalindrome!");
	}
	scanner.close(); 
}
}
