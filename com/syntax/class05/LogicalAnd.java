package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {
//
	public static void main(String[] args) {

		boolean understandJava=false;
		boolean enjoyJava=false;
		
		if(understandJava && enjoyJava) {
		System.out.println("That is awesome");
		}else {
			System.out.println("You will probably have to study more");
			
		}
		
		//*ask a user to enter a number, based on the entered number 
		//we will define if the number is small medium or large
		
		//if number is between 1-10--> small
		//if number is between 11-100-->medium
		//if number is between 101-1000-->large
		//if number is more than 1001--> x large 
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter any number");
		
		int num=in.nextInt();
		if (num>=1 && num<=10) {
			System.out.println(num+" is small" );
		
		}else if(num>=11 && num<=100) {
			System.out.println(num+" is medium ");

		}else if(num>=101 && num<=1000) {
			System.out.println(num+" is large ");

		}else{
			System.out.println(num+" is x large ");

		}

}
}
