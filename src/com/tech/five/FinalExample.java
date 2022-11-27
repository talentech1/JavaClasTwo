package com.tech.five;

class FinalDemo {
	// create a final method
	public void display() {
		System.out.println("This is a final method.");
	}
}

class FinalExample extends FinalDemo {
	public void display() {
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		FinalExample obj = new FinalExample();
		obj.display();
	}
}
