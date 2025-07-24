package com.aurionpro.inheritence.test;

import com.aurionpro.inheritence.model.Bike;
import com.aurionpro.inheritence.model.Car;

public class VehicleTest {
public static void main(String[] args) {
	Car car=new Car();
	Bike bike=new Bike();
	
	car.features();
	car.start();
	bike.features();
	bike.start();
}
}
