package PRACTICE;

import java.util.Scanner;

public class BP15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i < input; i++) {
			if(input % i == 0) {
				System.out.println(i);
			}
		}
	}
}
