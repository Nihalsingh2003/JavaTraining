package com.aurionpro.movie.test;

import java.util.Scanner;

import com.aurinopro.arrays.test.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 5 movie data :");
		Movie[] movies = new Movie[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the MovieTitle:");
			String movieTitle = scanner.nextLine();
			System.out.println("Enter the Genre:");
			String genre = scanner.nextLine();
			movies[i] = new Movie(movieTitle, genre);
		}
		for (Movie result : movies) {
			result.display();
		}
	}
}
