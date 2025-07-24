package com.aurionpro.abstraction.model;

public abstract class Student {
	private int rollNumber;
	private String name;

	public Student(int rollNumber, String name) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	

	public void displayDetail() {
		System.out.println("Name: " + name);
		System.out.println("RollNumber: " + rollNumber);
	}

	abstract public void calculateGrade(int subject1, int subject2, int subject3);

}
