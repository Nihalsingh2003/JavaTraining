package com.aurionpro.GuitarApp.model;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", price=" + price + ", spec=" + spec + "]";
	}
}
