package C;

import java.util.Scanner;

public class CPH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f0 = 0;
		int f1 = 1;
		int sum;
		while (n > 2) {
			System.out.print(f0 + " ");
			System.out.print(f1 + " ");
			for (int i = 0; i <= n - 3; i++) {
				sum = f0 + f1;
				System.out.print(sum + " ");
				f0 = f1;
				f1 = sum;				
			}
			n--;
			break;
		} 
		System.out.println("Error");														
	}
}
