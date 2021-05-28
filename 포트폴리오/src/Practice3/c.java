package Practice3;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			char b = (char) (a.charAt(i) + 48);
			System.out.print(b + " ");

		}

	}

}
