package JAVA2;

public class MyTest {

	public static int k_10netprice(int k_10price, double k_10rate) { //int�� �ް� ���ڷ� int k_10price, double k_10rate
																	 // �޾��ش�.
			return (int)(k_10price / (1 + k_10rate));               // int�̱� ������ return ���� �޾��ش�.
		}													  
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10price = 1234;           // k_10price �� int�� �ް� 1234�� �������ش�. 
		double k_10tax_rate = 0.1;      // double�� ������ 0.1�� �������ش�.
		
		int k_10netprice = k_10netprice(k_10price, k_10tax_rate); // k_10netprice�� �ҷ��ͼ� ���ݰ� ������ �Է��Ѵ�.
		int k_10tax = k_10price - k_10netprice; // �Һ��� ���ݿ��� ���������� ���ش�.
		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
		System.out.printf("��         �Һ��ڰ���, ��������, ���� ���           ��\n"); // ����ϰ� ���� ������ �Է����ش�.
		System.out.printf(" �Һ��� ����: %d, ��������: %d ����: %d\n", k_10price, k_10netprice, k_10tax);
		                               //�Һ��� ���� , ��������, ������ %d�� �̿��ؼ� ������ ������ش�.
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���										
	}	
}
