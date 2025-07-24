package com.aurinopro.arrays.test;

import java.util.Scanner;

public class ShiftingCharString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the value to shift by:");
		int shiftValue = scanner.nextInt();
		String name = "Nihal";
		char[] character = name.toCharArray();

		for (int i = 0; i < character.length; i++) {
			if (character[i] >= 'A' && character[i] <= 'Z') {
				int asciiValue = character[i];
				char shifted = (char) ('A' + (asciiValue - 'A' + shiftValue) % 26);
				character[i] = shifted;
			} else if (character[i] >= 'a' && character[i] <= 'z') {
				int asciiValue = character[i];
				char shifted = (char) ('a' + (asciiValue - 'a' + shiftValue) % 26);
				character[i] = shifted;
			}
		}

		System.out.println(new String(character));
	}
}
