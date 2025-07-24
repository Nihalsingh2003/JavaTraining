package com.aurionpro.studentcoursemenagment.test;

import java.util.Scanner;

import com.aurionpro.studentcoursemenagment.model.Course;
import com.aurionpro.studentcoursemenagment.model.Departments;
import com.aurionpro.studentcoursemenagment.model.Professor;
import com.aurionpro.studentcoursemenagment.model.Student;

public class PersonTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		int userInput = 0;
		while (true) {
			System.out.println("Select which person details you want to enter:");
			System.out.println("1. Student, 2. Professor");

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
			String studentName;
			while (true) {
				System.out.println("Enter Student Name:");
				studentName = scanner.nextLine();

				boolean hasDigit = false;
				for (int i = 0; i < studentName.length(); i++) {
					if (Character.isDigit(studentName.charAt(i))) {
						hasDigit = true;
						break;
					}
				}

				if (hasDigit) {
					System.out.println("Invalid name. Name should not contain numbers. Please try again.");
				} else if (studentName.trim().isEmpty()) {
					System.out.println("Name cannot be empty. Please enter a valid name.");
				} else {
					break;
				}
			}

			System.out.println("Enter RollNumber:");
			int rollNumber = scanner.nextInt();
			boolean choiceIsTrue = true;
			Departments selectedType = null;

			while (choiceIsTrue) {
				System.out.println("select  Department:");
				for (Departments type : Departments.values()) {
					System.out.println(type.ordinal() + 1 + ". " + type);
				}
				int choice = scanner.nextInt();
				selectedType = null;
				switch (choice) {
				case 1:
					selectedType = Departments.values()[choice - 1];
					choiceIsTrue = false;
					break;
				case 2:
					selectedType = Departments.values()[choice - 1];
					choiceIsTrue = false;
					break;
				case 3:
					selectedType = Departments.values()[choice - 1];
					choiceIsTrue = false;
					break;
				default:
					System.out.println("Enter a valid choice");

					break;
				}
			}
			Student student = new Student();
			student.enrollCourse();
			student.setDepartment(selectedType);
			student.setName(studentName);
			student.setRollNumber(rollNumber);

			student.getDetails();
			break;
		case 2:
			String ProfessorName;
			while (true) {
				System.out.println("Enter ProfessorName:");
				ProfessorName = scanner.nextLine();

				boolean hasDigit = false;
				for (int i = 0; i < ProfessorName.length(); i++) {
					if (Character.isDigit(ProfessorName.charAt(i))) {
						hasDigit = true;
						break;
					}
				}

				if (hasDigit) {
					System.out.println("Invalid name. Name should not contain numbers. Please try again.");
				} else if (ProfessorName.trim().isEmpty()) {
					System.out.println("Name cannot be empty. Please enter a valid name.");
				} else {
					break;
				}
			}

			System.out.println("Enter Id:");
			int id = scanner.nextInt();
			boolean choiceIs = true;
			Departments selectedType1 = null;
			Course assignSubject = null;
			while (choiceIs) {
				System.out.println("select  Department:");
				for (Departments type : Departments.values()) {
					System.out.println(type.ordinal() + 1 + ". " + type);
				}
				int choice = scanner.nextInt();
				selectedType1 = null;
				switch (choice) {
				case 1:
					selectedType1 = Departments.values()[choice - 1];
					choiceIs = false;
					break;
				case 2:
					selectedType1 = Departments.values()[choice - 1];
					choiceIs = false;
					break;
				case 3:
					selectedType1 = Departments.values()[choice - 1];
					choiceIs = false;
					break;
				default:
					System.out.println("Enter a valid choice");

					break;
				}
				boolean isChoice = true;
				while (isChoice) {
					System.out.println("select  Subject:");
					for (Course type : Course.values()) {
						System.out.println(type.ordinal() + 1 + ". " + type);
					}
					int choiceSubject = scanner.nextInt();
					
					switch (choiceSubject) {
					case 1:
						assignSubject = Course.values()[choiceSubject - 1];
						isChoice = false;
						break;
					case 2:
						assignSubject = Course.values()[choiceSubject - 1];
						isChoice = false;
						break;
					case 3:
						assignSubject = Course.values()[choiceSubject - 1];
						isChoice = false;
						break;
					default:
						System.out.println("Enter a valid choice");
						isChoice = false;
						break;
					}

				}

			}
			Professor professor = new Professor();
			professor.setName(ProfessorName);
			professor.setId(id);
			professor.setDepartment(selectedType1);
			professor.setAssignedSubject(assignSubject);
			professor.getDetails();

		}
		scanner.close();
	}
}
