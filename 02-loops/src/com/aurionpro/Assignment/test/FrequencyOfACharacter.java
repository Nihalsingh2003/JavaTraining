package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class FrequencyOfACharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the a String: ");
		String userInputString = scanner.nextLine();
		System.out.println("Which Character Frequency You have to find: ");
		char userInput = scanner.nextLine().charAt(0);

		char[] charArray = userInputString.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (Character.toLowerCase(charArray[i]) == Character.toLowerCase(userInput)) {
				count++;
			}
		}
		System.out.println("Frequency of " + userInput + " is: " + count);
		scanner.close();
	}
}
