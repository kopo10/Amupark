package Practice3;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = i; j < input - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}

			}
			System.out.println();
		}

	}

}
