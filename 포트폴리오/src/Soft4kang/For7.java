package Soft4kang;

public class For7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //sum�� int�� 0���� ����
		for (int i = 0; i < 10; i++) { //for�� �̿��ؼ� i�� 0���� 9���� �ݺ� //�ε�ȣ ǥ�ÿ� ����
			sum = sum + i; //sum�� for�� �ݺ� �Ҷ����� sum + i�� ��� ������
		}
		System.out.printf("sum %d\n" , sum); // sum�̶�� ���ڿ��� ����ϰ� sum�� ������ ��� �� \n
		
		for (int i = 0; i < 10; i++) { //for�� �̿��ؼ� i�� 0���� 9���� �ݺ� //�ε�ȣ ǥ�ÿ� ����
			System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n" , i);  // }�ݱ�	
			System.out.printf("   ������ %d ��\n" , i);  // �������� ��� �� i�� ������ ��� �� ��� \n	
			System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n" , i); // ( )���� ���ڿ��� ����Ѵ�.
			for (int j = 0; j < 10; j++) { //for�� �̿��ؼ� j�� 0���� 9���� �ݺ�
			
				System.out.printf(" %d * %d = %d \n" , i, j, i * j); //i, j, i * j�� ������ ������� ��� �� \n
			} // }�ݱ�	
		} // }�ݱ�	
	} // }�ݱ�	
} // }�ݱ�	
