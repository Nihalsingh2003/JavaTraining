package com.aurionpro.interfaces.model;

public class Razorpay implements IPaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("Payment by Razorpay");
		
	}

}
