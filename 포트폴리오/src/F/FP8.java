package F;

import java.util.Scanner;

public class FP8 {
	final static int lower_case_a = 'a';
	final static int lower_case_z = 'z';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		StringBuffer reverse = new StringBuffer();

		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if ((int) c >= lower_case_a && (int) c <= lower_case_z)
				reverse.append((char) (lower_case_z - c + lower_case_a));
			else
				reverse.append((char) c);
		}
		System.out.println(reverse.toString());
	}
}