package com.aurionpro.oops.test;

import java.util.Scanner;

import com.aurionpro.oops.model.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	BankAccount[] bankAccount = new BankAccount[2];
	for(int i=0;i<2;i++) {
		System.out.println("For BankAccount"+(i+1));
		System.out.println("Please Enter Account Number: ");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please Enter Account Holder: ");
		String accountHolder = scanner.nextLine();
		System.out.println("Please Enter Balance: ");
		double balance = scanner.nextDouble();
		scanner.nextLine();
		bankAccount[i]=new BankAccount();
		bankAccount[i].setAccountNumber(accountNumber);
		bankAccount[i].setAccountHolder(accountHolder);
		bankAccount[i].setBalance(balance);
	}
	for(BankAccount result:bankAccount) {
		result.checkBalance();
	}
	scanner.close();
}}
