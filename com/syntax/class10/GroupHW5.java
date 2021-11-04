package com.syntax.class10;

public class GroupHW5 {

	public static void main(String[] args) {

		// #5-Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

		String[] countries = new String[6];

		countries[0] = "Bolivia = La Paz";
		countries[1] = "Peru = Lima";
		countries[2] = "Columbia = Bogota";
		countries[3] = "Italy = Rome";
		countries[4] = "Germany = Berlin";
		countries[5] = "Japan = Tokyo";
		
		//Six Print statements to print the Array --> NOT A LOOP
		//System.out.println(countries[0]);
		//System.out.println(countries[1]);
		//System.out.println(countries[2]);
		//System.out.println(countries[3]);
		//System.out.println(countries[4]);
		//System.out.println(countries[5]);

	
		//First Loop
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
		System.out.println("------");
		//Second Loop
		for(String country: countries) {
			System.out.println(country);
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
