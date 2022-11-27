package com.tech.five;

import java.util.Arrays;

public class JavaQuizo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		String name = "Nafis";
		// 2 
		String[] names = new String[5];
		// 3
		Double[] testResult = { 90.5, 75.0, 80.8, 39.0, 64.2, 89.7};
		testResult[2] = 60.8;
		
		// 4
		for(int i=0; i<=4; i++) {
			System.out.println(i);
		}
		
		int[] testScore = {89,90,70,60};
		addElement(testScore, 77);
		
	}
	// 5
	public static String[] add(String[] arr) {
		return arr;
	}
	// 6
	public static int[] addElement(int[] arr, int val) {
		int arrayLength = arr.length + 1;
		int[] newArray = new int[arrayLength]; // [][][][][][]
		for(int i=0; i<arr.length; i++) {
			newArray[i] = arr[i];
		}
		newArray[newArray.length - 1] = val;
		
		
		System.out.println(Arrays.toString(newArray));
		return newArray;
	}
}
