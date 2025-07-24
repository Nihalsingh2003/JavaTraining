package com.aurionpro.oops.test;

import java.util.Scanner;

import com.aurionpro.oops.model.Employees;

public class EmployeesTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Employees[] employee = new Employees[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the details of Employee:" + (i + 1));
			System.out.println("Enter the Employee name:");
			String name = scanner.nextLine();
			System.out.println("Enter the Employee salray:");
			double salary = scanner.nextDouble();
			System.out.println("Enter the Bonus:");
			double bonus = scanner.nextDouble();
			scanner.nextLine();
			employee[i] = new Employees();
			employee[i].setName(name);
			employee[i].setSalary(salary);
			employee[i].setBonus(bonus);

		}
		for (Employees result : employee) {
			result.displaySalary();
		}
	}
}
