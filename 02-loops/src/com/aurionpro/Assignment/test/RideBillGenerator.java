package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class RideBillGenerator {
public static void main(String[] args) {
	int totalBill=0;
	int rideBill=0;
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Please Enter Your Height in CM: ");
	int userHeight=scanner.nextInt();
	
	
	if(userHeight>120) {
		System.out.print("Enter your Age: ");
		int age=scanner.nextInt();
		if(age<12) {
			rideBill+=5;				
		}
		else if(age>=12 && age<=18) {
			rideBill+=7;
		}
		else if(age>=18) {
			rideBill+=12;
		}
		else if(age==45 && age<=55) {
			rideBill+=0;
		}
		System.out.print("Did you want Photos: ");
		System.out.println("choose 1 for Yes or 2 for N0");
		int option=scanner.nextInt();
		switch(option) {
		case 1:
			totalBill=rideBill+3;
			System.out.println("Your TotalBill is: " + totalBill);
			break;
		
		case 2:
			totalBill=rideBill;
			System.out.println("Your TotalBill is: " + totalBill);
			break;
		default:
			System.out.println("Please Enter Correct Option between 1 and 2!");
			
		}
		
	}else {
		System.out.println("You are not allowed to ride!");
	}
	scanner.close();
}
}
