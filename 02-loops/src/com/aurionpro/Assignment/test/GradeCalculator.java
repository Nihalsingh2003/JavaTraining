package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The marks: ");
	int mark=scanner.nextInt();
	if(mark>90) {
		System.out.println("Grade: A");
	}else if(mark>=75 && mark<=89) {
		System.out.println("Grade: B");
	}else if(mark>=60 && mark<=84) {
		System.out.println("Grade: C");
	}else {
		System.out.println("Grade: D");
	}
}
}
