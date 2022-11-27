package com.tech.four;

public class Dog extends Animal{
	String breed;
	
	public Dog(String breed, int legs, String color, String size) {
		super(legs, color, size);
		this.breed = breed;
	}
	
}
