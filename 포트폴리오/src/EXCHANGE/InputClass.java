package EXCHANGE;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;
	public InputClass() {
		 sc = new Scanner(System.in);
	}

	public int inpuFromConsoleWon() {
		int moneyKOR;
		System.out.println("Input your Won");
		moneyKOR = sc.nextInt();
		return moneyKOR;
	}

	public int inpuFromConsoleType() {
		int input;
		System.out.println("Which money do you want?\n"
					+ "1.USD\n\n"
					+ "2.EUR\n\n" 
					+ "3.JPY\n\n" 
					+ "0.Exit");
		input = sc.nextInt();
		return input;
	}

}
