package soft7;

import java.util.ArrayList;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k_10_iAL = new ArrayList();
		
		k_10_iAL.add("abc");
		k_10_iAL.add("abcd");
		k_10_iAL.add("efga");
		k_10_iAL.add("������0");
		k_10_iAL.add("1234");
		k_10_iAL.add("12rk34");
																					//iAL.add("356"); ��̸���Ʈ�� ��Ʈ������ �������ϴµ�
																					//�߰��� ���� ������ �ȵ�
		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); 				// ( ) ���
		System.out.printf(" ���� ArraySize %d \n", k_10_iAL.size());				// ( ) ���
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL ũ�⸸ŭ �ݺ�
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���
		}
		k_10_iAL.set(3, "������"); 												//3�� ��̸���Ʈ ���뺯��
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");				// ( ) ���				
		System.out.printf(" ���뺯�� ArraySize %d \n", k_10_iAL.size());			// ( ) ���
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// ( ) ���
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���	
		}
		
		k_10_iAL.remove(4);															// 4��° �迭 ����
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");				// ( ) ���
		System.out.printf(" ���뺯�� ArraySize %d \n", k_10_iAL.size());			// ( ) ���
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL ũ�⸸ŭ �ݺ�	
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���
		}
		
		k_10_iAL.sort(null);														// �����ϱ�
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");				// ( ) ���
		System.out.printf(" ����Ʈ ArraySize %d \n", k_10_iAL.size());				// ( ) ���
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL ũ�⸸ŭ �ݺ�
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���
		}
		
		k_10_iAL.clear();															// ���� ����
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");				// ( ) ���
		System.out.printf(" ���λ��� ArraySize %d \n", k_10_iAL.size());			// ( ) ���
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL ũ�⸸ŭ �ݺ�
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���
		}
	
	
	
	}

}
