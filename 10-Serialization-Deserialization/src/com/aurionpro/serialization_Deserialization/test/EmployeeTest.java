package com.aurionpro.serialization_Deserialization.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.serialization_Deserialization.model.Employee;

public class EmployeeTest {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Employee employee=new Employee("Nihal",23,24);
	
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Employee.txt"));
	out.writeObject(employee);
	out.close();
	
}
}
