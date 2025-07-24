package com.aurionpro.Education.model;

public class PracticalExam implements IExamEvaluator {
	private int marks;

	public PracticalExam(int marks) {
		this.marks = marks;
	}

	@Override
	public void evaluateMarks() {
		System.out.println("Evaluating practical exam with lab performance. Marks: " + marks);
	}

	@Override
	public String calculateGrade() {
		if (marks >= 85)
			return "A";
		else if (marks >= 70)
			return "B";
		else if (marks >= 50)
			return "C";
		else
			return "D";
	}
}
