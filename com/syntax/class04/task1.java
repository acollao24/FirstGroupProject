package com.syntax.class04;

public class task1 {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double GPA=3.5;
		
		if(diploma) {
			System.out.println("Congratulations!!!");
			if(GPA>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You should get a degree");
		}
		
		
	}

}
