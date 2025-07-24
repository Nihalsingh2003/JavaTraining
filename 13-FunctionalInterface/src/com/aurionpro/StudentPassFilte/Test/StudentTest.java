package com.aurionpro.StudentPassFilte.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.aurionpro.StudentPassFilte.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Nihal",23));
		list.add(new Student("Singh",50));
		list.add(new Student("Raj",60));
		list.add(new Student("sahil",40));
		list.add(new Student("Aditya",70));
		
		System.out.println(list);
		
		Predicate<Integer> predicate=(marks)->marks>=40;
		System.out.println("----------------------------");
		for(Student result:list) {
			if(predicate.test(result.getMarks())) {
				System.out.println(result);
			}
			
		}
	}
}
