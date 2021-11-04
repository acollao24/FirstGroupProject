package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		// Nested loop ---> loops inside another loop

		for (int i = 1; i <= 3; i++) { // outer loop
			for (int j = 1; j <= 4; j++) { // inner loop
				System.out.println(i + " " + j);
			}
		}

		System.out.println("---car odometer---");
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + "" + c + "" + d);

					}
				}
			}
		}
		
		
		
		
		
		
		
	}
}
