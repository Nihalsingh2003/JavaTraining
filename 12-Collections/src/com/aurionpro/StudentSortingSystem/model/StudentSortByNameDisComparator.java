package com.aurionpro.StudentSortingSystem.model;

import java.util.Comparator;

public class StudentSortByNameDisComparator  implements Comparator<Student>  {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return student2.name.compareToIgnoreCase(student1.name);
	}

}
