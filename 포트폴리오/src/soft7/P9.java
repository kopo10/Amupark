package soft7;

import java.util.ArrayList;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iTestMAX = 1000000;
		ArrayList k_10_iAL =  new ArrayList();
		
		for (int k_10_i = 0; k_10_i < k_10_iTestMAX; k_10_i++) {					 // k_10_iTestMAX��ŭ �ݺ�
			k_10_iAL.add((int)(Math.random() * 1000000));							 // k_10_iAL�� k_10_iTestMAXũ�⸸ŭ �迭����
		}
		
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					 // k_10_iAL ũ�⸸ŭ �ݺ�
			System.out.printf(" ArrayList %d = %d\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���
		}
		
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");				 // ( ) �ݺ�
		k_10_iAL.sort(null);														 // ( ) ����
			
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					 // k_10_iAL ũ�⸸ŭ �ݺ� 
			System.out.printf(" ArrayList %d = %d\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) ���
		}
		
		
	}

}
