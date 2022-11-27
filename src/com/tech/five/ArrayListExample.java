package com.tech.five;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		// Add an Item
		cars.add("BMW");
		System.out.println(cars);
		cars.add("honda");
		System.out.println(cars);
		cars.set(1, "Toyota");
		System.out.println(cars.size());
		System.out.println(cars.get(1));
		
		ArrayList<Integer> testScores = new ArrayList<Integer>();
		testScores.add(33);
		testScores.add(45);
		testScores.add(33);
		int[] arr = { 4,5,3,5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i =0; i < testScores.size(); i++ ) {
			System.out.println(testScores.get(i));
		}
		
	}

}
