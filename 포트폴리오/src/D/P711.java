
package P0308;

import java.util.Scanner;

	public class P711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
			System.out.print(sumSum(number) + " = ");	
		
		for (int i = number; i > 0; i--) {
			if (i > 1) {
				System.out.print(i + " X ");
		    } else {
				System.out.println("1");
		    }
		}
	}	
	public static int sumSum(int number) {						
		int res = 0;		
		if (number ==1) {
			return 1;			
		} else {
			return (number * sumSum(--number)); 
		}							
	}		
}
