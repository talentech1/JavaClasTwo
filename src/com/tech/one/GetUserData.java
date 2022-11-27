package com.tech.one;
import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = myScanner.nextLine();
		
		System.out.println("Enter your age");
		int age = myScanner.nextInt();
		
		System.out.println(name + " " + age);
		
		Double[] testResult = { 90.5, 75.0, 80.8, 39.0, 64.2, 89.7};
		int[] age1 = {3,4};

	}

}
