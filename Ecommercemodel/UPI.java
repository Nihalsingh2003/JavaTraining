package com.aurionpro.Ecommercemodel;

public class UPI implements IPaymentGateway {
	int upiBalance = 10000;

	@Override
	public int pay(double amount) {
		if (amount <= upiBalance) {
			upiBalance -= amount;
			System.out.println("Transaction is sucessFull!");
			
			return 1;
		} else {
			System.out.println("Not have enough Balance!.Try again with another paymentMethod.");
			return 0;
		}

	}

	@Override
	public void cashBack(double amount) {
		upiBalance+=(amount * 0.01);
		System.out.println("UPI cashback processed: " + (amount * 0.01));

	}

}
