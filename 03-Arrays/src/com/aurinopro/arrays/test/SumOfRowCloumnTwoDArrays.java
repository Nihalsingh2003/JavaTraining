package com.aurinopro.arrays.test;

import java.util.Scanner;

public class SumOfRowCloumnTwoDArrays {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int[][] matrix=new int[3][3];
	
	
	System.out.println("Please Enter the value for 2D Arrays.");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			matrix[i][j]=scanner.nextInt();
		}
	}
	System.out.println("The Matrix is:");
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println(" ");
	}
	for(int i=0;i<3;i++) {
		int rowSum=0;
		for(int j=0;j<3;j++) {
			
			rowSum=rowSum+matrix[i][j];
			
		}
		System.out.println(rowSum);
	}
	for(int j=0;j<3;j++) {
		int columnSum=0;
		for(int i=0;i<3;i++) {
			
			columnSum=columnSum+matrix[j][i];
		}
		System.out.println(columnSum);
	}
	
}
}
