package com.aurionpro.ocp.Festival.violation.model;

import com.aurionpro.ocp.Festival.solution.model.IFestivalInterest;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType type;

	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType type) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.type = type;
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
		if(type==FestivalType.NEWYEAR) {
			return (principal * 8 * duration) / 100;
		}else if(type==FestivalType.DIWALI) {
			return (principal * 8.5 * duration) / 100;
		}else if(type==FestivalType.HOLI) {
			return (principal * 7.5 * duration) / 100;
		}else if(type==FestivalType.OTHERS) {
			return (principal * 6.5 * duration) / 100;
		}
		return 0;
		

	}

}
