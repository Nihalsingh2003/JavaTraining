package com.aurionpro.abstraction.model;

public abstract class Customer {
private String name;
private double unitsConsumed;
public Customer(String name,double unitsConsumed) {
	this.name=name;
	this.unitsConsumed=unitsConsumed;
}
abstract void calculateBill();
public void getDetails() {
	System.out.println("Name: "+ name);
	System.out.println("unitsConsumed: "+ unitsConsumed);
	
}
public String getName() {
	return name;
}

public double getUnitsConsumed() {
	return unitsConsumed;
}

}
