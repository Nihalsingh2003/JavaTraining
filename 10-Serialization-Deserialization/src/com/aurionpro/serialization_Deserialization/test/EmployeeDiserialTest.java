package com.aurionpro.serialization_Deserialization.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.serialization_Deserialization.model.Employee;

public class EmployeeDiserialTest {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("Employee.txt"));
	Employee employee2=(Employee)in.readObject();
	employee2.display();
	in.close();
}
}
