package com.aurionpro.abstractproject.model;

public abstract class Student {
	private String name;
	private int rollNumber;
	private StudentType stream;

	public Student(String name, int rollNumber, StudentType stream) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.stream = stream;
	}

	public abstract void calculatePerformance();

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("RollNumber:" + rollNumber);
		System.out.println("Stream:" + stream);
	}

	public abstract void calculatePerformance(boolean detailed);
	public abstract void calculatePerformance(String format);

}
