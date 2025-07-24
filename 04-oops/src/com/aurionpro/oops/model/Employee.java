package com.aurionpro.oops.model;

public class Employee {
	private String name;
	private int id;
	private int basicSalary;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;

	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;

	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public void generateSalarySlip() {
		double hra=0.20*basicSalary;
		double da=0.10*basicSalary;
		
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("Total salary: " +(basicSalary+hra+da));
		
	}
}
