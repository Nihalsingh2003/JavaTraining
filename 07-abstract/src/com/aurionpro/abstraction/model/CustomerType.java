package com.aurionpro.abstraction.model;

public enum CustomerType {
	RESIDENTIALCUSTOMER(5,0), COMMERCIALCUSTOMER(0,8);

	private int residentialUnitPrice;
	private int commercialUnitPrice;

	private CustomerType(int residentialUnitPrice, int commercialUnitPrice) {
		this.commercialUnitPrice = commercialUnitPrice;
		this.residentialUnitPrice = residentialUnitPrice;
	}
	public int getResidentialUnitPrice() {
		return residentialUnitPrice;
	}
	public int getCommercialUnitPrice() {
		return commercialUnitPrice;
	}
}
