package com.aurionpro.forloop.test;

public class Factorial {
public static void main(String[] args) {
	int number=4;
	int factorial=1;
	for(int i=1;i<=number;i++) {
		factorial=factorial*i;
	}
	System.out.print("Factorial: " + factorial);
}
}
