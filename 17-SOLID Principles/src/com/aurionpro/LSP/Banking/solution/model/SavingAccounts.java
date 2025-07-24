package com.aurionpro.LSP.Banking.solution.model;

public class SavingAccounts implements IDeposit,IWithdraw {

	@Override
	public void withdraw() {
		System.out.println("Withdraw is allowed");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit is allowed");
		
	}

}
