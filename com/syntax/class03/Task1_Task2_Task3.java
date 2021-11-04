package com.syntax.class03;

public class Task1_Task2_Task3 {
	
	public static void main(String[] args) {
	
	//write a java program to add, subtract, multiply and divide 2 decimal values. Your program should say. "The _________ of 2 numbers _____ and _________ is equal to _____"
	
	double number1=10.50;
	double number2=10.50;
	double sum=number1+number2;
	double sub=number1-number2;
	double mul=number1*number2;
	double div=number1/number2;
	System.out.println("The Addition of 2 numbers "+number1+" and "+number2+" is equal to "+sum);
	System.out.println("The Subtraction of 2 numbers "+number1+" and "+number2+" is equal to "+sub);
	System.out.println("The Multiplication of 2 numbers "+number1+" and "+number2+" is equal to "+mul);
	System.out.println("The Division of 2 numbers "+number1+" and "+number2+" is equal to "+div);
	 // Write a program to find the square of the number 3.9. Your program should say " The square of the ______ is ________"
	
	double number=3.9;
	System.out.println("The square of the 3.9 is 15.20999999999999");
	
	//Write a program to print the area and perimeter of a rectangle with width = 5 and height - 8. Your program should say, "The perimeter of a rectangle with width ______ and height _____ is equal to ______ and the area is _____"
	
	double width=5;
	double height=8;
	double perimeter=2*(width+height);
	double area =width*height;
	
	System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is equal to "+area);
		
	//Task4
	//Declare variable and increase by 100 using the shorthand operator
	int number9=100;
	number9+=100;
	System.out.println(number9);
	
	//Declare variable and decrease by 67 using shorthand operator 
	int num8=100;
	num8-=67;
	System.out.println(num8);
	
	//Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator. Each person should get an equal piece of cake.
	int cakePiece=11;
	cakePiece/=4;
	System.out.println(cakePiece);
	//System.out.println(cakePiece%4);		
	
	//Declare variable cakePiece=25 and divide cakePiece between 7 people. Using shorthand operator find out how many pieces of cake are left after it was distributed equally among 7 people.
	int cakePiece1=25;
	cakePiece1%=7;
	System.out.println(cakePiece1);
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
