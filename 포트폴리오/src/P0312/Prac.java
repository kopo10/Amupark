package P0312;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user = "";
		int count = 0;
		user = sc.nextLine();
		
		for(int i = 0; i < user.length(); i++) {
			char w = user.charAt(i);
			if (w == '1') {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
	}

}
