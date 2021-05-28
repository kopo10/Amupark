package soft7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PP122 {


	static ArrayList<PP10OneRec> k_10_ArrayPP10OneRec =  new ArrayList <PP10OneRec>();
	
	static int k_10_sumkor = 0;				// �����հ踦 ���� 0���� ����
	static int k_10_sumeng = 0;				// �����հ踦 ���� 0���� ����
	static int k_10_summat = 0;				// �����հ踦 ���� 0���� ����
	static int k_10_sumsum = 0;				// �հ踦 ���� 0���� ����
	static int k_10_sumave = 0;				// ����հ踦 ���� 0���� ����
	static final int k_10_iPerson = 30;		// �л����� 30���� ����
	
	//�����͸����
	
	public static void dataSet() {
		ArrayList<String> k_10_iAL = new ArrayList<String>();
		for (int k_10_i = 0; k_10_i <= k_10_iPerson; k_10_i++) { 			// �������ŭ �ݺ�
			int k_10_student_id = k_10_i;
			String k_10_name = String.format("ȫ��%02d", k_10_i); 			// ��� ���� ī��Ʈ �ȴ�.
			int k_10_kor = (int) (Math.random() * 100); 					// �������� ���ڰ� ����
			int k_10_eng = (int) (Math.random() * 100); 					// �������� ���ڰ� ����
			int k_10_mat = (int) (Math.random() * 100); 					// �������� ���ڰ� ����
			k_10_ArrayPP10OneRec.add(new PP10OneRec (k_10_student_id, k_10_name, k_10_kor, k_10_eng, k_10_mat)); // k_10_ArrayPP10OneRec�� �־���
		}		
	}
	//��� �μ�
	public static void HeaderPrint() {	
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�"); 											// ( ) ���
	System.out.printf(" %2s %4s %3s %3s %3s %3s    %2s", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���\n"); // ( ) ���
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");												 // ( ) ���
	}
	
	//�����μ�
	public static void ItemPrint(int i) {
		PP10OneRec k_10_rec;
		k_10_rec = k_10_ArrayPP10OneRec.get(i);
		System.out.printf("%4d %6s %3d %5d %5d   %3d   %6.2f\n"
							, k_10_rec.student_id(), k_10_rec.name(), k_10_rec.kor(), k_10_rec.eng(), k_10_rec.mat(), k_10_rec.sum(), k_10_rec.ave()); // ( ) ���
		
		k_10_sumkor +=k_10_rec.kor();		// ���� ���� �հ� ���ϱ�
		k_10_sumeng +=k_10_rec.eng();		// ���� ���� �հ� ���ϱ�
		k_10_summat +=k_10_rec.mat();		// ���� ���� �հ� ���ϱ�
		k_10_sumsum +=k_10_rec.sum();		// ���� �հ� ���ϱ�
		k_10_sumave +=k_10_rec.ave();		// ���� ��� �հ� ���ϱ�

	}
	
	//���� �μ�
	public static void TailPrint() {
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");														 // ( ) ���
		System.out.printf("�����հ� %d   �������: %6.2f\n", k_10_sumkor, k_10_sumkor / (double)k_10_ArrayPP10OneRec.size());		// ( ) ���
		System.out.printf("�����հ� %d   �������: %6.2f\n", k_10_sumeng, k_10_sumeng / (double)k_10_ArrayPP10OneRec.size());		// ( ) ���
		System.out.printf("�����հ� %d   �������: %6.2f\n", k_10_summat, k_10_summat / (double)k_10_ArrayPP10OneRec.size());		// ( ) ���
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");														 // ( ) ���
		System.out.printf("������հ� %d   �����: %6.2f\n", k_10_sumave, k_10_sumave / (double)k_10_ArrayPP10OneRec.size());		// ( ) ���
	}
	
	public static void dataSort() {
		Comparator<PP10OneRec> k_10_bikyeokijun = new Comparator<PP10OneRec>() {	// ��Ʈ�� ���� �޼ҵ�
			public int compare(PP10OneRec k_10_a1, PP10OneRec k_10_a2) {			
				return (k_10_a2.sum() - k_10_a1.sum());								//k_10_a2���� k_10_a1�� ���ش�.
			}
		};
		Collections.sort(k_10_ArrayPP10OneRec, k_10_bikyeokijun);					// k_10_ArrayPP10OneRec�� k_10_bikyeokijun���� ��Ʈ���ش�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dataSet();
		dataSort();
		HeaderPrint();
		for(int k_10_i = 0; k_10_i < k_10_ArrayPP10OneRec.size(); k_10_i++) { // k_10_ArrayPP10OneRec ũ�⸸ŭ �ݺ�
			ItemPrint(k_10_i);													// ���
		}
		TailPrint();
	}
	
	
	
	
	
	
	
	


}
