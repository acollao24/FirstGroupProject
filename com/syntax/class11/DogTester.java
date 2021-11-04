package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {

     // class/object
		Dog alonasDog= new Dog();
		alonasDog.name="Lexy" ;
		alonasDog.breed="american hound";
		alonasDog.colors="Black";
		alonasDog.height=2.5;
		alonasDog.age=10;
		alonasDog.gender='M';
		
		System.out.println("My Dogs name is "+alonasDog.name);
		System.out.println("My Dogs breed is "+alonasDog.breed);
		System.out.println("My Dogs color is "+alonasDog.colors);
		System.out.println("My Dogs height is "+alonasDog.height);
		System.out.println("My Dogs age is "+alonasDog.age);
		System.out.println("My Dogs gender is "+alonasDog.gender);
		
		System.out.println("--------");
		
		Dog alesDog= new Dog();
		alesDog.name="Muneca";
		alesDog.breed="Yorkie";
		alesDog.colors="Black";
		alesDog.height=4;
		alesDog.age=7;
		alesDog.gender='F';
		
		System.out.println("My dogs name is "+alesDog.name);
		System.out.println("My dogs breed is "+alesDog.breed);
		System.out.println("My dogs color is "+alesDog.colors);
		System.out.println("My dogs height is "+alesDog.height);
		System.out.println("My dogs age is "+alesDog.age);
		System.out.println("My dogs gender is "+alesDog.gender);
		
		System.out.println("--------");
		
	
		
		
		
	}


}
