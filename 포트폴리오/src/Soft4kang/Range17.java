package Soft4kang;

public class Range17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iVal;
		for (int i = 0; i < 300; i++) {
			iVal = 5 * i;
			if (iVal >= 0 && iVal < 10) System.out.printf("�� %d\n" , iVal);
			else if (iVal >= 10 && iVal < 100) System.out.printf("�� %d\n" , iVal);
			else if (iVal >= 100 && iVal < 1000) System.out.printf("�� %d\n" , iVal);
			else System.out.printf("õ %d\n" , iVal);
		}
	}

}
