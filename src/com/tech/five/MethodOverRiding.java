package com.tech.five;

class abstract Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow fasdfsad");
	}
}

public class MethodOverRiding {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalSound();
	}
}