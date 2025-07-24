package com.aurionpro.Movies.model;

import java.util.Comparator;

public class SortByYear implements Comparator<Movies> {

	@Override
	public int compare(Movies movie1, Movies movie2) {
		int compareYear=Integer.compare(movie2.year, movie1.year);
		if(compareYear==0) {
			return movie1.title.compareToIgnoreCase(movie2.title);
		}
		return compareYear;
	}

}
