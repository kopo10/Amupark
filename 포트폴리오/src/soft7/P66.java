package soft7;

public class P66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k_10_iArray = { 40, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {							 // �迭�� ���ϴ� ���ڸ� �־��ش�										
			System.out.printf("iArray[%d]=%d\n", k_10_i, k_10_iArray[k_10_i]);					// k_10_iArray �迭 ũ�� ��ŭ �ݺ�
		}
		// MAXã��

		int k_10_iMax = 0; // ó�����۹迭���ͽ���
		int k_10_iMaxPt = 0;
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {							// ���� k_10_iMax ��� �ִ� ������ ũ�ٸ�
			if (k_10_iMax < k_10_iArray[k_10_i]) {												// �װ��� k_10_iMax�� �־��ش�
				k_10_iMax = k_10_iArray[k_10_i];												// ���� k_10_iMax ���� ��ȣ ����
				k_10_iMaxPt = k_10_i;	
			}

		}
		System.out.printf("MAX : iArray[%d]=%d\n", k_10_iMaxPt, k_10_iMax);							// ( ) ���

	}

}
