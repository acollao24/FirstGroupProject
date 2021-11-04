package com.syntax.class05;

import java.util.Scanner;

public class hwassignment {
	
	public static void main(String[] args) {
//1.Write a program for user to enter his/hers birth month. Based on the month define the season.
//Example: if user is born in June, July or August → season =“Summer”.
//At the end of the program we should see output as “You were born is season ______“.

	Scanner in=new Scanner(System.in);
	System.out.println("Please enter the month you were born in");
	
	String answer=in.next();
	
	if(answer.equals("December") || answer.equals("January") || answer.equals("February")) {
		System.out.println("You were born in the season winter");
	
	}else if(answer.equals("March") || answer.equals("April") || answer.equals("May")) {
		System.out.println("You were born in the season spring");
	}else if (answer.equals("June") || answer.equals("July") || answer.equals("August")) {
		System.out.println("You were born in the season summer");
	}else if(answer.equals("September") || answer.equals("October") || answer.equals("November")) {
		System.out.println("You were born in the season fall");
	
	}else {
		System.out.println("invalid Entry");
		
		}
		
		
	}
		
		
		
		
		
		
		
		
		
	}


