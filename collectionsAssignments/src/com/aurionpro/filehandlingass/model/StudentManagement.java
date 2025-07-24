package com.aurionpro.filehandlingass.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {

	static final String FILENAME = "students.txt";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("--- Student Management Menu ---");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Search Student by Roll Number");
			System.out.println("4. Delete Student by Roll Number");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5): ");

			String choice = scanner.nextLine();

			switch (choice) {
			case "1":
				addStudent();
				break;
			case "2":
				viewAllStudents();
				break;
			case "3":
				searchStudentByRoll();
				break;
			case "4":
				deleteStudentByRoll();
				break;
			case "5":
				System.out.println("Exiting program...");
				return;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		}
	}

	static void addStudent() {
		System.out.println("--- Add Student ---");

		int input;
		while (true) {
			System.out.print("How many students do you want to add? ");

			try {
				input = scanner.nextInt();
				if (input > 0) {
					break;
				} else {
					System.out.println("Number must be greater than zero.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid positive integer." + e);
				scanner.next();
			}
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
			for (int i = 0; i < input; i++) {
				System.out.println("--- Enter details for student " + (i + 1) + " ---");

				int roll;
				while (true) {
					System.out.print("Enter roll number (integer): ");
					try {
						roll = scanner.nextInt();
						if (roll > 0) {
							break;
						} else {
							System.out.println("Number must be greater than zero.");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input. Please enter a valid positive integer." + e);
						scanner.next();
					}

				}

				String name;
				while (true) {
					System.out.print("Enter name: ");
					name = scanner.nextLine().trim();
					if (!name.isEmpty()) {
						break;
					}
					System.out.println("Name cannot be empty.");
				}

				int marks;
				while (true) {
					System.out.print("Enter marks (numeric): ");
					try {
						marks = scanner.nextInt();
						if (marks >= 0) {
							break;
						} else {
							System.out.println("Number must be greater than zero.");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input. Please enter a valid positive integer." + e);
						scanner.next();
					}

				}

				writer.write(roll + "," + name + "," + marks);
				writer.newLine();
				System.out.println("Student " + (i + 1) + " added successfully.");
			}
		} catch (IOException e) {
			System.out.println("Error writing to file.");
		}
	}

	static void viewAllStudents() {
		System.out.println("--- All Students ---");

		try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
			String line;
			boolean anyData = false;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 3) {
					System.out.println("Roll: " + parts[0] + ", Name: " + parts[1] + ", Marks: " + parts[2]);
					anyData = true;
				}
			}

			if (!anyData) {
				System.out.println("No student records found.");
			}

		} catch (IOException e) {
			System.out.println("Error reading file.");
		}
	}

	static void searchStudentByRoll() {
		System.out.println("--- Search Student ---");

		System.out.print("Enter roll number to search: ");
		String searchRoll = scanner.nextLine();
		boolean found = false;

		try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 3 && parts[0].equals(searchRoll)) {
					System.out.println(
							"Student Found: Roll: " + parts[0] + ", Name: " + parts[1] + ", Marks: " + parts[2]);
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Student with roll number " + searchRoll + " not found.");
			}

		} catch (IOException e) {
			System.out.println("Error reading file.");
		}
	}

	static void deleteStudentByRoll() {
		System.out.println("--- Delete Student ---");

		System.out.print("Enter roll number to delete: ");
		String deleteRoll = scanner.nextLine();
		boolean deleted = false;

		File inputFile = new File(FILENAME);
		File tempFile = new File("temp.txt");

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
			String line;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 3 && parts[0].equals(deleteRoll)) {
					deleted = true;
					continue;
				}
				writer.write(line);
				writer.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error processing file.");
			return;
		}

		if (inputFile.delete() && tempFile.renameTo(inputFile)) {
			if (deleted) {
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("Roll number not found.");
			}
		} else {
			System.out.println("Could not update file.");
		}
	}

}
