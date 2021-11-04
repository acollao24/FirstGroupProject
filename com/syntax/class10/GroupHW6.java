package com.syntax.class10;

public class GroupHW6 {

	public static void main(String[] args) {

		// #6 Write a program to swap 2 numbers without a temporary variable?

		System.out.println("Before Swapping");

		int a = 1;
		int b = 2;

		System.out.println(a);
		System.out.println(b);

		System.out.println("After Swapping");

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}
}
