package Soft4kang;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0; // score�� 0���� ����
		int num = 1; // num�� 0���� ����

		int score1 = 61;// score1�� 61���� ����
		if (score1 > 60) { // score1�� 60 ���� ũ�ٸ�
			System.out.println("�հ��Դϴ�1."); // ( )���� ���ڿ��� ����Ѵ�.
		} // if�� �ݱ�

		if (score1 > 60) // score1�� 60 ���� ũ�ٸ� (���� ���ǰ� �������� {})
			System.out.println("�հ��Դϴ�2."); // ( )���� ���ڿ��� ����Ѵ�.

		score = 61; // score�� 61�� ������
		if (score > 60) { // score�� 60 ���� ũ�ٸ�
			System.out.println("�հ��Դϴ�3.");// ( )���� ���ڿ��� ����Ѵ�.
		} else { // if���� ������ �ƴ϶�� �������� 
			System.out.println("���հ��Դϴ�."); // ( )���� ���ڿ��� ����Ѵ�.
		} // }�ݱ�

		if (num > 0) { //num�� 0���� ũ�ٸ�
			System.out.println("����Դϴ�");// ( )���� ���ڿ��� ����Ѵ�.
		} else if (num < 0) { //num�� 0���� �۴ٸ� 
			System.out.println("�����Դϴ�");// ( )���� ���ڿ��� ����Ѵ�.
		} else { //if���ǵ� �ƴϰ� else if ���ǵ� �ƴ϶��
			System.out.println("���Դϴ�");// ( )���� ���ڿ��� ����Ѵ�.
		} // }�ݱ�

		if (score >= 90) { // score�� 90�̰ų� 90���� ũ�ٸ�
			System.out.println("A���"); // ( )���� ���ڿ��� ����Ѵ�.
		} else if (score >= 80 && score < 90) { // score�� 80 ���� ũ�� 90���� �۴ٸ�
			System.out.println("B���"); // ( )���� ���ڿ��� ����Ѵ�.
		} else if (score >= 70 && score < 80) { // score�� 70 ���� ũ�� 80���� �۴ٸ�
			System.out.println("C���"); // ( )���� ���ڿ��� ����Ѵ�.
		} else { //if���ǵ� �ƴϰ� else if ���ǵ� �ƴ϶��
			System.out.println("F���"); // ( )���� ���ڿ��� ����Ѵ�.

		} // }�ݱ�
	} // }�ݱ�
} // }�ݱ�
