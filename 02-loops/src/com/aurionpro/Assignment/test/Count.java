package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class Count {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a String: ");
	String sentence = scanner.nextLine();
	int letterCount=0;
	int digitCount=0;
	int specialCharacterCount=0;
	for(int i=0;i<sentence.length();i++) {
		if(Character.isLetter(sentence.charAt(i))) {
			letterCount++;
			
		}else if(Character.isDigit(sentence.charAt(i))) {
			digitCount++;
		}else {
			specialCharacterCount++;
		}
	}
	System.out.print("Letters: "+ letterCount+ " Digit: "+digitCount+" Special: "+specialCharacterCount);
	scanner.close();
}
}
