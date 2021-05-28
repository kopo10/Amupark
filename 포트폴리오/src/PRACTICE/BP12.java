package PRACTICE;

import java.util.Scanner;

public class BP12 {

	public static void main(String[] args) {
		Triangle();
		
	}
	public static void Triangle() {	
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
				System.out.print("\n");
		}
	}
}
