package PRACTICE;

import java.util.Scanner;

public class BP13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BP12 bp12 = new BP12();
		//bp12.Triangle();
		EquilateralTriangle();
	
	}
	public static void EquilateralTriangle() {
		Scanner sc = new Scanner(System.in);
		int input;
		input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int w = input; w > i; w--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
