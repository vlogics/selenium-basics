package edu.vj.java.basics;

public class Laptop {

	public static void main(String[] args) {
		//System.out.println("Hello this is my first java program");
		//I want to add two numbers?
		//Create the instance of Calculator.
		Calculator calculator = new Calculator();
		int result=0;
		
		result = calculator.addNumbers(10, 5);
		System.out.println("Result =" + result);
		result = calculator.multiplyNumbers(10, 5);
		System.out.println("Result =" + result);
		
		
		Paint paint = new Paint();
		paint.drawCircle(5, "red");
		paint.drawRectangle(10, 5, "green");
	}
}
