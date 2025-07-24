package com.aurinopro.arrays.test;

public class Student {
	String studentName;
	int rollNumber;
	double cgpa;

	
	public Student(String studentName, int rollNumber, double cgpa) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.cgpa = cgpa;

	}

	public void display() {
		System.out.println("studentName: " + studentName + " rollNumber " + rollNumber + " cgpa " + cgpa);
	}
}
