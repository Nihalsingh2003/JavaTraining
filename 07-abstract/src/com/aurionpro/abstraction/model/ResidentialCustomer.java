package com.aurionpro.abstraction.model;

public class ResidentialCustomer extends Customer {

	public ResidentialCustomer(String name, double unitsConsumed) {
		super(name, unitsConsumed);

	}
	CustomerType type=CustomerType.RESIDENTIALCUSTOMER;
	@Override
	public void calculateBill() {
		System.out.println("--------------Bill-------------------------------");
		super.getDetails();
		System.out.println("ResidentialUnitPrice"+type.getResidentialUnitPrice());
		System.out.println("TotalBill: "+ (getUnitsConsumed()*type.getResidentialUnitPrice()));
		System.out.println("---------------------------------------------------");
	}
}
