package com.aurionpro.string.test;

import java.util.Scanner;

public class CheckReverse {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a String:");
	String sentence=scanner.nextLine();
	StringBuilder stringBuilder=new StringBuilder(sentence);
	System.out.println("Input:"+sentence);
	if(stringBuilder.reverse().toString().equals(sentence)) {
		System.out.println("isReverse");
	}else {
		System.out.println("Not Reverse");
	}
}
}
