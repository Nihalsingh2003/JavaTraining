package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the a String: ");
	String userInput=scanner.nextLine();
	char[] charArray=userInput.toCharArray();
	char[] copyArray=new char[charArray.length];
	int end=charArray.length-1;
	
	for(int i=0;i<charArray.length;i++) {
		copyArray[i]=charArray[end--];
	}
	String result=String.valueOf(copyArray);
	if(userInput.equalsIgnoreCase(result)) {
		System.out.println("The String is Palindrome");
	}else {
		System.out.println("The String is Not Palindrome");
	}
}
}
