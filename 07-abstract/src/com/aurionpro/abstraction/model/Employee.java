package com.aurionpro.abstraction.model;

public abstract class Employee {
private String name;
private int id;
public Employee(String name,int id) {
	this.id=id;
	this.name=name;
}
public abstract double calculateSalary();

public void displayDetails() {
	System.out.println("Name: "+name);
	
}
}
