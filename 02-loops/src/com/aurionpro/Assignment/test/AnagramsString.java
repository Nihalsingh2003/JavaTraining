package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class AnagramsString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a String1: ");
	String sentenceOne = scanner.nextLine();
	System.out.println("Please Enter a String2: ");
	String sentenceTwo = scanner.nextLine();
	boolean isAnagrams=true;
	char[] charArray=new char[sentenceTwo.length()];
	for(int i=0;i<sentenceTwo.length();i++) {
		charArray[i]=sentenceTwo.charAt(i);
		if(sentenceOne.toLowerCase().contains(String.valueOf(charArray[i]).toLowerCase())) {
			continue;
		}else {
			isAnagrams=false;
			System.out.println("The two Strings are not AnagramsString ");
			break;
		}
	}
	if(isAnagrams) {
		System.out.println("The two Strings are  AnagramsString ");
	}
	scanner.close();
}
}
