package com.syntax.class06;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a country");
		String count = scan.next();
		String language = null;

		switch (count.toLowerCase()) {

		case "ukraine":
			language = "russian";
		case "usa":
			language = "english";
		case "italy":
			language = "italian";
		case "bolivia":
			language = "spanish";
			break;
		default:
			language = "unknown";

		}
		if (!language.equals("unknown")) {
			System.out.println("If country is " + count + " your language is " + language);

		} else {
			System.out.println("please try another country");

		}

	}
}
