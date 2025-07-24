package com.aurionpro.abstraction.model;

public class CommercialCustomer extends Customer {

	public CommercialCustomer(String name, double unitsConsumed) {
		super(name, unitsConsumed);
		
	}
	CustomerType type=CustomerType.COMMERCIALCUSTOMER;
	@Override
	
	public void calculateBill() {
		System.out.println("--------------Bill-------------------------------");
		super.getDetails();
		System.out.println("CommercialUnitPrice: "+type.getCommercialUnitPrice());
		System.out.println("TotalBill: "+ (getUnitsConsumed()*type.getCommercialUnitPrice()));
		System.out.println("---------------------------------------------------");		
	}
	

}
