package PRACTICE;

import java.util.Scanner;

public class BP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i <= a; i++) {			
			if (i == 1) {
				System.out.println("1pp");
			} else if ( i <= a){
				System.out.println(1 + b);			    
				i = 1 + b;				 
			}			   
		}			
	}

}
