package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class VowelsInString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the a String: ");
	String userInput=scanner.nextLine();
	char[] vowels= {'a','e','i','o','u'};
	
	int count=0;
	for(int i=0;i<vowels.length;i++) {
		if(userInput.toLowerCase().contains(String.valueOf(vowels[i]))) {
			count++;
		}
	}
	System.out.println("The count of Vowels in a String is: " +count);
	scanner.close();
	
}
}
