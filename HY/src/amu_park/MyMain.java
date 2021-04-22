package amu_park;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOutput Output = new MyOutput();
		Scanner sc = new Scanner(System.in);
		MyRun run = new MyRun();
		Output.choose();
		int Select = sc.nextInt();
		run.out(Select);
		
	}

}
