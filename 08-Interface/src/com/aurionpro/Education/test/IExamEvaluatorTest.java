package com.aurionpro.Education.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Education.model.IExamEvaluator;
import com.aurionpro.Education.model.OnlineQuiz;
import com.aurionpro.Education.model.PracticalExam;
import com.aurionpro.Education.model.TheoryExam;

public class IExamEvaluatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			try {
				System.out.println("Choose exam type (1-4): ");
				System.out.println("Exam Evaluation Menu");
				System.out.println("1. Theory Exam");
				System.out.println("2. Practical Exam");
				System.out.println("3. Online Quiz");
				System.out.println("4. Exit");

				int choice = scanner.nextInt();

				if (choice == 4) {
					System.out.println("Exiting program. Goodbye!");
					break;
				}

				if (choice < 1 || choice > 4) {
					System.out.println("Invalid choice. Please select between 1 and 4.");
					continue;
				}
				int marks;
				while (true) {
					try {
						System.out.print("Enter Total marks (0-100): ");
						marks = scanner.nextInt();
						if (marks >= 0 && marks <= 100) {
							break;
						} else {
							System.out.println("Invalid marks. Please enter a value between 0 and 100.");
						}
					} catch (InputMismatchException e) {
						System.out.println(e + ":Please enter only integer value");
						scanner.next();
					}

				}
				IExamEvaluator iexamEvaluator;
				switch (choice) {
				case 1:
					iexamEvaluator = new TheoryExam(marks);
					break;
				case 2:
					iexamEvaluator = new PracticalExam(marks);
					break;
				case 3:
					iexamEvaluator = new OnlineQuiz(marks);
					break;
				default:
					System.out.println("Unexpected error.");
					continue;
				}
				while (true) {
					try {
						System.out.println("Enter choice (1 or 2): ");
						System.out.println("1. Evaluate Marks");
						System.out.println("2. Calculate Grade");

						int action = scanner.nextInt();

						if (action == 1) {
							iexamEvaluator.evaluateMarks();
							break;
						} else if (action == 2) {
							System.out.println("Grade: " + iexamEvaluator.calculateGrade());
							break;
						} else {
							System.out.println("Invalid action selected.");
						}
					} catch (InputMismatchException e) {
						System.out.println(e + ":Please enter only integer value");
						scanner.next();
					}

				}

			} catch (InputMismatchException e) {
				System.out.println(e + ":Please enter only integer value");
				scanner.next();
			}
		}
	}
}
