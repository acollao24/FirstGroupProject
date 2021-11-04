package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a country");
		String count=scan.next();
		String food = null;
		
		switch (count.toLowerCase()) {
		
		case "ukraine":
			food="Borsh";
		case "usa":
			food="burger";
		case "italy":
			food= "pizza";
		case "bolivia":
			food= "pique";
		break;
		default:
			food= "unknown";
			
		}
		if (!food.equals("unknown")) {
			System.out.println("If country is " + count + (" your favorite food is ") + food);
			
		}else {	
			System.out.println("Please try another country");
		}
		}

	}	


