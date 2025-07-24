package com.aurionpro.string.test;

import java.util.Scanner;

public class ReplaceSubString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a String:");
	String sentence=scanner.nextLine();
	StringBuilder stringBuilder=new StringBuilder(sentence);
	int indexof=stringBuilder.indexOf("bad");
	System.out.println(indexof);
	stringBuilder.replace(indexof, indexof+3, "good");
	System.out.println(stringBuilder);

}
}
