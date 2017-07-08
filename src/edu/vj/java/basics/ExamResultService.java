package edu.vj.java.basics;

public class ExamResultService {

	/**
	 * This method prints the exam result either pass/fail for the given marks.
	 * @param marks - marks obtained in exam
	 */
	public void printExamResult(int marks) {
		if (marks >= 35) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
	/**
	 * This method prints the student's grade for the given marks.
	 * @param marks - marks obtained in exam
	 */
	public void printGrade(int marks) {
		if (marks >= 75) {
			System.out.println("Distinction");
		} else if (marks >= 60) {
			System.out.println("First class");
		} else if (marks >= 50) {
			System.out.println("Second class");
		} else if (marks >= 35) {
			System.out.println("Third class");
		} else {
			System.out.println("Better luck next time");
		}
	}

}
