package com.auriopro.interfaces.accountOperations.model;

public class CurrentAccount implements IAccountOperations {
	double currentBalance = 10000;
	int overdraftLimit = 50000;

	@Override
	public void deposit(double amount) {
		System.out.println("--------------------------------------------------");
		System.out.println("Balance before deposit:" + currentBalance);
		currentBalance += amount;
		System.out.println("Balance After deposit:" + currentBalance);
		System.out.println("--------------------------------------------------");
	}

	@Override
	public int withdraw(double amount) {
		if (amount > currentBalance + overdraftLimit) {
			System.out.println("Withdrawal denied: not enough funds");
			return 0;
		} else if (amount <= currentBalance) {
			currentBalance -= amount;
			System.out.println("Withdrawal allowed");
			System.out.println("Current Balance: " + currentBalance);
			return 1;
		} else {
			overdraftLimit -= (amount - currentBalance);
			currentBalance = 0;
			System.out.println("Withdrawal allowed");
			System.out.println("Current Balance: " + currentBalance);
			System.out.println("Overdraft Limit: " + overdraftLimit);
			return 1;
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance: " + currentBalance);
		System.out.println("Overdraft Limit: " + overdraftLimit);
	}
}
