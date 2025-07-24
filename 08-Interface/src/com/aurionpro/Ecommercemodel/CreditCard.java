package com.aurionpro.Ecommercemodel;

public class CreditCard implements IPaymentGateway{
int cardLimit=200000;
	@Override
	public int pay(double amount) {
		if(amount>cardLimit) {
			System.out.println("Not have enough Balance!.Try again with another paymentMethod.");
			return 0;
		}else {
			cardLimit-=amount;
			System.out.println("Transaction is sucessFull!");
			return 1;
			
		}
		
	}

	@Override
	public void cashBack(double amount) {
		cardLimit+=(amount * 0.02);
		System.out.println("Credit card cashback processed: " + (amount * 0.02));
		
	}

}
