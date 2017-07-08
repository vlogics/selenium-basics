package com.vj.java.basics.testprograms;

import edu.vj.java.basics.ExamResultService;

public class Test {

	public static void main(String[] args) {
		int marks=78;
		//create the instance of ExamResultService class
		ExamResultService examService = new ExamResultService();
		examService.printExamResult(marks);
		//print the grade
		examService.printGrade(marks);
	}
}
