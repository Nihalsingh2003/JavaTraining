package com.aurionpro.Flights.model;

import java.util.Comparator;

public class SortByFare implements Comparator<Flights> {

	@Override
	public int compare(Flights flights1, Flights flights2) {

		return Double.compare(flights2.fare, flights1.fare);
	}

}
