package soft6;

public class PP13report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iPerson = 10; 														// �л��� ����
		PP13InputData k_10_indata = new PP13InputData(k_10_iPerson);
			
		for (int k_10_i = 0; k_10_i < k_10_iPerson; k_10_i++) {						// �л�����ŭ �ݺ�
			String k_10_name = String.format("ȫ��%02d", k_10_i);					// �̸��� �� ������ ������ ������ش�.
			int k_10_kor = (int)(Math.random()*100);
			int k_10_eng = (int)(Math.random()*100);
			int k_10_mat = (int)(Math.random()*100);
			k_10_indata.SetData(k_10_i, k_10_name, k_10_kor, k_10_eng, k_10_mat);  	// �̸��� �������� SetData�� ���ڷ� �ָ� �� ������ SetData�� �迭�� �־��ش�.
		}
		
		 
		for (int k_10_i = 0; k_10_i < k_10_iPerson; k_10_i++) {						// �л�����ŭ �ݺ�
			
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����%d, ����:%d, ����:%d, ���:%f\n",
					k_10_i, k_10_indata.k_10_name[k_10_i], k_10_indata.k_10_kor[k_10_i], k_10_indata.k_10_eng[k_10_i], k_10_indata.k_10_mat[k_10_i],  // ( )  ���
					k_10_indata.k_10_sum[k_10_i], k_10_indata.k_10_ave[k_10_i]);
		}
		
	}

}
