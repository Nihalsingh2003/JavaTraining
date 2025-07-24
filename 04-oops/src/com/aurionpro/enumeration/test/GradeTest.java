package com.aurionpro.enumeration.test;

import java.util.Scanner;

import com.aurionpro.enumeration.model.Grade;

public class GradeTest {
	public static void grade(Grade grade1) {
		switch (grade1) {
		case A:
			System.out.println("Excellent");
			break;
		case B:
			System.out.println("Very GOOD");
			break;
		case C:
			System.out.println("Good");
			break;
		case D:
			System.out.println("Need Improvement");
			break;
		case F:
			System.out.println("Fail");
			break;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Grade:");
		System.out.println("Enter a Grade (A, B, C, D, F):");
		String userInput = scanner.nextLine();
		grade(Grade.valueOf(userInput.toUpperCase()));
	}
}
