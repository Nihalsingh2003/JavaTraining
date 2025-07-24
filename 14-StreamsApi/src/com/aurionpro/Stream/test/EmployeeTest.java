package com.aurionpro.Stream.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.Stream.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<Employee>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the detail of Employee" + (i + 1));
			System.out.println("Enter a name:");
			String name = scanner.nextLine();
			System.out.println("Enter  salary:");
			double salary = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter date in format DD-MM-YYYY: ");
			String input = scanner.nextLine();
			LocalDate date = null;
			try {
				date = LocalDate.parse(input, formatter);

			} catch (Exception e) {
				System.out.println("Invalid date format." + e);
			}

			System.out.println("Enter Gender:");
			String gender = scanner.nextLine();

			list.add(new Employee(name, salary, date, gender));

		}

		list.stream().max(Comparator.comparing(e -> e.salary)).ifPresent(System.out::println);

		list.stream().sorted(Comparator.comparing((Employee e) -> e.salary).reversed()).skip(1).limit(1)
				.forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(e -> e.joiningDate)).findFirst().ifPresent(System.out::println);

		long count = list.stream().filter(e -> e.gender.equalsIgnoreCase("male")).count();
		System.out.println(count);

	}
}
