package soft6;

public class P6main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P6Overloading k_10_over = new P6Overloading(); 								//P6Overloading Ŭ������ �ҷ��´�. 
			
		System.out.printf("2�� ������ ȣ��� [%d]\n", k_10_over.sum(1, 2)); 		// ( ) ���
		System.out.printf("3�� ������ ȣ��� [%d]\n", k_10_over.sum(1, 2, 3));		// ( ) ���
		System.out.printf("4�� ������ ȣ��� [%d]\n", k_10_over.sum(1, 2, 3, 4));	// ( ) ���
		System.out.printf("������ ������ ȣ��� [%f]\n", k_10_over.sum(1.3, 2.4));	// ( ) ���
	}
}
