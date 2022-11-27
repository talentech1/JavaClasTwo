package com.tech.three;

public class ClassThree {

	public static void main(String[] args) {
		// Write a function that checks if a number is odd
		System.out.println(isOdd(10));
	}
	
	public static boolean isOdd(int number) {
		if(number % 2 !=0) {
			return true;
		}else {
			return false;
		}
	}

}
