package PRACTICE;

import java.util.Scanner;

public class CP14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("a")) {
				String target = words[i + 1]; //a or an 뒤의 문장
				char D = target.charAt(0);
				if (D == 'a' || D == 'e' || D == 'o' || D == 'i' || D == 'u') {
					words[i] = "an";
				} 
			}	
			if (words[i].equals("an")) {	
				String target = words[i + 1]; //a or an 뒤의 문장
				char D1 = target.charAt(0);
				if (D1 != 'a' && D1 != 'e' && D1 != 'o' && D1 != 'i' && D1 != 'u') {
					words[i] = "a";
				} else {
					
				}																
			}	
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}	
}
