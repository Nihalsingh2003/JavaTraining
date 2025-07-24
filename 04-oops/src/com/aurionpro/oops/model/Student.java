package com.aurionpro.oops.model;

public class Student {
	private String studentName;
	private int rollNumber;
	private String course;
	
	public String getStudentName() {
		return studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber= rollNumber;
	}
	public void setCourse(String course) {
		this.course= course;
	}
	public void displayDetails() {
		System.out.println("StudentName: "+ studentName+" rollNumber: "+ rollNumber+" course:"+course);
	}

}
