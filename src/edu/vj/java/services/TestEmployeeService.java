package edu.vj.java.services;

public class TestEmployeeService {

	public static void main(String[] args) {
		Employee e1 = new Employee(100,"Arun","Kumar");
		Employee e2 = new Employee(101,"Kishore","Kumar");
		
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		
		System.out.println("-------");
		System.out.println(e2.getEmployeeId());
		System.out.println(e2.getFirstName());
		System.out.println(e2.getLastName());
	}
}
