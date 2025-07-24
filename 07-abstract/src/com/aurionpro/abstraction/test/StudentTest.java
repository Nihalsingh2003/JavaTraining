package com.aurionpro.abstraction.test;

import java.util.Scanner;

import com.aurionpro.abstraction.model.CommerceStudent;
import com.aurionpro.abstraction.model.ScienceStudent;
import com.aurionpro.abstraction.model.StudentSubject;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ScienceStudent[] scienceStudent = new ScienceStudent[2];
		CommerceStudent[] commerceStudent=new CommerceStudent[2];
		int userInput;
		while (true) {
			System.out.println("Please Select CustomerType 1-2:");
			for (StudentSubject result : StudentSubject.values()) {
				System.out.println(result.ordinal() + 1 + "." + result);
			}
			if (scanner.hasNextInt()) {
				userInput = scanner.nextInt();
				if (userInput == 1 || userInput == 2) {
					break;
				} else {
					System.out.println("Invalid option. Please enter 1 or 2.\n");
				}
			} else {
				System.out.println("Invalid input. Please enter a number (1 or 2).\n");

			}

		}
		scanner.nextLine();

		switch (userInput) {
		case 1:
			String StudentName = null;
			for (int i = 0; i < scienceStudent.length; i++) {
				while (true) {
					System.out.println("Enter Name: ");
					StudentName = scanner.nextLine();
					boolean hasDigit = false;
					for (int j = 0; j < StudentName.length(); j++) {
						if (Character.isDigit(StudentName.charAt(j))) {
							hasDigit = true;
							break;

						}

					}
					if (hasDigit) {
						System.out.println("Invalid name. Name should not contain numbers. Please try again.");
					} else if (StudentName.trim().isEmpty()) {
						System.out.println("Name cannot be empty. Please enter a valid name.");
					} else {
						break;
					}
				}
				System.out.println("Enter RollNumber: ");
				int rollNumber = scanner.nextInt();
				System.out.println("Enter marks of " + StudentSubject.SCIENCESTUDENT.getSubject1() + ": ");
				int subject1 = scanner.nextInt();
				System.out.println("Enter marks of " + StudentSubject.SCIENCESTUDENT.getSubject2() + ": ");
				int subject2 = scanner.nextInt();
				System.out.println("Enter marks of " + StudentSubject.SCIENCESTUDENT.getSubject3() + ": ");
				int subject3 = scanner.nextInt();
				scanner.nextLine();
				scienceStudent[i] = new ScienceStudent(rollNumber, StudentName);
				scienceStudent[i].calculateGrade(subject1, subject2, subject3);

			}
			break;
		case 2:
			String name = null;
			for (int i = 0; i < commerceStudent.length; i++) {
				while (true) {
					System.out.println("Enter Name: ");
					name = scanner.nextLine();
					boolean hasDigit = false;
					for (int j = 0; j < name.length(); j++) {
						if (Character.isDigit(name.charAt(j))) {
							hasDigit = true;
							break;

						}

					}
					if (hasDigit) {
						System.out.println("Invalid name. Name should not contain numbers. Please try again.");
					} else if (name.trim().isEmpty()) {
						System.out.println("Name cannot be empty. Please enter a valid name.");
					} else {
						break;
					}
				}
				System.out.println("Enter RollNumber: ");
				int rollNumber = scanner.nextInt();
				System.out.println("Enter marks of " + StudentSubject.COMMERCESTUDENT.getSubject1() + ": ");
				int subject1 = scanner.nextInt();
				System.out.println("Enter marks of " + StudentSubject.COMMERCESTUDENT.getSubject2() + ": ");
				int subject2 = scanner.nextInt();
				System.out.println("Enter marks of " + StudentSubject.COMMERCESTUDENT.getSubject3() + ": ");
				int subject3 = scanner.nextInt();
				scanner.nextLine();
				commerceStudent[i] = new CommerceStudent(rollNumber, name);
				commerceStudent[i].calculateGrade(subject1, subject2, subject3);

			}
		}
	}
}
