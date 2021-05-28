package PRACTICE;

import java.util.Scanner;

public class BP17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num = 0;		
		if (num1 > num2) {			
			for (int i = 2; i <= num2; i++) {
				if ((num1 % i == 0) && (num2 % i == 0) ) {
				num = i;				
				}		
			}
			System.out.println(num);		
		} else {
			for (int i = 2; i <= num1; i++) {
				if ((num1 % i == 0) && (num2 % i == 0) ) {
				num = i;				
				}		
			}
			System.out.println(num);
		}
	}				
}
