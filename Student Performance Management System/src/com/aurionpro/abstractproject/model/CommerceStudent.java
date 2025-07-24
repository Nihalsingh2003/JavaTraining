package com.aurionpro.abstractproject.model;

public class CommerceStudent extends Student {
	private int subject1;
	private int subject2;
	private int subject3;
	private double average;

	public CommerceStudent(String name, int rollNumber, StudentType stream, int subject1, int subject2, int subject3) {
		super(name, rollNumber, stream);
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;

	}

	StudentType type = StudentType.COMMERCE;

	@Override
	public void calculatePerformance(boolean detailed) {
		System.out.println("-----------------------ScoreCard--------------------------");
		System.out.println(type.getSubject1() + ": " + subject1);
		System.out.println(type.getSubject2() + ": " + subject2);
		System.out.println(type.getSubject3() + ": " + subject3);
		average = (subject1 + subject2 + subject3) / 3;
		System.out.println("Average: " + average);
		System.out.println("-----------------------------------------------------------");

	}

	@Override
	public void calculatePerformance() {
		System.out.println("No");

	}

	@Override
	public void calculatePerformance(String format) {
		System.out.println("-----------------------ScoreCard--------------------------");
		double percentage = average * 100;
		System.out.println("Percentage:" + percentage);
		if (average >= 90) {
			System.out.println("Grade:A");
		} else if (average >= 80) {
			System.out.println("Grade:B");
		} else if (average >= 70) {
			System.out.println("Grade:C");
		}
		System.out.println("------------------------------------------------------------");
	}

}
