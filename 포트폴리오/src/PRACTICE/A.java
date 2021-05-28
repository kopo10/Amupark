package PRACTICE;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int inp = sc.nextInt();
		for (int lne = 0; lne < inp; lne++) {
			for (int b = 0; b < lne; b++) {
				System.out.print(" ");
			}
			for (int str = 0; str < 2 * (inp-lne) - 1; str++) {			
				if (lne % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
					
			}
				System.out.print("\n");
		}
	}
}
