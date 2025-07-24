package com.aurionpro.Transportation.model;

public class Truck implements IVehicleControl {
	boolean isStart = false;
	boolean isStop = false;
	int currentGear = 0;

	@Override
	public void start() {
		if (isStart) {
			System.out.println("TRUCK is Already Started..........");
		} else {
			isStart = true;
			isStop = false;
			System.out.println("Truck is Starting.......");
		}
	}

	@Override
	public void stop() {
		if (isStop) {
			System.out.println("TRUCK is Already Stopped..........");
		} else if (!isStart) {
			System.out.println("Truck must be started to Stop.");
		} else {
			isStop = true;
			isStart = false;
			currentGear = 0;
			System.out.println("Truck is Stopping.......");
		}
	}

	@Override
	public int changeGear(int gear) {
		if (!isStart) {
			System.out.println("Truck must be started to change gear.");
			return currentGear;
		}
		if (gear < 1 || gear > 4) {
			System.out.println("Invalid gear selected.");
			return currentGear;
		}
		currentGear = gear;
		System.out.println("Gear changed to: " + getGearName(currentGear));
		return currentGear;
	}

	private String getGearName(int gear) {
		switch (gear) {
			case 1: return "First Gear";
			case 2: return "Second Gear";
			case 3: return "Third Gear";
			case 4: return "Fourth Gear";
			default: return "Unknown";
		}
	}
}
