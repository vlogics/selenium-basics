package edu.vj.java.basics;
public class WorkingWithConditions {

	public static void main(String[] args) {

		int marks = 10;
		if (marks >= 35) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		if(marks >= 75){
			System.out.println("Distinction");
		}else if(marks >=60){
			System.out.println("First class");
		}else if(marks >=50){
			System.out.println("Second class");
		}else if(marks >=35){
			System.out.println("Third class");
		}else{
			System.out.println("Better luck next time");
		}
	}
}
