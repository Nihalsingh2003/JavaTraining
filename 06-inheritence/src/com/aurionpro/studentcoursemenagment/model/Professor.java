package com.aurionpro.studentcoursemenagment.model;

public class Professor extends Person {
	public int id;
	public Course assignedSubject;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Course getAssignedSubject() {
		return assignedSubject;
	}


	public void setAssignedSubject(Course assignedSubject) {
		this.assignedSubject = assignedSubject;
	}


	@Override
	public void getDetails( ) {
		super.getDetails();
		System.out.println("Id: "+ id);
		System.out.println("assignedSubject: "+ assignedSubject);
		
	}
	public void assignSubject() {
		
		
	}
}
