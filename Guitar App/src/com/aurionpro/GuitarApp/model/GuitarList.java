package com.aurionpro.GuitarApp.model;

import java.util.ArrayList;
import java.util.List;

public class GuitarList {
	List<Guitar> guitarData;

	public GuitarList() {
		guitarData = new ArrayList<>();
	}

	public void addGuitar(Guitar guitar) {
		guitarData.add(guitar);
	}

	public List<Guitar> getGuitarData(String serialNumber) {
		return guitarData.stream().filter(s -> s.getSerialNumber().equalsIgnoreCase(serialNumber)).toList();
	}
	public List<Guitar> getGuitarData() {
		return guitarData;
	}

}
