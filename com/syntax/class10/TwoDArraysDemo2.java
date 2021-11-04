package com.syntax.class10;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		
		//Lets create an 2D array of groceries 
		
	String[][] groceries = {
			
			{"banana", "apple", "mango"},
			{"potato", "tomato"},
			{"milk", "cheese", "ayran", "yogurt"}
			
	};
	System.out.println(groceries.length);//# of arrays

	System.out.println(groceries[2][3]);//yogurt
	//I want to find how elements my 1 array has
	System.out.println("# of elements inside 1 array= "+groceries[0].length);
	System.out.println("# of elements inside 2 array= "+groceries[1].length);
	System.out.println("# of elements inside 3 array= "+groceries[2].length);
		
	//how do we get all elements from 2D arrays???
	for(int i=0; i<groceries.length; i++) {
		for(int j=0; j<groceries.length; j++) {
			System.out.print(groceries[i][j]+" ");
		}
		
		System.out.println();
		
		
		
	}
		
	}
}
