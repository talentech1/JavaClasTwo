package com.lesson.five;

public class ContinueExample {

	public static void main(String[] args) {
		// 2,4, 6,8,10,10,14
		for(int i=2; i<=15; i=i+2) {
			System.out.println("Candy given to student: "+ i);
		}
		
		// 1, 2,3,4,5,...15
		for(int i=1; i<=15; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println("Candy given to student: "+ i);
		}


	}

}
