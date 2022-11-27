package com.lesson.five;

public class LoopsProblems {

	public static void main(String[] args) {
		int[] testScores = { 68, 90, 82, 50, 87, 89};
		for(int i=0; i<testScores.length; i++) {
			System.out.println(testScores[i]);
			if(testScores[i] <85) {
				System.out.println(testScores[i] + 10);
			}else {
				System.out.println(testScores[i]);
			}
			System.out.println("---------");
		}
		
		
	}

}
