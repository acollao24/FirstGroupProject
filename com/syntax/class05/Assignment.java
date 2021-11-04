package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
//Write a program that will ask user to input inputs the current time (user 24 hour format)
		//Based on the given time define:
		//If hour is between 1-11---->morning
		//if hour is between 12-15--->afternoon
		//if hour is between 16-20--->evening
		//if hour is between 21-24--->night
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter current time");
		
		int time=in.nextInt();
		
		if (time>=1 && time<=11) {
			
			
		}else if(time>=12 && time<=15) {
		
		}else if(time>=16 && time<=20) {
			
		}else if(time>=21 && time<=24) {	
		
		}
		String timeofday = null;
		
		if (time>=1 && time <=11) {
			timeofday="morning";
		}else if (time>=12 && time<=15) {
			timeofday="afternoon";
		}else if (time>=16 && time<=20) {
			timeofday="evening";
		}
		System.out.println("right now is "+timeofday);
		}
		
		
	}


