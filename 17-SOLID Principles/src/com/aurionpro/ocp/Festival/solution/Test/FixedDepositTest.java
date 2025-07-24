package com.aurionpro.ocp.Festival.solution.Test;

import com.aurionpro.ocp.Festival.solution.model.DiwaliInterest;
import com.aurionpro.ocp.Festival.solution.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(123, "Nihal", 1000, 2, new DiwaliInterest());
		System.out.println("DiwaliInterest is:"+fixedDeposit.calculateSimpleInterst());
	}
}
