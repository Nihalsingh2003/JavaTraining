package com.aurionpro.Ecommercemodel;

public class NetBanking implements IPaymentGateway{
int accountBalance=10000;
	@Override
	public int pay(double amount) {
		if (amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println("Transaction is sucessFull!");
			
			return 1;
		} else {
			System.out.println("Not have enough Balance!.Try again with another paymentMethod.");
			return 0;
		}
		
	}

	@Override
	public void cashBack(double amount) {
		accountBalance+=(amount * 0.005);
		System.out.println("NetBanking cashback processed: " + (amount * 0.005));
		
	}

}
