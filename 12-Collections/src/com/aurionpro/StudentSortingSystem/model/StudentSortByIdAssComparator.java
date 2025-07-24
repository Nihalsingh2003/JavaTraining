package com.aurionpro.StudentSortingSystem.model;

import java.util.Comparator;

public class StudentSortByIdAssComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return student1.id - student2.id;
	}

}
