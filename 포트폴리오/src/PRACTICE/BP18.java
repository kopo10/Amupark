package PRACTICE;

import java.util.Scanner;

public class BP18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			int cnt = 0;
			for(int j = 2; j <= i; j++) {
				if (i % j == 0) {
					cnt++;				
				} 
			}	
			if(cnt == 1) {		
			System.out.println(i);			
			}		
		}
	}
}
