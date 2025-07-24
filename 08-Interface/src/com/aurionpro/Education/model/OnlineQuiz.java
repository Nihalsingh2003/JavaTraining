package com.aurionpro.Education.model;

public class OnlineQuiz implements IExamEvaluator {
	private int marks;

	public OnlineQuiz(int marks) {
		this.marks = marks;
	}

	@Override
	public void evaluateMarks() {
		System.out.println("Evaluating online quiz with auto-grading system. Marks: " + marks);
	}

	@Override
	public String calculateGrade() {
		if (marks >= 80)
			return "A";
		else if (marks >= 60)
			return "B";
		else if (marks >= 40)
			return "C";
		else
			return "D";
	}
}
