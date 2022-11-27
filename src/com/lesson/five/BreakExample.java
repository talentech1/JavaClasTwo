package com.lesson.five;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of candies");
		int candiesLeftInBag = input.nextInt();
		
		for(int i=1; i<=15; i++) {
			if(candiesLeftInBag <=0) {
				break;
			}
			System.out.println("candy give to student: " + i);
			candiesLeftInBag--;
			System.out.println(candiesLeftInBag);
		}
		
	}

}
