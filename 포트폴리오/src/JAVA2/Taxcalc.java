package JAVA2;

public class Taxcalc {
	
	public static int taxcal(int k_10val, int k_10rate) { //int �޼ҵ忡 int ������ �ΰ� �޾��ش�, void�� �ƴϴϱ�			
		int k_10ret; // int k_10ret ����                                  // return �� �Է�
		if ( ((double)k_10val * (double)k_10rate / 100.0) == k_10val * k_10rate / 100)
			// double �� ������� ���� �Ҽ����� ���� �� �����Ƿ� ���� double �� int ���� ���ٸ� �״�� ���
			k_10ret = k_10val * k_10rate / 100;
		else 
			k_10ret = k_10val * k_10rate / 100 + 1; //���� ���� �ٸ��ٸ� �и� 1�� �߰����༭ ���ݺδ��� �Һ��ڿ��� �������ش�.
		
		return k_10ret; //int�� ������ return ���� �޴´�.	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10val = 273; //��ǰ ������ �޾��ش�
		int k_10rate = 3; // �������� �޾��ش�.
		int k_10tax = taxcal(k_10val, k_10rate); // taxcal ���� ���� if���� �����´�.
		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
		System.out.printf("�ڡڡ�             �ܼ� ���� ���             �ڡ�\n");  //�Է��� ���� �ѱ۷� ���
		System.out.printf("���� ���ݰ��: %f\n", k_10val * k_10rate / 100.0); //�Ҽ������� �ִ� ���� ������ printf�� ����ؼ� �޴´�.
		System.out.printf("    ��������: %d     ���� : %d  �������԰���: %d\n",      //d�� �̿��ؼ� ������ �������� ���� �������� ������ �޾��ش�.
							+  k_10val, k_10tax, k_10val + k_10tax);		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
		
		
		
		
		
		
	}

}
