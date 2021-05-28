package Review1;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int j = 1;
		System.out.println("Input number");
		while (j < 10) {
			System.out.println(a + " X " + j + " = " + a * j);	
			j++;
		}
	}

}
