package PRACTICE;

import java.util.Scanner;

public class CP3 {
	final static String[] CHO = {"ぁ","あ","い","ぇ","え","ぉ","け","げ","こ", "さ","ざ","し","じ","す","ず","せ","ぜ","そ","ぞ"}; 
	final static String[] JOONG = {"た","だ","ち","ぢ","っ","つ","づ","て","で","と", "ど","な","に","ぬ","ね","の","は","ば","ぱ","ひ","び"}; 
	final static String[] JONG = {"","ぁ","あ","ぃ","い","ぅ","う","ぇ","ぉ","お","か","が","き","ぎ","く","ぐ","け","げ","ご","さ","ざ","し","じ","ず","せ","ぜ","そ","ぞ"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char [] input = {'亜','蟹','陥','虞'};
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