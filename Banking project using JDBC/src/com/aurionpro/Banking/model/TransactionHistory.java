package com.aurionpro.Banking.model;

import java.util.Date;

public class TransactionHistory {
	private int id;
	private int senderAccount_id;
	private int receiverAccount_id;
	private double amount;
	private Date transaction_date;
	private String transaction_type;
	public TransactionHistory(int id, int senderAccount_id, int receiverAccount_id, double amount,
			Date transaction_date, String transaction_type) {
		
		this.id = id;
		this.senderAccount_id = senderAccount_id;
		this.receiverAccount_id = receiverAccount_id;
		this.amount = amount;
		this.transaction_date = transaction_date;
		this.transaction_type = transaction_type;
	}
	public int getId() {
		return id;
	}
	public int getSenderAccount_id() {
		return senderAccount_id;
	}
	public int getReceiverAccount_id() {
		return receiverAccount_id;
	}
	public double getAmount() {
		return amount;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	
	

	
}
