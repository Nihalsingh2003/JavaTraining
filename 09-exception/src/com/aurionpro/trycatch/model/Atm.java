package com.aurionpro.trycatch.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int balance=10000;
	try {
		System.out.println("Enter the Amount to withdarw:");
		int userAmount=scanner.nextInt();
		if(userAmount>balance) {
			throw new ArithmeticException("unSufficient balance");
		}
		else {
			balance-=userAmount;
			System.out.println("Your updated balance:"+balance);
		}
		
	}catch(InputMismatchException e) {
		System.out.println(e);
	}finally {
		System.out.println("Transaction session ended.");
	}
}
}
