package com.aurionpro.Candidates.model;

import java.util.Comparator;

public class SortByAge implements Comparator<Candidates> {

	@Override
	public int compare(Candidates candidate1, Candidates candidate2) {

		return candidate1.age - candidate2.age;
	}

}
