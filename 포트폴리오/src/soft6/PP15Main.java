package soft6;

public class PP15Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k_10_iPerson = 200;
		PP15input k_10_indata = new PP15input(k_10_iPerson);
		PP15Output k_10_out = new PP15Output();

		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { // �������ŭ �ݺ�
			String k_10_name = String.format("ȫ��%02d", k_10_i); //��� ���� ī��Ʈ �ȴ�.
			int k_10_kor = (int) (Math.random() * 100); // �������� ���ڰ� ����
			int k_10_eng = (int) (Math.random() * 100); // �������� ���ڰ� ����
			int k_10_mat = (int) (Math.random() * 100); // �������� ���ڰ� ����
			k_10_indata.SetData(k_10_i, k_10_name, k_10_kor, k_10_eng, k_10_mat); // ���� ���� SetData�� �Է�
		}
		
		int k_10_kor30 = 0; //�ݸ��� ����� ���� ���� int
		int k_10_mat30 = 0; //�ݸ��� ����� ���� ���� int
		int k_10_eng30 = 0; //�ݸ��� ����� ���� ���� int
		int k_10_kor31 = 0; //�ݸ��� ����� ���� ���� int
		int k_10_mat31 = 0; //�ݸ��� ����� ���� ���� int
		int k_10_eng31 = 0; //�ݸ��� ����� ���� ���� int

		k_10_out.title1(); // title ���
		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { // ��� ����ŭ �ݺ�

			System.out.printf("%03d %8s %6d %8d %8d %8d %8.0f\n", k_10_indata.k_10_i[k_10_i - 1], //indata�� ���� ���� �ݺ� ���
					k_10_indata.k_10_name[k_10_i - 1], k_10_indata.k_10_kor[k_10_i - 1],
					k_10_indata.k_10_eng[k_10_i - 1], k_10_indata.k_10_mat[k_10_i - 1],
					k_10_indata.k_10_sum[k_10_i - 1], k_10_indata.k_10_ave[k_10_i - 1]);
			if ((k_10_i % 30 == 0 && k_10_i != 0)) { //30���� ��� ���
				for (int k_10_k = k_10_i - 30; k_10_k < k_10_i; k_10_k++) {
					k_10_kor30 += k_10_indata.k_10_kor[k_10_k]; //30�� ���� ���� ������ ���ϱ� ���� ����
					k_10_mat30 += k_10_indata.k_10_mat[k_10_k]; //30�� ���� ���� ������ ���ϱ� ���� ����
					k_10_eng30 += k_10_indata.k_10_eng[k_10_k]; //30�� ���� ���� ������ ���ϱ� ���� ����
				}

				k_10_kor31 += k_10_kor30; // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
				k_10_mat31 += k_10_mat30; // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
				k_10_eng31 += k_10_eng30; // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
				int k_10_total30 = k_10_kor30 + k_10_mat30 + k_10_eng30; // ���� ���ϱ�
				double k_10_total30ave = (k_10_kor30 + k_10_mat30 + k_10_eng30) / 3; // ��� ���ϱ�
				int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31; // ���� ���� ���ϱ�
				double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3; // ���� ��� ���ϱ�

				k_10_out.pagefornow(); //( ) ���
				System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30, k_10_eng30, k_10_mat30, k_10_total30,
						k_10_total30ave); // ���� �հ� ����ϱ�
				System.out.printf("���%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30 / 30, k_10_eng30 / 30, k_10_mat30 / 30,
						k_10_total30 / 30, k_10_total30ave / 30); // ���� �հ� ����ϱ�
				k_10_kor30 = 0; //�� �ʱ�ȭ
				k_10_mat30 = 0; //�� �ʱ�ȭ
				k_10_eng30 = 0; //�� �ʱ�ȭ
				k_10_out.pagefortotal();
				System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,
						k_10_total31ave); // ���� �հ� ����ϱ� 
				System.out.printf("���%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i, k_10_mat31 / k_10_i,
						k_10_total31 / k_10_i, k_10_total31ave / k_10_i); // ���� ��� ����ϱ�
				k_10_out.title2(); // ( ) ���
				k_10_out.title1(); // ( ) ���
				

			} else if (k_10_i == 200) { // �������� 30���� �ȵǹǷ� ���� �������ش� 	k_10_out.title2(); // ( ) ���
																						//k_10_out.title1(); // ( ) ����� ����ϱ� ������ �����Ƿ�
				for (int k_10_k = k_10_i - 20; k_10_k < k_10_i; k_10_k++) {
					k_10_kor30 += k_10_indata.k_10_kor[k_10_k];
					k_10_mat30 += k_10_indata.k_10_mat[k_10_k];
					k_10_eng30 += k_10_indata.k_10_eng[k_10_k];

				}
				k_10_kor31 += k_10_kor30;	 // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
				k_10_mat31 += k_10_mat30;	 // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
				k_10_eng31 += k_10_eng30;	 // 30������ ����� ���⵵ �ϰ� ������ �ؾ��ϹǷ� ������ ���� �� ����
				int k_10_total30 = k_10_kor30 + k_10_mat30 + k_10_eng30;
				double k_10_total30ave = (k_10_kor30 + k_10_mat30 + k_10_eng30) / 3; //���� ���
				int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31;
				double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3; //������ ���

				k_10_out.pagefornow();
				System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30, k_10_eng30, k_10_mat30, k_10_total30,  	 // ( ) ���
						k_10_total30ave);
				System.out.printf("���%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30 / 20, k_10_eng30 / 20, k_10_mat30 / 20,	 // ( ) ���
						k_10_total30 / 30, k_10_total30ave / 30);
				k_10_kor30 = 0;	//�� �ʱ�ȭ
				k_10_mat30 = 0;	//�� �ʱ�ȭ
				k_10_eng30 = 0;	//�� �ʱ�ȭ
				k_10_out.pagefortotal();
				System.out.printf("�հ�%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,	 // ( ) ���
						k_10_total31ave);
				System.out.printf("���%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i, k_10_mat31 / k_10_i,
						k_10_total31 / k_10_i, k_10_total31ave / k_10_i);													  // ( ) ���

			}
		}
	}
}
