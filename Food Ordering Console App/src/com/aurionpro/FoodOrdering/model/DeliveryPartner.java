package com.aurionpro.FoodOrdering.model;

public class DeliveryPartner {
	private int id;
	private String name;
	private String contactNumber;

	public DeliveryPartner(int id, String name, String contactNumber) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Contact: " + contactNumber;
	}
}
