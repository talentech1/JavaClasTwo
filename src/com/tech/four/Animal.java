package com.tech.four;

public class Animal {
	int legs;
	String color;
	String size;
	
	public Animal(int legs, String color, String size) {
		this.legs = legs;
		this.color = color;
		this.size = size;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void makeNoise() {
		System.out.println("Making Noise");
	}
	
	public void run() {
		System.out.println("Running");
	}

}
