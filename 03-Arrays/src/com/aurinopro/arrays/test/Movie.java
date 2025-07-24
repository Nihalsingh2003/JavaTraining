package com.aurinopro.arrays.test;

public class Movie {
	String movieTitle;
	String genre;

	public Movie(String movieTitle, String genre) {
		this.movieTitle = movieTitle;
		this.genre = genre;
	}

	public void display() {
		
		if (genre.equalsIgnoreCase("action")) {
			System.out.println("MovieTitle: " + movieTitle);
		}
	}

}
