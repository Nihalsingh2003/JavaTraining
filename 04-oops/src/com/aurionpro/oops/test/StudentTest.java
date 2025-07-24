package com.aurionpro.oops.test;

import java.util.Scanner;

import com.aurionpro.oops.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] student = new Student[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("For StudentDetail" + (i + 1));
			System.out.println("Please Enter Student Name: ");
			String studentName = scanner.nextLine();

			System.out.println("Please Enter Roll Number: ");
			int rollNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Please Enter Course: ");
			String course = scanner.nextLine();
			
			student[i] = new Student();
			student[i].setStudentName(studentName);
			student[i].setRollNumber(rollNumber);
			student[i].setCourse(course);
		}
		for (Student result : student) {
			result.displayDetails();
		}
		scanner.close();
	}
}
