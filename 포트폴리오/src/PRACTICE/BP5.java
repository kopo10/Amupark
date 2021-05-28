package PRACTICE;

import java.util.Scanner;

public class BP5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if (word.contains("car") == true) {
			System.out.println("car is included in this sentence");
		} else {
			System.out.println("car is not included in this sentence");
		}						
	}	
}
