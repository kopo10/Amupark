package PRACTICE;

import java.util.Scanner;

public class TEST111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int b = i; b > 1; b--) {
				System.out.print(" ");
			}
			for (int str = 1; str <= 2 * (input - i) + 1; str++) {
				if (i == 1) {
					System.out.print("*");
				} else if (str == 1 || str == (2 * (input - i)) + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}		
}

