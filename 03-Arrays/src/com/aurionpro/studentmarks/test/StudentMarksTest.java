package com.aurionpro.studentmarks.test;

import java.util.Scanner;


import com.aurinopro.arrays.test.StudentMarks;


public class StudentMarksTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of data you want to enter:");
	int userInput = scanner.nextInt();
	StudentMarks[] students = new StudentMarks[userInput];
	scanner.nextLine();
	for(int i=0;i<userInput;i++) {
		System.out.println("Enter details for Student: "+(i+1));
		System.out.println("Enter the StudentName:");
		String studentName = scanner.nextLine();
		System.out.println("Enter the RollNumber:");
		int rollNumber = scanner.nextInt();
		System.out.println("Enter the marks:");
		int[] marks = new int[3];
		for(int j=0;j<3;j++) {
			marks[j]=scanner.nextInt();
		}
		
		scanner.nextLine();
		
		students[i]=new StudentMarks(studentName,rollNumber,marks);
	}
	for(StudentMarks result:students) {
		result.display();
	}

}
}