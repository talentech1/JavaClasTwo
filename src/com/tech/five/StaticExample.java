package com.tech.five;

class Student {
	String name;
	static int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void sayHello() {
		System.out.println("Hello!! Good Mornig!!");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	

}

public class StaticExample {
	public static void main(String[] args) {
		AbstractStudent lemon = new AbstractStudent("Lemon", 20);
		AbstractStudent mustafa = new AbstractStudent("Mustafa", 21);
		
		lemon.printInfo();
		mustafa.printInfo();
		lemon.age = 22;
		System.out.println("--------");
		lemon.printInfo();
		mustafa.printInfo();
	}
}
