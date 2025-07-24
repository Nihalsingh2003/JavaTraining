package com.aurionpro.whileloop.test;

public class Factorial {
public static void main(String[] args) {
	int number=6;
	int factorial=1;
	int i=1;
	while(i<=number) {
		factorial*=i;
		i++;
	}
	System.out.print("Factorial: " + factorial);	
}
}
