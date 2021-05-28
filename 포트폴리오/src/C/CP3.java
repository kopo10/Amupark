package PRACTICE;

import java.util.Scanner;

public class CP3 {
	final static String[] CHO = {"��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��"}; 
	final static String[] JOONG = {"��","��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��","��"}; 
	final static String[] JONG = {"","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char [] input = {'��','��','��','��'};
		String input = sc.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			char input1 = input.charAt(i);  				
			if (input1 >= 0xAC00) {
				
				input1 = (char) (input1 - 0xAC00);
				char cho = (char) (input1 / 28 / 21);
				char joong = (char) ((input1) / 28 % 21);
				char jong = (char) (input1 % 28);
				System.out.print(CHO[cho] + JOONG[joong] + JONG[jong]);
			} else {
				System.out.print(input1);
			}
		}		
	}
}