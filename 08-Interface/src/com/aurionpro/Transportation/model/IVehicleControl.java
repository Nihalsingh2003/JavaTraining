package com.aurionpro.Transportation.model;

public interface IVehicleControl {
	void start();

	void stop();

	int changeGear(int gear);
}
