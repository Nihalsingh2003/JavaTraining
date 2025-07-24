package com.aurionpro.Candidates.model;

import java.util.Comparator;

public class SortByName implements Comparator<Candidates> {

	@Override
	public int compare(Candidates candidate1, Candidates candidate2) {

		int nameCompare = candidate1.name.compareToIgnoreCase(candidate2.name);
		if (nameCompare == 0) {
			return candidate1.age - candidate2.age;
		}
		return nameCompare;
	}

}
