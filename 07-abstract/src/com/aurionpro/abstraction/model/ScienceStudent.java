package com.aurionpro.abstraction.model;

public class ScienceStudent extends Student {

	public ScienceStudent(int rollNumber, String name) {
		super(rollNumber, name);

	}

	@Override
	public void calculateGrade(int subject1, int subject2, int subject3) {
		System.out.println("-----------------------GRADECARD--------------------------");
		super.displayDetail();
		System.out.println(StudentSubject.SCIENCESTUDENT.getSubject1() + ": " + subject1);
		System.out.println(StudentSubject.SCIENCESTUDENT.getSubject2() + ": " + subject2);
		System.out.println(StudentSubject.SCIENCESTUDENT.getSubject3() + ": " + subject3);
		int average = (subject1 + subject2 + subject3) / 3;
		System.out.println("Average: " + average);

		if (average >= 90) {
			System.out.println("Grade:A");
		} else if (average >= 80) {
			System.out.println("Grade:B");
		} else if (average >= 70) {
			System.out.println("Grade:C");
		}
		
		System.out.println("-------------------------------------------------------------");
	}

}
