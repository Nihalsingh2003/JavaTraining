package com.aurionpro.string.test;

import java.util.Scanner;

public class CountOccurrences {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a String:");
	String sentence=scanner.nextLine();
	StringBuilder stringBuilder=new StringBuilder(sentence);
	int count=0;
	while(stringBuilder.indexOf("this")!=-1){
		int index=stringBuilder.indexOf("this");
		stringBuilder.replace(index, index+3, "good");
		count++;
		
	}
	System.out.print("this:"+ count);
	
}
}
