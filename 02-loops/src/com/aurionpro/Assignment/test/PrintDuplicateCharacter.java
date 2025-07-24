package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class PrintDuplicateCharacter {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the a string");
	String stringOne=scanner.nextLine();
	char[] newCharArray=new char[stringOne.length()];
	char[] duplicateArray=new char[stringOne.length()];
	int index=0;
	int duplicateIndex=0;
	for(int i=0;i<stringOne.length();i++) {
		if(String.valueOf(newCharArray).contains(String.valueOf(stringOne.charAt(i)))) {
			duplicateArray[duplicateIndex++]=stringOne.charAt(i);
		}else {
			newCharArray[index++]=stringOne.charAt(i);
		}
	}
	System.out.println("Duplicate Character: ");
	for (int i = 0; i < duplicateIndex; i++) {
        System.out.print(duplicateArray[i]);
        if (i < duplicateIndex - 1) {
            System.out.print(", ");
        }
    }
	scanner.close();
}
}
