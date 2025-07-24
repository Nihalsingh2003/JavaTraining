package com.aurionpro.Stream.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,34,45,1,6);
	ArrayList<Student>studentList=new ArrayList<Student>();
	studentList.add(new Student("Nihal",12,45));
	studentList.add(new Student("Singh",12,40));
	list.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
	
	studentList.stream().max(Comparator.comparing(s->s.cgpa)).ifPresent(System.out::println);
	
	list.stream().filter(number->number%2==0).max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
}
}
