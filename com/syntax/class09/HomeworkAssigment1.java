package com.syntax.class09;

public class HomeworkAssigment1 {

	public static void main(String[] args) {

//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String[] cars= new String[6];


		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Acura";
		cars[3] = "BMW";
		cars[4] = "Nissan";
		cars[5] = "Chevy";

		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars[4]);
		System.out.println(cars[5]);

		System.out.println("-----------");
		
		//System.out.println(cars[0]+" "+cars[1]+" "+cars[2]+" "+cars[3]+" "+cars[4]+" "+cars[5]);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}}


