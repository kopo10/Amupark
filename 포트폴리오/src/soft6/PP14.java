package soft6;

public class PP14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iPerson = 30;														//�л��� ����
		PP13InputData k_10_indata = new PP13InputData(k_10_iPerson);
		PP14Output k_10_out = new PP14Output();

		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) {					//�л�����ŭ �ݺ�
			String k_10_name = String.format("ȫ��%02d", k_10_i);					//������ �л��� �̸��� ���� ����
			int k_10_kor = (int) (Math.random() * 100);
			int k_10_eng = (int) (Math.random() * 100);
			int k_10_mat = (int) (Math.random() * 100);
			k_10_indata.SetData(k_10_i, k_10_name, k_10_kor, k_10_eng, k_10_mat);   //SetData�� �־��ָ� SetData�� �迭�� �־��ش�.
			// indata.korave();

		}
		int k_10_kortotal = 0;
		int k_10_mattotal = 0;
		int k_10_engtotal = 0;

		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { 					// �л�����ŭ �ݺ�
			
			k_10_kortotal += k_10_indata.k_10_kor[k_10_i-1];							// ���������� ���� �����ش�.
			k_10_mattotal += k_10_indata.k_10_mat[k_10_i-1];							// ���������� ���� �����ش�.
			k_10_engtotal += k_10_indata.k_10_eng[k_10_i-1];							// ���������� ���� �����ش�.
		}
		int k_10_total = k_10_kortotal + k_10_mattotal + k_10_engtotal;				// ��� ���� ������ �����ش�

		int k_10_korave = k_10_kortotal / 30;										//��������� �л�����ŭ �����ش�
		int k_10_matave = k_10_mattotal / 30;										//���а����� �л�����ŭ �����ش�
		int k_10_engave = k_10_engtotal / 30;										//��������� �л�����ŭ �����ش�

		int k_10_avetotal = k_10_korave + k_10_matave + k_10_engave;				//��������� �����ش�

		double k_10_totalave = k_10_total / 3;										//����� ����� �����ش�.
		double k_10_avetotalave = (k_10_korave + k_10_matave + k_10_engave) / 3;

		k_10_out.title();
		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) {

			System.out.printf("%03d %7s %5d %6d %6d %7d %7.0f\n", k_10_i, k_10_indata.k_10_name[k_10_i-1], k_10_indata.k_10_kor[k_10_i-1], k_10_indata.k_10_eng[k_10_i-1], // ( ) ���
					k_10_indata.k_10_mat[k_10_i-1], k_10_indata.k_10_sum[k_10_i-1], k_10_indata.k_10_ave[k_10_i-1]);
		}
		k_10_out.end();

		System.out.printf("�հ�%15d  %6d   %4d   %5d  %5.0f  \n", k_10_kortotal, k_10_mattotal, k_10_engtotal, k_10_total, k_10_totalave);								 // ( ) ���
		System.out.printf("���%15d  %6d   %4d   %5d  %5.0f  \n", k_10_korave, k_10_engave, k_10_matave, k_10_avetotal, k_10_avetotalave);									 // ( ) ���

	}

}
