package com.aurionpro.studentcoursemenagment.model;

public class Person {
	public String name;
	public Departments department;

	public void setName(String name) {
		this.name = name;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void getDetails() {
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);

	}

}
