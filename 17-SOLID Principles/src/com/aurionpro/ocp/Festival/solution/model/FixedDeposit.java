package com.aurionpro.ocp.Festival.solution.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest interest;

	

	public FixedDeposit(int accountNumber, String name, double principal, int duration, IFestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public double calculateSimpleInterst() {
		return (principal * interest.getInterestRate() * duration) / 100;

	}

}
