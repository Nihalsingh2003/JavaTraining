package com.aurionpro.Student.model;

public class Student {
	public String name;
	public int rollNumber;
	public double cgpa;

	public Student() {
		System.out.println("This is default constructor of student");
	}

	public Student(String name, int rollNumber, double cgpa) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.cgpa = cgpa;
	}

	public void greet() {
		System.out.println("Hello Student");
	}

	public double result(double cgpa) {
		return cgpa;
	}
}
