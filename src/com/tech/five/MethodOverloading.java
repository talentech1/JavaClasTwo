package com.tech.five;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(add(2,5));
		System.out.println(add(2.4, 3.5));
		System.out.println(add(2.4, 3.5, 4.5));
	}
	
	static int add(int x, int y) {
		return x + y;
	}

	static double add(double x, double y) {
		return x + y;
	}
	
	static double add(double x, double y, double z) {
		return x+y+z;
	}

}
