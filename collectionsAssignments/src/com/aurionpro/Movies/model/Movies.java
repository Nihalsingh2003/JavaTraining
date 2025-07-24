package com.aurionpro.Movies.model;

public class Movies {
	String title;
	int year;

	public Movies(String title, int year) {
		this.title = title;
		this.year = year;

	}

	@Override
	public String toString() {
		return "Movies [title=" + title + ", year=" + year + "]";
	}
	
}
