package com.tech.four;

public class Student {
	String firstName;
	String lastName;
	int age;
	double gpa;
	
	public Student(String firstName, String lastName, int age, double gpa ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
	}
	
	public void printInfo() {
		System.out.println(firstName+ " "+ lastName);
		System.out.println(age);
	}
	

}
