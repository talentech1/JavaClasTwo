package com.tech.four;

public class HomeworkTwo {
	
	public static void main(String[] args) {
		for(int i =-7; i<=100; i++ ) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime(int number) {
		if(number <2) {
			return false;
		}
		
		int devider = 2;
		while(devider <= number/2 ) {
			if(number % devider == 0) {
				return false;
			}
			devider++;
		}
		return true;
	}

}
