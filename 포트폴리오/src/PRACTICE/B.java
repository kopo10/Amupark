package PRACTICE;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int ipt = sc.nextInt();
		
		int a = 0;
		int b = 1;		
			for (int i = 0; i < ipt; i++) {				
				if (i == ipt - 1) {
					System.out.println(a);
				} else {
					System.out.print(a + " + ");
				}
			int sum = a+b;	
			a = b;
			b = sum;
		
			}
		}
	}


