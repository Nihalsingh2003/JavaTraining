package com.aurionpro.Transactions.model;

public class Transactions {
	int id;
	double amount;

	public Transactions(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transactions [id=" + id + ", amount=" + amount + "]";
	}
	
}
