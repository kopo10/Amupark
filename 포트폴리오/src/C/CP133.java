package PRACTICE;

import java.util.Scanner;

public class CP133 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char [] alphabet = new char[26];
		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char)(97 + i);
		}
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		String lowercase1 = str1.toLowerCase();
		String lowercase2 = str2.toLowerCase();
		int[] str1Arr = new int[26];
		int[] str2Arr = new int[26];
		
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (alphabet[j] == lowercase1.charAt(i)) {
					str1Arr[j]++;
				}
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (alphabet[j] == lowercase2.charAt(i)) {
					str2Arr[j]++;
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			if (str2Arr[i] != 0 && min > str1Arr[i] / str2Arr[i]) {
				min = str1Arr[i] / str2Arr[i];
			}
		}
		System.out.println(min);
	}
}
