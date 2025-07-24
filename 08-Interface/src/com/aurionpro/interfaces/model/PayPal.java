package com.aurionpro.interfaces.model;

public class PayPal implements IPaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("Payment by PayPal");
		
	}

}
