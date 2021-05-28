package PRACTICE;

import java.util.Scanner;

public class BP188 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 2;
		int j = 0;
		while (i <= num) {				
			int cnt = 0;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) { 		
				System.out.println(i);										
			}
			i++;			
		}	
	}	
}