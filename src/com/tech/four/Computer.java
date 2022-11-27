package com.tech.four;

public class Computer {
	
	private Computer() {
		System.out.println(brand);
		System.out.println(hardDrive);
	}
	
	Computer c = new Computer();
	
	
	String brand = "Apple";
	int hardDrive = 500;
	
	public void turnOn() {
		System.out.println("Laptop is on");
	}
	
	public void turnOff() {
		System.out.println("Laptop is off");
	}

}
