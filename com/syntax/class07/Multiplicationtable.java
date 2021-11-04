package com.syntax.class07;

public class Multiplicationtable {

	public static void main(String[] args) {
		
		int num = 9;

		for (int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}

		System.out.println("--------------------------------------------------");
		System.out.println("Printing Odd Numbers from 1-20");
		for(int i=1; i<=20; i+=2) {
			System.out.println(i+" ");
		}
		

	}

}
