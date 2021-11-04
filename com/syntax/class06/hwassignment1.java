package com.syntax.class06;

import java.util.Scanner;

public class hwassignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two numbers and operator(+,-,*,/)");
		double i= in.nextDouble();
		double q= in.nextDouble();
		
		String oper= in.next();
		double sonuc =0.0;
		
		if (oper.equalsIgnoreCase("+")) {
		sonuc = i+q;
		} else if (oper.equalsIgnoreCase("-")) {
		sonuc = i-q;
		}else if (oper.equalsIgnoreCase("*")) {
		sonuc = i*q;
		}else if (oper.equalsIgnoreCase("/")) {
		sonuc = i/q;
		}else {
			System.out.println("Wrong operator");
			
			
			
			
		}
	
	
	
	
	
	
	
	
	}

}
