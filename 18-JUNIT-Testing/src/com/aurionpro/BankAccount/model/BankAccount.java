package com.aurionpro.BankAccount.model;

public class BankAccount {
private double balance;

public BankAccount(double balance) {
	
	this.balance = balance;
}
public void deposit(double amount) {
	if(amount<=0)throw new IllegalArgumentException();
	balance+=amount;
}
public void withDraw(double amount) {
	if(amount > balance) throw new IllegalArgumentException();
	balance-=amount;
}
public double  getBalance() {
	return balance;
}

}
