package com.syntax.class07;

import java.util.Scanner;

public class DoLoopDemo {

	public static void main(String[] args) {
//lets create a secret number 1-100
//lets ask user to guess my secret number
//keep asking for a number till user guesses the secret number
		
		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		
		do {
			System.out.println("please guess my secret number, it is a number from 1 to 100");
		userNumber=scan.nextInt();
			
		}while(userNumber!=secretNumber);
		System.out.println("you got it !!!!!");
		
	
	
		}


}
