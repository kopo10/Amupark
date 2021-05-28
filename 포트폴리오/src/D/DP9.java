package D;

import java.util.Scanner;

public class DP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("C(" + a + " , " + b + ") = ");
		for (int i = a; i > 0; i--) {
			if (i == a) {
				System.out.print("(" + i);
			} else if (i == 1) {
				System.out.print(" X 1) = ");
			} else {
				System.out.print(" X " + i);
			}

		}

		System.out.println(Apt(a) + " / " + Apt(b) + " X " + Apt(a - b) + " = " + Apt(a) / (Apt(b) * Apt(a - b)));

	}

	public static int Apt(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Apt(--n);
		}

	}

}
