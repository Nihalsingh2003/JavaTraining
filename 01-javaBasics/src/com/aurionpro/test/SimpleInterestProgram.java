package com.aurionpro.test;

import java.util.Scanner;

public class SimpleInterestProgram {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Please Enter The Principle Amount.");
	float userPrincipleAmount=scanner.nextFloat();
	
	System.out.println("Please Enter the rate of interest.");
	float userRateAmount=scanner.nextFloat();
	System.out.println("Please Enter the period");
	float userTimePeriod=scanner.nextFloat();

	float usersimpleinterest=simpleinterest(userPrincipleAmount,userRateAmount,userTimePeriod);
	System.out.println("SimpleInterest: " + usersimpleinterest);
}
public static float simpleinterest(float userPrincipleAmount,float userRateAmount,float userTimePeriod ) {
	return (userPrincipleAmount*userRateAmount*userTimePeriod)/100;
}
}
