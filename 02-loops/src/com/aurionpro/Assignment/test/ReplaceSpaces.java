package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class ReplaceSpaces {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a String: ");
		String sentence = scanner.nextLine();
		char[] charArray = new char[sentence.length()];
		System.out.println("String with spaces: " + sentence);
		for (int i = 0; i < sentence.length(); i++) {

			charArray[i] = sentence.charAt(i);
			if (charArray[i] == ' ') {
				charArray[i] = '-';
			}
		}
		String newString = new String(charArray);
		System.out.println("newString: " + newString);
		scanner.close();
	}
}
