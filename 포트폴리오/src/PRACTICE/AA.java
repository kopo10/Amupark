package PRACTICE;

import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 2; i < 10; i++) {
			System.out.println(a + " X " + i + " = " + (i *a));
		}
	}
}
