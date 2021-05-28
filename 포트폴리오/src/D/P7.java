
package D;

import java.util.Scanner;

	public class P7 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int n = 0;
			n = sc.nextInt();						
			System.out.println(sumSum(n) + " = " + n + " X " + (n-1) + " X " + (n-2) + "... X 1");
		}
	public static int sumSum(int number) {								
		if (number ==1) {
			return 1;			
		} else {
			return (number * sumSum(--number)); 
		}							
	}		
}
