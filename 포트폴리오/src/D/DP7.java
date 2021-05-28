package D;

import java.util.Scanner;

public class DP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		
		int b = sc.nextInt();
		System.out.print(A(b) + " = ");
		for (int i = b; i > 0; i--) {		
			if (i == 1) {
				System.out.print("1");				
			} else {
				System.out.print(b + " X ");
			}
			b--;			
		}			
	}
	
	
	public static int A(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * A(--a);
		}		
	}
}
