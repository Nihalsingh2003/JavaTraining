package com.aurionpro.oops.test;

import java.util.Scanner;

import com.aurionpro.oops.model.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Employee[] employee=new Employee[2];
	
	for(int i=0;i<2;i++) {
		System.out.println("Enter the details of employee "+(i+1));
		System.out.println("Enter the Employee Name: ");
		String employeeName=scanner.nextLine();
		System.out.println("Enter the Employee Id: ");
		int employeeId=scanner.nextInt();
		System.out.println("Enter the Employee BasicSalary: ");
		int basicSalary=scanner.nextInt();
		scanner.nextLine();
		employee[i]=new Employee();
		employee[i].setName(employeeName);
		employee[i].setId(employeeId);
		employee[i].setBasicSalary(basicSalary);
	}
	int i=0;
	for(Employee result:employee) {
		
		System.out.println("SalarySlip of Employee "+(i+1));
		result.generateSalarySlip();
		i++;
	}
	scanner.close();
}
}
