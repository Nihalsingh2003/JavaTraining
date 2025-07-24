package com.aurionpro.StudentSortingSystem.model;

import java.util.Comparator;

public class StudentSortByIdDisComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student2.id - student1.id;
		
	}

	

}
