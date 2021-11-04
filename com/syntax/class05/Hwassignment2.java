package com.syntax.class05;

import java.util.Scanner;

public class Hwassignment2 {

	public static void main(String[] args) {
		
Scanner in=new Scanner(System.in);
System.out.println("What are your three scores?");

double quizScores=in.nextDouble();
//System.out.println("What is your quiz score");

double midtermScores=in.nextDouble();
//System.out.println("What is your midterm score");

double finalScores=in.nextDouble();
//System.out.println("What is your final score");

double averageScore= ((quizScores+midtermScores+finalScores) / 3);

if (averageScore >=90) {
System.out.println("Your grade is an A");
}else if (averageScore >=70) {
	System.out.println("Your grade is a B");
}else if (averageScore >=50) {
	System.out.println("Your grade is a C");
}else {
	System.out.println("Your grade is an F");
	
}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
