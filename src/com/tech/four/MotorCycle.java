package com.tech.four;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MotorCycle {
	int wheels = 2;
	String color;
	int maxSpeed;
	int fuelCapacity;
	int mpg = 10;
	
	public MotorCycle(int maxSpeed, int fuelCapacity, String color) {
		this.maxSpeed = maxSpeed;
		this.fuelCapacity = fuelCapacity;
		this.color = color;
	}
	
	public void ride(int miles) {
		if((fuelCapacity - (miles/mpg))>0) {
			fuelCapacity= fuelCapacity - (miles/mpg);
			System.out.println("Not Enough Gas for give distance");
		}else {
			System.out.println("Motor cycle is riding " + miles);
		}
		
	}
	
	public void honk() {
		System.out.println("Honk!! Honk!! ");
	}
	
	public void printInfo() {
		System.out.println("Color: "+ color);
		System.out.println("maxSpeed: "+ maxSpeed);
		System.out.println("fuelCapacity: "+ fuelCapacity);
		System.out.println("--------");
	}


}
