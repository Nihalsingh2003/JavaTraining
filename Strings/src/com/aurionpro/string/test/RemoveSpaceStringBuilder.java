package com.aurionpro.string.test;

import java.util.Scanner;

public class RemoveSpaceStringBuilder {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a String:");
	String sentence=scanner.nextLine();
	StringBuilder stringBuilder=new StringBuilder("");
	
	for(int i=0;i<sentence.length();i++) {
		if(sentence.charAt(i)!=' ') {
			stringBuilder.append(sentence.charAt(i));
		}
		
	}
	System.out.print(stringBuilder);
	
	
}
}
