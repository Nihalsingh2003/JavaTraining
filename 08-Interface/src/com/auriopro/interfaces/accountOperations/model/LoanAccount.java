package com.auriopro.interfaces.accountOperations.model;

public class LoanAccount implements IAccountOperations {
	double loanAmount = 0;
	double annualRate = 12;
	int tenureMonths = 12;
	double loanBalance = 500000;

	@Override
	public void deposit(double amount) {
		if (loanAmount == 0) {
			System.out.println("You don't have any loan!");
		} else if (amount <= loanAmount) {
			loanAmount -= amount;
			System.out.println("Amount Repay successfully.");
			System.out.println("Remaining loan amount: " + loanAmount);
		} else {
			System.out.println("Amount exceeds current loan amount! Your current loan: " + loanAmount);
		}
	}

	@Override
	public int withdraw(double amount) {
		double loanLimit = 500000;

		if (loanAmount + amount <= loanLimit) {
			System.out.println("----------------------------------");
			System.out.println("Previous Loan Amount: " + loanAmount);
			loanAmount += amount;
			loanBalance -= amount;
			System.out.println("Loan Amount Approved!");
			System.out.println("New Loan Amount: " + loanAmount);
			return 1;
		} else {
			System.out.println("Cannot withdraw. Requested amount exceeds loan limit.");
			return 0;
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Your current loanAmount is:" + loanAmount);

	}

}
