package com.aurionpro.abstraction.test;

import java.util.Scanner;

import com.aurionpro.abstraction.model.Developer;

import com.aurionpro.abstraction.model.Intern;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Developer[] developer = new Developer[2];

		Intern[] intern = new Intern[2];
		System.out.println("--------------Developer-----------------");
		for (int i = 0; i < developer.length; i++) {
			System.out.println("Enter the details of Developer"+(i+1));
			System.out.println("Enter the Developer Name:");
			String name = scanner.nextLine();
			System.out.println("Enter the Developer ID:");
			int id = scanner.nextInt();

			System.out.println("Enter the Developer salary:");
			double salary = scanner.nextDouble();
			
			scanner.nextLine();

			developer[i] = new Developer(name, id, salary);
			

		}
		
		for(Developer result:developer) {
			result.displayDetails();
		}
		System.out.println("--------------Intern-----------------");
		for (int i = 0; i < intern.length; i++) {
			System.out.println("Enter the details of Intern"+(i+1));
			System.out.println("Enter the Intern Name:");
			String name = scanner.nextLine();
			System.out.println("Enter the Intern ID:");
			int id = scanner.nextInt();

			System.out.println("Enter the Intern stipend:");
			double stipend = scanner.nextDouble();

			scanner.nextLine();

			intern[i] = new Intern(name, id, stipend);

		}
		for(Intern result:intern) {
			result.displayDetails();
		}
		scanner.close();
	}
}
