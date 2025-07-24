package com.aurionpro.Education.model;

public class TheoryExam implements IExamEvaluator {
	private int marks;

	public TheoryExam(int marks) {
		this.marks = marks;
	}

	@Override
	public void evaluateMarks() {
		System.out.println("Evaluating theory exam with written answers. Marks: " + marks);
		System.out.println("----------------------------------------");
	}

	@Override
	public String calculateGrade() {
		if (marks >= 90)
			return "A+";
		else if (marks >= 75)
			return "A";
		else if (marks >= 60)
			return "B";
		else
			return "C";
	}
}
