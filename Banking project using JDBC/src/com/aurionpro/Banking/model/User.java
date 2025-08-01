package com.aurionpro.Banking.model;

import java.util.List;

public class User {
	private int userId;
	private String name;
	private String mobileNo;
	private List<Integer> accountId;

	public User(int userId, String name, String mobileNo, List<Integer> accountId) {
		this.userId = userId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.accountId = accountId;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public List<Integer> getAccountId() {
		return accountId;
	}

}
