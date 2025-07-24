package com.aurionpro.Stream.model;

public class Student {
	public String name;
	public int rollNumber;
	public double cgpa;

	public Student(String name, int rollNumber, double cgpa) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", cgpa=" + cgpa + "]";
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double getCgpa() {
		return cgpa;
	}

}
