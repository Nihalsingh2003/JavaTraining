package com.aurionpro.staticass.test;

import java.util.Scanner;

import com.aurionpro.staticass.model.ElectricityBill;

public class ElectricityBillTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ApartmentNumber:");
		int apartmentNumber = scanner.nextInt();
		System.out.println("Enter the unitsConsumed:");
		double unitsConsumed=scanner.nextDouble();
		ElectricityBill electricityBill=new ElectricityBill();
		electricityBill.setApartmentNumber(apartmentNumber);
		electricityBill.setUnitsConsumed(unitsConsumed);
		System.out.print("Current cost PerUnit: ");
		ElectricityBill.displayCurrentRate();
		electricityBill.displayBill();
		
		ElectricityBill.updateCostPerUnit(1);
		System.out.print("Current cost PerUnit after Update: ");
		ElectricityBill.displayCurrentRate();
		
		electricityBill.displayBill();
		scanner.close();
		
	}
}
