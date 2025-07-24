package com.aurionpro.Game.model;

public class Board {
	public char[][] grid = new char[3][3];

	public Board() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = ' ';
			}
		}
	}

	public void displayBoard() {
		System.out.println("Current Board:");

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				System.out.print(" " + (grid[i][j] == ' ' ? ' ' : grid[i][j]) + " ");

				if (j < grid[i].length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();

			if (i < grid.length - 1) {
				System.out.println("---+---+---");
			}
		}
		System.out.println();
	}

	public boolean isFull() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;
	}

	public boolean isCellEmpty(int row, int col) {
		return grid[row][col] == ' ';
	}

	public boolean placeSymbol(int row, int col, char symbol) {
		if (isCellEmpty(row, col)) {
			grid[row][col] = symbol;
			return true;
		}
		return false;
	}

}
