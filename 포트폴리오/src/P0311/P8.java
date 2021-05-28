package P0311;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);					
		int me = 0;
		String ret = "";
		me = sc.nextInt();
	for (me = 0; me > 3; me++) {
	
		if( me == 0) {
			ret = "Rock";
		} else if (me == 1) {
			ret = "paper";
		} else {
			ret = "scissor";
		}
		
	}
		System.out.println(me());
		System.out.println(rpsResult());
	}

	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int)(Math.random() *3 );
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "paper";
		} else {
			ret = "scissor";			
		}
		return ret;
	}
	public static String me() {
		String ret = "";
		int A = 0;
		if (A == 0) {
			ret = "Rock";
		} else if (A == 1) {
			ret = "paper";
		} else {
			ret = "scissor";
		}
		return ret;
	}
	
}
