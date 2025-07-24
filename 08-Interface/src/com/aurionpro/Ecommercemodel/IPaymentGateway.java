package com.aurionpro.Ecommercemodel;

public interface IPaymentGateway {
	int pay(double amount);

	void cashBack(double amount);
}
