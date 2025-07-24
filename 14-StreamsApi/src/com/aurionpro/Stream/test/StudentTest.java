package com.aurionpro.Stream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.Stream.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter details of Student" + (i + 1));
			System.out.println("Please Enter Student name:");
			String name = scanner.nextLine();
			System.out.println("Please Enter Student RollNumber:");
			int rollNumber = scanner.nextInt();
			System.out.println("Please Enter Student Cgpa:");
			double cgpa = scanner.nextDouble();
			scanner.nextLine();
			list.add(new Student(name, rollNumber, cgpa));

		}
//		// ascending
//		list.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
//		//dscending
//		list.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);
//		//ascending
//		list.stream().sorted(Comparator.comparing(Student::getRollNumber)).forEach(System.out::println);
//		list.stream().sorted(Comparator.comparing(Student::getRollNumber).reversed()).forEach(System.out::println);
//		//ascending
//		list.stream().sorted(Comparator.comparing(Student::getCgpa)).forEach(System.out::println);
//		list.stream().sorted(Comparator.comparing(Student::getCgpa).reversed()).forEach(System.out::println);
		
		
		list.stream().sorted(Comparator.comparing((Student s)->s.name).reversed()).forEach(System.out::println);
		
	}
}
