package PRACTICE;

import java.util.Scanner;

public class BP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("What operation do you want?\n\n1. +\n\n2. -\n\n3. *\n\n4. /\n\n--->");
		int opr = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (opr == 1) {
			System.out.println(n1 + n2);
		} else if (opr == 2) {
			System.out.println(n1 - n2);
		} else if (opr == 3) {
			System.out.println(n1 * n2);
		} else if (opr == 4) {
			System.out.println(n1 / n2);
		} else {
			System.out.println("Error");
		}		
	}
}
