package com.aurionpro.GuitarApp.model;

import java.util.List;

public class Search {

	public List<Guitar> search(GuitarList list, GuitarSpec specs) {
		return list.getGuitarData().stream().filter(guitar -> guitar.getSpec().matches(specs)).toList();

	}



}
