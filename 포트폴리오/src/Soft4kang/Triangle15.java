package Soft4kang;

public class Triangle15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // �߾��� �ʴ� ���!!!!
		int iA, iB; // iA, iB�� int�� ����

		iA = 0; // iA�� 0���� ����
		while (true) { // break�� ���ٸ� ����
			iB = 0; // iB�� 0���� ����

			while (true) { // break�� ���ٸ� ����
				System.out.printf("*"); // ( )���� ���ڿ��� ����Ѵ�

				if (iA == iB)
					break; // iA == iB��� 13line �� while�� �����Ѵ�.
				iB++; // iB ����
			} // } �ݱ�
			System.out.printf("\n"); // ( )���� ���ڿ��� ����Ѵ�
			iA++; // iB ����
			if (iA == 30) { // iA == 30���
				break; // 10line while����
			} // } �ݱ�
		} // } �ݱ�

	} // } �ݱ�

} // } �ݱ�
