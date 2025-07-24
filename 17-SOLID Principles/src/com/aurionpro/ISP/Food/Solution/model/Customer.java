package com.aurionpro.ISP.Food.Solution.model;

public class Customer implements ICustomerOperations {

	@Override
	public void placeOrder() {
		System.out.println("Your order is palced!");
		
	}

	@Override
	public void trackOrder() {
		System.out.println("Tracking Your Order!");
		
	}

	@Override
	public void rateDriver() {
		System.out.println("Rate the Driver!");
		
	}

}
