package P0308;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5, 12);
		mainus(12, 5);
		divi(12, 6);
	    multi(5, 5);
	}	
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(a + b);		
	}
	public static void mainus(int a, int b) {
		System.out.println(a - b);
	}
	
	public static void divi(int a, int b){			
		System.out.println(a / b);		
	}
	public static void multi(int a, int b){			
		System.out.println(a * b);	
	}
	
	
	
	
	}


