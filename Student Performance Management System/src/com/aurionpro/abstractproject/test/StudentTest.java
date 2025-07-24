package com.aurionpro.abstractproject.test;

import java.util.Scanner;

import com.aurionpro.abstractproject.model.ArtsStudent;
import com.aurionpro.abstractproject.model.CommerceStudent;
import com.aurionpro.abstractproject.model.ScienceStudent;
import com.aurionpro.abstractproject.model.Student;
import com.aurionpro.abstractproject.model.StudentType;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] student = new Student[2];
		for (int i = 0; i < student.length; i++) {
			String StudentName = null;
			System.out.println("Details of student:" + (i + 1));
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
			int userInput;
			while (true) {
				System.out.println("Please Select stream:");
				for (StudentType result : StudentType.values()) {
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
			switch (userInput) {
			case 1:
				System.out.println("Enter marks of" + StudentType.SCIENCE.getSubject1() + ":");
				int subject1 = scanner.nextInt();
				System.out.println("Enter marks of" + StudentType.SCIENCE.getSubject2() + ":");
				int subject2 = scanner.nextInt();
				System.out.println("Enter marks of" + StudentType.SCIENCE.getSubject3() + ":");
				int subject3 = scanner.nextInt();
				student[i] = new ScienceStudent(StudentName, rollNumber, StudentType.SCIENCE, subject1, subject2,
						subject3);
				break;
			case 2:
				System.out.println("Enter marks of" + StudentType.COMMERCE.getSubject1() + ":");
				int commerceSubject1 = scanner.nextInt();
				System.out.println("Enter marks of" + StudentType.COMMERCE.getSubject2() + ":");
				int commerceSubject2 = scanner.nextInt();
				System.out.println("Enter marks of" + StudentType.COMMERCE.getSubject3() + ":");
				int commerceSubject3 = scanner.nextInt();
				student[i] = new CommerceStudent(StudentName, rollNumber, StudentType.COMMERCE, commerceSubject1,
						commerceSubject2, commerceSubject3);
				break;
			case 3:
				while (true) {
					System.out.println("Enter marks of" + StudentType.COMMERCE.getSubject1() + ":");
					int artSubject1 = scanner.nextInt();
					System.out.println("Enter marks of" + StudentType.COMMERCE.getSubject2() + ":");
					int artSubject2 = scanner.nextInt();
					System.out.println("Enter marks of" + StudentType.COMMERCE.getSubject3() + ":");
					int artSubject3 = scanner.nextInt();
					if (artSubject1 < 0 && artSubject1 > 100 && artSubject2 < 0 && artSubject2 > 100 && artSubject3 < 0
							&& artSubject3 > 100) {
						System.out.println("Please enter the marks in 0 to 100");

					} else {
						break;
					}
					student[i] = new ArtsStudent(StudentName, rollNumber, StudentType.COMMERCE, artSubject1,
							artSubject2, artSubject3);
				}

			}
			scanner.nextLine();

		}
		int userResponse;
		while (true) {
			System.out.println("Do you want entire details:");
			System.out.println("1.yes");
			System.out.println("2.No");
			if (scanner.hasNextInt()) {
				userResponse = scanner.nextInt();
				if (userResponse == 1 || userResponse == 2) {
					break;
				} else {
					System.out.println("Invalid option. Please enter 1 or 2.\n");
				}
			} else {
				System.out.println("Invalid input. Please enter a number (1 or 2).\n");

			}

		}
		switch (userResponse) {
		case 1:
			for (Student result : student) {

				result.calculatePerformance(true);
			}
			break;
		case 2:
			for (Student result : student) {

				result.calculatePerformance("yes");
			}
		}

	}
}
