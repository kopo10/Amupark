package soft7;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k_10_iArray = {40, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212,          // �迭�� ���ϴ� ���ڸ� �־��ش�
				33, 11, 21, 11, 2121,121, 11, 5, 6, 33}; 		
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {			// k_10_iArray �迭 ũ�� ��ŭ �ݺ�
			System.out.printf("iArray[%d]=%d\n", k_10_i, k_10_iArray[k_10_i]);  // ( ) ���
		}
		//MAXã��
	
		int k_10_iMin = Integer.MAX_VALUE; 									//ū���� �������ش�
		int k_10_iMinPt = 0;
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {
			if (k_10_iMin > k_10_iArray[k_10_i]) {								// ���� k_10_iMin ��� �ִ� ������ �۴ٸ�
				k_10_iMin = k_10_iArray[k_10_i];								// �װ��� k_10_iMin�� �־��ش�
				k_10_iMinPt = k_10_i;											// ���� k_10_iMin ���� ��ȣ ����
			}
		}
		System.out.printf("MIN : iArray[%d]=%d\n", k_10_iMinPt, k_10_iMin);		// ( ) ���
	
	}	

}
