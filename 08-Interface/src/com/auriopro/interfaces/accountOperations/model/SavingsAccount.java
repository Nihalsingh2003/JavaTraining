package com.auriopro.interfaces.accountOperations.model;

public class SavingsAccount implements IAccountOperations {
	double savingsAccountBalance = 1000;
	double withdrawLimit = 10000;

	@Override
	public void deposit(double amount) {
		System.out.println("--------------------------------------------------");
		System.out.println("Balance before deposit:" + savingsAccountBalance);
		savingsAccountBalance += amount;
		System.out.println("Balance After deposit:" + savingsAccountBalance);
		System.out.println("--------------------------------------------------");
	}

	@Override
	public int withdraw(double amount) {
		if (amount > savingsAccountBalance) {
			System.out.println("Insufficient Balance!");
			return 0;
		} else if (amount > 10000) {
			System.out.println("can not withdraw greater then withdrawLimit: "+withdrawLimit);
			return 0;
		} else {
			savingsAccountBalance -= amount;
			System.out.println("withdraw is successfull!");
			System.out.println("Balance after withdraw :" + savingsAccountBalance);
			return 1;
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("CurrentBalance: " + savingsAccountBalance);

	}

}
