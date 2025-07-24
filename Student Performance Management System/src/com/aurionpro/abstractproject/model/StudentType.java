package com.aurionpro.abstractproject.model;

public enum StudentType {
	SCIENCE(" Physics", "Chemistry", "Math"), COMMERCE("Accounts", "Business Studies", "Economics"),
	ARTS(" History", "Political Science", "Sociology");

	private String subject1;
	private String subject2;
	private String subject3;

	StudentType(String subject1, String subject2, String subject3) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	public String getSubject1() {
		return subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public String getSubject3() {
		return subject3;
	}

}
