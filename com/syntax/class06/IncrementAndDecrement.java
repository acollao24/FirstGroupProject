package com.syntax.class06;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int num=100;

		num=num+1;
		num+=1;
		System.out.println(num);
		
		num++;//increment values of variable by 1 
		System.out.println(num);
		
		num--;//decrement value of variable by 1
		
		//10++; CANNOT BE USED with values, only with VARIABLES	
		
		//NOTES:
		//while loop
		int time = 14;
		if(time<17){
		System.out.println("It is a day");
		}
		while (time<17) {
		System.out.println("It is a day");
		time--;
		
		}
		System.out.println("I want to print numbers from 1 to 20 "); 
		int i=1;
		
		while (i>20) {
			System.out.print(i+" ");
			i++;
			
			
		}
		System.out.println("End of code");
		
		
	
	}

		}
