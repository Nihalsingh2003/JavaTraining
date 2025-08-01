package com.aurionpro.Banking.test;

import com.aurionpro.Banking.exception.DatabaseException;
import com.aurionpro.Banking.model.Banking;

public class BankingTest {
public static void main(String[] args) throws DatabaseException {
	Banking bank=new Banking();
	bank.start();
}
}
