package com.syntax.class09;

public class HwAssignment2 {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.
		
		String[] animals= new String[6];
		
		animals[0] = "cat";
		animals[1] = "dog";
		animals[2] = "hamster";
		animals[3] = "zebra";
		animals[4] = "lion";
		animals[5] = "elephant";
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		System.out.println(animals[4]);
		System.out.println(animals[5]);
		
		System.out.println("-----------");
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);

	}

}}
