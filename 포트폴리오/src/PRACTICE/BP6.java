package PRACTICE;

import java.util.Scanner;

public class BP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if (word.toUpperCase().contains("CAR") == true) {
			System.out.println("car is included in the input string");
		} else {
			System.out.println("car is not included in the input string");
		}
	}
}
