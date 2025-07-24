package com.aurionpro.Transactions.model;

import java.util.Comparator;

public class SortByAmount implements Comparator<Transactions> {

	@Override
	public int compare(Transactions transaction1, Transactions transaction2) {
		int compareAmount = Double.compare(transaction2.amount, transaction1.amount);
		if (compareAmount == 0) {
			return Double.compare(transaction1.id, transaction2.id);
		}
		return compareAmount;
	}

}
