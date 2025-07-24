package com.aurionpro.Candidates.model;

public class Candidates {
	String name;
	int age;

	public Candidates(String name, int age) {
		this.name = name;
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Candidates [name=" + name + ", age=" + age + "]";
	}

}
