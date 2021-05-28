
package P0308;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("1 : father\n2 : mother\n3 : me\n4 : sister");	
	
	 int n = sc.nextInt();
		familyy(n);
		
	
	}		
	
		
	
	public static void familyy(int number) {
		
		
		if (number ==1 ) {
		   System.out.println("RYU"); 
		} else if (number==2) {
			System.out.println("CHO"); 
		} else if (number==3) {
			System.out.println("RYU"); 
		} else if (number==4) {
			System.out.println("RYU"); 
		}
				  
	}
}
