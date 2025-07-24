package com.aurionpro.student.test;

import java.util.Scanner;

import com.aurinopro.arrays.test.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of data you want to enter:");
		int userInput = scanner.nextInt();
		Student[] students = new Student[userInput];

		scanner.nextLine();

		for (int i = 0; i < userInput; i++) {
			System.out.println("Enter the StudentName:");
			String studentName = scanner.nextLine();
			System.out.println("Enter the RollNumber:");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter the cgpa:");
			double cgpa = scanner.nextDouble();
			scanner.nextLine();
			students[i] = new Student(studentName, rollNumber, cgpa);
		}
		for (Student result : students) {
			result.display();
		}
	}
}
