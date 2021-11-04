package com.syntax.class11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Human alexis= new Human();
	alexis.name="Alexis";
	alexis.age=22;
	alexis.height=5.2;
	alexis.weight=143;
	alexis.gender='F';
	alexis.bloodType="O+";
	
	alexis.eat();
	alexis.sleep();
	alexis.walk();
	
		System.out.println("-----------");
		
	Human daniel=new Human();
	daniel.name="Daniel";
	daniel.age=22;
	daniel.height=5.8;
	daniel.weight=162;
	daniel.gender='M';
	daniel.bloodType="A+";
	
	daniel.eat();
	daniel.sleep();
	daniel.walk();
	daniel.sendMemes();
	
	
	
	}

}
