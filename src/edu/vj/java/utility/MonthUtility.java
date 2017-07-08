package edu.vj.java.utility;

public class MonthUtility {

	public void printMonthName(int monthNumber) {
		switch (monthNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.err.println("Not a valid month");

		}
	}

	public String getMonthName(int monthNumber) {
		String monthName = "";

		switch (monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		}
		return monthName;
	}
}
