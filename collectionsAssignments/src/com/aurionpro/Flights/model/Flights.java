package com.aurionpro.Flights.model;

public class Flights {
	String airline;
	double fare;

	public Flights(String airline, double fare) {
		this.airline = airline;
		this.fare = fare;

	}

	@Override
	public String toString() {
		return "Flights [airline=" + airline + ", fare=" + fare + "]";
	}
	
}
