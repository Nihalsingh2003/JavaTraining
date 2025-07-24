package com.aurionpro.abstraction.model;

public class Developer extends Employee {
	public double baseSalary;
	public double bonus=5000;
	public double salary;

	public Developer(String name, int id, double baseSalary) {
		super(name, id);
		this.baseSalary = baseSalary;
		
	}

	@Override
	public double calculateSalary() {
		salary = baseSalary + bonus;
		return salary;

	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Salary:" + calculateSalary());
	}

}
