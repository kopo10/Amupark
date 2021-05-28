package PRACTICE;

import java.util.Scanner;

public class BP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What number do you want?");
		int a = sc.nextInt();
		for (int i = 2; i < 10 ; i++) {
			System.out.println(a + " X  " +  i + " = " + a * i );
		}
	}
}
