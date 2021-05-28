package PRACTICE;

public class EE {
	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Sum(i));
		}
	}
	
	
	
	
	
	public static int Sum(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number + Sum(--number);
		}
	}	
}
