package com.auriopro.interfaces.accountOperations.model;

public interface IAccountOperations {
	void deposit(double amount);

	int withdraw(double amount);

	void checkBalance();
}
