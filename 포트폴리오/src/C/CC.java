package PRACTICE;

import java.util.Scanner;

public class CC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		C gg = new C();
		gg.menu();
		int num = sc.nextInt();
		System.out.println(gg.getG(num));
	}

}
