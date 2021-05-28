package PRACTICE;

import java.util.Scanner;

public class BP16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int i = 1;
		int lcm = 0;
		
		while (i <= num1 && i <= num2) {
			if (num1 % i == 0 && num2 % i == 0) {
				lcm = i;				
			} i++;
		}
		System.out.println(lcm * (num1 / lcm) * (num2 / lcm));
	}
}
