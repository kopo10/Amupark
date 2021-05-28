package soft7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PP13 {
		static ArrayList<PP11intput> k_10_ArrayPP11intput = new ArrayList<PP11intput>();

		static int k_10_sumkor = 0;
		static int k_10_sumeng = 0;
		static int k_10_summat = 0;
		static int k_10_sumsum = 0;
		static int k_10_sumave = 0;
		static final int k_10_iPerson = 200;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// PP11intput k_10_indata = new PP11intput(k_10_iPerson);

			dataSet();
			dataSort();
			print();
		}		
		public static void dataSort() {												// ��Ʈ�� ���� �޼ҵ�
			Comparator<PP11intput> k_10_bikyeokijun = new Comparator<PP11intput>() {
				public int compare(PP11intput k_10_a1, PP11intput k_10_a2) {
					return (k_10_a2.sum() - k_10_a1.sum());								//k_10_a2���� k_10_a1�� ���ش�.
				}
			};
			Collections.sort(k_10_ArrayPP11intput, k_10_bikyeokijun);					// k_10_ArrayPP10OneRec�� k_10_bikyeokijun���� ��Ʈ���ش�
		}

		
		public static void dataSet() {
			for (int k_10_i = 0; k_10_i <= k_10_iPerson; k_10_i++) { // �������ŭ �ݺ�
				int k_10_student_id = k_10_i + 1;
				String k_10_name = String.format("ȫ��%02d", k_10_i); // ��� ���� ī��Ʈ �ȴ�.
				int k_10_kor = (int) (Math.random() * 100); // �������� ���ڰ� ����
				int k_10_eng = (int) (Math.random() * 100); // �������� ���ڰ� ����
				int k_10_mat = (int) (Math.random() * 100); // �������� ���ڰ� ����
				k_10_ArrayPP11intput.add(new PP11intput(k_10_student_id, k_10_name, k_10_kor, k_10_eng, k_10_mat)); // k_10_ArrayPP11intput�� ���� �־��ش�
			}
		}

		public static void print() {
			PP111Output k_10_out = new PP111Output();

			int k_10_kor31 = 0; // �ݸ��� ����� ���� ���� int
			int k_10_mat31 = 0; // �ݸ��� ����� ���� ���� int
			int k_10_eng31 = 0; // �ݸ��� ����� ���� ���� int

			k_10_out.title1(); // title ���
			for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { // ��� ����ŭ �ݺ�
				PP11intput k_10_rec;

				k_10_rec = k_10_ArrayPP11intput.get(k_10_i - 1);
				System.out.printf("%3d %8s %6d %8d %8d   %7d   %6.2f\n", k_10_rec.student_id(), k_10_rec.name(), k_10_rec.kor(), k_10_rec.eng(), // ( ) ���
						k_10_rec.mat(), k_10_rec.sum(), k_10_rec.ave());

				k_10_sumkor += k_10_rec.kor();	// ���� �հ踦 
				k_10_sumeng += k_10_rec.eng();
				k_10_summat += k_10_rec.mat();
				k_10_sumsum += k_10_rec.sum();
				k_10_sumave += k_10_rec.ave();

				if ((k_10_i % 30 == 0 && k_10_i != 0)) { // 30���� ��� ���

					k_10_kor31 += k_10_sumkor; // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
					k_10_mat31 += k_10_summat; // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
					k_10_eng31 += k_10_sumeng; // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
					int k_10_total30 = k_10_sumkor + k_10_sumeng + k_10_summat; // ���� ���ϱ�
					double k_10_total30ave = (k_10_summat + k_10_sumeng + k_10_sumkor) / 3; // ��� ���ϱ�
					int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31; // ���� ���� ���ϱ�
					double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3; // ���� ��� ���ϱ�

					k_10_out.pagefornow(); // ( ) ���
					System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor, k_10_sumeng, k_10_summat, k_10_total30,
							k_10_total30ave); // ���� �հ� ����ϱ�
					System.out.printf("���%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor / 30, k_10_sumeng / 30, k_10_summat / 30,
							k_10_total30 / 30, k_10_total30ave / 30); // ���� �հ� ����ϱ�
					k_10_out.pagefortotal();
					System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.2f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,
							k_10_total31ave); // ���� �հ� ����ϱ�
					System.out.printf("���%18d  %7d   %6d  %6d    %6.2f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i,
							k_10_mat31 / k_10_i, k_10_total31 / k_10_i, k_10_total31ave / k_10_i); // ���� ��� ����ϱ�
					k_10_out.title2(); // ( ) ���
					k_10_out.title1(); // ( ) ���

					k_10_sumkor = 0; // �� �ʱ�ȭ
					k_10_sumeng = 0; // �� �ʱ�ȭ
					k_10_summat = 0; // �� �ʱ�ȭ

				} else if (k_10_i == 200) { // �������� 30���� �ȵǹǷ� ���� �������ش� k_10_out.title2(); // ( ) ���
											// k_10_out.title1(); // ( ) ����� ����ϱ� ������ �����Ƿ�

					k_10_kor31 += k_10_sumkor;  // ���� �հ�
					k_10_mat31 += k_10_summat;	// ���� �հ�
 					k_10_eng31 += k_10_sumeng;	// ���� �հ�
					int k_10_total30 = k_10_sumkor + k_10_sumeng + k_10_summat; 	 		 // �հ� 
					double k_10_total30ave = (k_10_sumkor + k_10_sumeng + k_10_summat) / 3; //�հ� ���
					int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31;				 // �����հ�
					double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3;	// �����հ����

					k_10_out.pagefornow(); 																							// ( ) ���
					System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor, k_10_sumeng, k_10_summat, k_10_total30,	// ( ) ���
							k_10_total30ave);																								
					System.out.printf("���%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor / 20, k_10_sumeng / 20, k_10_summat / 20,	// ( ) ���
							k_10_total30 / 20, k_10_total30ave / 20);
					k_10_out.pagefortotal();																						// ( ) ���
					System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.2f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,		// ( ) ���
							k_10_total31ave);
					System.out.printf("���%18d  %7d   %6d   %6d  %7.2f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i,				// ( ) ���
							k_10_mat31 / k_10_i, k_10_total31 / k_10_i, k_10_total31ave / k_10_i);									// ( ) ���

					k_10_sumkor = 0; // �� �ʱ�ȭ
					k_10_sumeng = 0; // �� �ʱ�ȭ
					k_10_summat = 0; // �� �ʱ�ȭ
				}

			}
		}

		
	}


