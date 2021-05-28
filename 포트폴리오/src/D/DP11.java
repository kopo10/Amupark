package PRACTICE;

import java.util.Scanner;

public class DP11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(APT(i)+" ");
		}		
	}

	
	
	
	
	
	
	
	public static int APT(int a) {
		if (a == 0) {
			return 0;
		}
		else if (a == 1) {
			return 1;
		} else {
			return APT(a-2) + APT(--a);
		}
		
	}
	
	
	
}
