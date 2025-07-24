package com.aurionpro.LSP.Banking.solution.Test;

import com.aurionpro.LSP.Banking.solution.model.FixDeposit;
import com.aurionpro.LSP.Banking.solution.model.SavingAccounts;

public class AccountTest {
public static void main(String[] args) {
	FixDeposit fd=new FixDeposit();
	fd.deposit();
	SavingAccounts saving=new SavingAccounts();
	saving.withdraw();
}
}
