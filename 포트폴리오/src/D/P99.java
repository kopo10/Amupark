
package D;

import java.util.Scanner;

	public class P99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0,number2=sc.nextInt();
			System.out.print(sumSum(number, number2) + " = ");	
		
		for (int i = number; i > 0; i--) {
			if (i > 1) {
				System.out.print(i + " X ");
		    } else {
				System.out.println("1");
		    }
		}
	}	
	public static int sumSum(int number, int number2) {						
		int res = 0;		
		if (number ==1) {
			return 1;			
		} else {
			return (number * (--number)); 
		}							
	}		
}
