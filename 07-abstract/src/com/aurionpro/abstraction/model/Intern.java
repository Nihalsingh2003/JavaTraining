package com.aurionpro.abstraction.model;

public class Intern extends Employee {
	public double salary;
	public double stipend;
	
	public Intern(String name,int id,double stipend) {
		super(name, id);
		this.stipend=stipend;
	}
	
	@Override
	public double calculateSalary() {
		salary=stipend;
		return salary;
		
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("stipend:" + stipend);
	}
}
