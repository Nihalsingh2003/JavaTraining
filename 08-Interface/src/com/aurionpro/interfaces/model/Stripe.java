package com.aurionpro.interfaces.model;

public class Stripe implements IPaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("Payment by stripe");
		
	}

}
