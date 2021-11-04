package com.syntax.class11;

public class Car {
//voids contain behaviors--- cars can move forward/apply breaks
	
	String make;
	String model;
	String color;
	int year;
	double milage;

	void moveForward() {
		System.out.println("Moving forward");
	}

	void applyBreaks() {
		System.out.println("Applying breaks");
	}

	public static void main(String[] args) {

		Car alexisCar = new Car();
		//alexisCar.moveForward();
		alexisCar.make = "Honda";
		alexisCar.model = "Accord";
		alexisCar.color = "Burgundy";
		// alexisCar.year=2016;
		// alexisCar.milage=98000;

		System.out.println("Alexis Car is a " + alexisCar.make);
		System.out.println("Alexis Car model is an " + alexisCar.model);
		System.out.println("Alexis Car color is " + alexisCar.color);
		alexisCar.moveForward();
		//alexisCar.applyBreaks();
	}

}
