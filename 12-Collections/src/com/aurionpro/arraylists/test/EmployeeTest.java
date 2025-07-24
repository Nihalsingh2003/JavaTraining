package com.aurionpro.arraylists.test;

import java.util.ArrayList;
import java.util.Collections;

import com.aurionpro.arraylists.model.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	ArrayList<Employee> employee=new ArrayList<Employee>();
	
	employee.add(new Employee(100,"Nihal"));
	employee.add(new Employee(101,"sahil"));
	employee.add(new Employee(99,"Gojo"));
	System.out.println(employee);
	Collections.sort(employee);
	System.out.println(employee);
}
}
