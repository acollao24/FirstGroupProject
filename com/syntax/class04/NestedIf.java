package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		
		int dose=2;
		
		if(vaccine) {
			
			System.out.println("How many doses have taken?");
			
			if(dose==1) {
				System.out.println("When are you taking your 2nd dose?");
			}else {
				System.out.println("You are fully vaccinate");
				
			}
		}
		System.out.println("**********************************************");
		
		String day ="Friday";
		int date=13;
		int time=12;
		
		if(day.equals("Friday")) {
			
			System.out.println("Iam going to the movies today");
		
			if(date==13) {
				System.out.println("I am wathing a scary movie");
			}else {
				System.out.println("I am watchng a comedy today");
			}
		
		}else {
			System.out.println("I am going to study");	
			
			if(time>23) {
				System.out.println("I have to go to sleep cause I have class");
		
		}
		}
	}
	}



