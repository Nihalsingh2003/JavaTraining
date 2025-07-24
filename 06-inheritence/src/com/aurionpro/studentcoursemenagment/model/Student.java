package com.aurionpro.studentcoursemenagment.model;

public class Student extends Person {
	private int rollNumber;
	private Course[] enrolledCourse=new Course[2];
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Course[] getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(Course[] enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	
	@Override
	public void getDetails( ) {
		super.getDetails();
		System.out.println("rollNumber: "+ rollNumber);
		for(Course course:enrolledCourse) {
			System.out.println("EnrolledCourse: "+ course);
			
		}
		
		
	}
	public void enrollCourse() {
		int i=0;
		for(Course course:Course.values()) {
			enrolledCourse[i]=course;
			i++;
		}
	}
}
