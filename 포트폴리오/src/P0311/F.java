package P0311;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	
	try {
		System.out.println(n);
	}
	catch (InputMismatchException e) { 
		String n2 = sc.next();
		System.out.println("sdkakd"); 	
	} catch (Exception e) { 
		String n3 = sc.next();
		System.out.println("dsd"); 	
	} finally {
		System.out.println("³¡");
	}
		
	}
}

/*
int[] numbers = {5, 10, 12};

try {
	System.out.println(numbers[3]);
} catch (Exception e) {
	System.out.println("exception");
	e.printStackTrace();
} finally {
	System.out.println("finally");
}
}
*/