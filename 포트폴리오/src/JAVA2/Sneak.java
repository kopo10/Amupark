package JAVA2;

public class Sneak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k_10item = {"������", "���Ͻ�", "�Լ���", "������", "��극"}; //Stirng �迭�� ���ڵ��� �����Ѵ�.
		int[] k_10price = {1000, 2000, 3000, 2500, 1450}; // int�� ���ڵ��� ������ �޾� �´�.
		int[] k_10amount = {10, 2, 1, 3, 5}; // int�� ���ڵ��� ������ �޾� �´�.
		double k_10tax_rate = 0.1; // double�� ���ڵ��� ������ �����´�.
		int k_10total_sum = 0; // sum�� ���� ���� �̿��� �� 0���� ���� �������ش�. ���� ������ ������ �ʴ� ���� ���̰� �� �� �ִ�.
		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("�ڡ�           �ʰ� ���� ���ڵ�        �ڡ�\n");
		System.out.printf("�� ��     �� ��      �� ��         �� ��   \n");
		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) {     //length�� ���ڵ� ������ŭ�̶�� ���̴� 5������ �����ϱ� 5��.
				int k_10sum = k_10price[k_10i] * k_10amount[k_10i]; // k_10price[i] * k_10amount[i] i��° �ִ� ������ ���ڼ����� ������ ���� ���̴�.
				                                            // �ؿ� ��¿� �հ迡 ����.
				k_10total_sum = k_10total_sum + k_10sum;	//  k_10price[i] * k_10amount[i] i��°������ ���ڿ� ������ ���� ������ ���� �����ذ��̴�.
				System.out.printf("%.6s %7d %9d %12d\n" , k_10item[k_10i], k_10price[k_10i], k_10amount[k_10i], k_10sum);													
		}  // s�� .5�� 5��ŭ�� ���ڸ� ����ϴ� ��ɾ�� 7d�� 7�� 7��ŭ ��ĭ�� ����� �ִ� ��ɾ��̴�.
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("���� �ݾ� : %26d\n" , k_10total_sum); // 20�ٸ�ŭ ���� k_10total_sum���� �Է��ϴ� ���̴�.
		
		int k_10total_net_price = (int)(k_10total_sum / (1 + k_10tax_rate)); // ���� �� ���ڵ��� ������ 1+�������� �����ش�.
		System.out.printf("���� �ݾ� : %26d\n" , k_10total_net_price); //25�ٿ��� ����� ���� ���� �ݾ��̴�.
		int k_10tax =k_10total_sum - k_10total_net_price;     //�Һ��� ���ݿ��� �����ݾ��� ���ָ� ������ �ȴ�.
		System.out.printf("��    �� : %26d\n" , k_10tax);	  //���� ���
		
		
		
		
		
		}

}
