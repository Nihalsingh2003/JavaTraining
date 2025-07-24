package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a String: ");
		String sentence = scanner.nextLine();
		char[] charArray = new char[sentence.length()];
		int index = 0;
		for (int i = 0; i < sentence.length(); i++) {

			if (String.valueOf(charArray).toLowerCase().contains(String.valueOf(sentence.toLowerCase().charAt(i)))) {
				continue;
			} else {
				charArray[index++] = sentence.charAt(i);
			}

		}

		String updatedString = String.valueOf(charArray);

		System.out.println(updatedString);
		scanner.close();
	}
}
