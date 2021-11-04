package com.syntax.class06;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		String grade = scan.next();
		String explaination = null;
		
		switch (grade.toLowerCase()) {
		
		case "A":
			explaination= "excellent";
		case "B":
			explaination= "good";
		case "C":
			explaination= "average";
		case "D":
			explaination= "bad";
		default:
			explaination = "not acceptable";
			
		}
		if (!grade.equals("not acceptable")) {
		System.out.println("If your grade is " + grade + " that means " + explaination);
		
		} else {
			System.out.println("please try another grade");
			
		}
		

	
}
}