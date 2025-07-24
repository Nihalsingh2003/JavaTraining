package com.aurionpro.staticass.model;

public class ElectricityBill {
	private int apartmentNumber;
	private double unitsConsumed;
	private static double costPerUnit = 2.5;

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}
	

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public double calculateBillAmount() {
		return unitsConsumed * costPerUnit;
	}

	public static void updateCostPerUnit(double cost) {
		costPerUnit = cost;
	}

	public static double displayCurrentRate() {
		 return costPerUnit;
	}

	public void displayBill() {
		System.out.println("-------Bill-------- ");
		System.out.println("ApartmentNumber: " + apartmentNumber);
		System.out.println("UnitsConsumed: " + unitsConsumed);
		System.out.println("CostPerUnit: " + costPerUnit);
		System.out.println("Bill Amount: " + calculateBillAmount());

	}

}
