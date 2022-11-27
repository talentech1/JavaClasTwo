package com.lesson.five;

public class MethodExample {

	public static void main(String[] args) {
		String[] names = {"Alan", "Imtiaz", "Hasina", "Simon"};
		for(int i=0; i<names.length; i++) {
			sayHellow(names[i]);
		}

	}
	
	public static double subs(double a, double b) {
		double result = a-b;
		return result;
	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void sayHellow(String name) {
		System.out.println("Hi " + name);
	}

}
