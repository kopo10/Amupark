package PRACTICE;

import java.util.Scanner;

public class DP10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int a = sc.nextInt();
		for (int i = 2; i < 10; i++) {			
			System.out.println(a + " X " + i + " = " + a * i);
		}				
	}

	
	



	public static int Art(int n) {
		
		if(n ==1) {
			return 1;
		}	
		else if (n == 2) {
			return 2;	
		} else {
			return  1+ Art(--n);
		}
		
	
	}

}
