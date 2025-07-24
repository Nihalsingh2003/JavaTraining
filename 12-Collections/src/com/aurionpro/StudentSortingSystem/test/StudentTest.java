package com.aurionpro.StudentSortingSystem.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.aurionpro.StudentSortingSystem.model.Student;
import com.aurionpro.StudentSortingSystem.model.StudentSortByIdAssComparator;
import com.aurionpro.StudentSortingSystem.model.StudentSortByIdDisComparator;
import com.aurionpro.StudentSortingSystem.model.StudentSortByNameAssComparator;
import com.aurionpro.StudentSortingSystem.model.StudentSortByNameDisComparator;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(100, "Nihal"));
		list.add(new Student(101, "sahil"));
		list.add(new Student(99, "Gojo"));

		System.out.println("what you want to short:");
		System.out.println("1.Id");
		System.out.println("2.name");
		int userInput = scanner.nextInt();
		int input;
		switch (userInput) {

		case 1:
			System.out.println("Select form below:");
			System.out.println("1.Ascending ");
			System.out.println("2.Descending ");
			input = scanner.nextInt();
			if (input == 1) {
				Collections.sort(list, new StudentSortByIdAssComparator());
			} else {
				Collections.sort(list, new StudentSortByIdDisComparator());
			}
			break;
		case 2:
			System.out.println("Select form below:");
			System.out.println("1.Ascending ");
			System.out.println("2.Descending ");
			input = scanner.nextInt();
			if (input == 1) {
				Collections.sort(list, new StudentSortByNameAssComparator());
			} else {
				Collections.sort(list, new StudentSortByNameDisComparator());
			}
		}

	}
}
