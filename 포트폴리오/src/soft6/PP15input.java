package soft6;

public class PP15input {
	int k_10_a;   
	int [] k_10_i;                      //���� �л����� ��ȣ ���� �հ� ����� ���ϴµ� �ʿ��� �Լ��� ���ϱ� ���� �������� �����̴�.
	int [] k_10_kor; 					//�迭�� �������ְ� k_10_a�� ���� �ݺ��Ҷ����� ��ȣ�� ���������.
	int [] k_10_eng;
	int [] k_10_mat;
	int [] k_10_sum;
	double [] k_10_ave;
	String [] k_10_name;
	public PP15input(int k_10_iPerson) { //���ڸ� �迭�� ũ��� �Ѵ�.
		k_10_a = 0;
		k_10_i = new int[k_10_iPerson];
		k_10_kor = new int[k_10_iPerson];
		k_10_eng = new int[k_10_iPerson];
		k_10_mat = new int[k_10_iPerson];
		k_10_sum = new int[k_10_iPerson];
		k_10_ave = new double[k_10_iPerson];
		k_10_name = new String[k_10_iPerson];
	}
	
	public void SetData(int k_10_i, String k_10_name, int k_10_kor, int k_10_eng, int k_10_mat) { // ���� ���ڵ��� ���� �迭�� �־��ش�.
			this.k_10_i[this.k_10_a] = k_10_i;
			this.k_10_kor[this.k_10_a] = k_10_kor;
			this.k_10_eng[this.k_10_a] = k_10_eng;
			this.k_10_mat[this.k_10_a] = k_10_mat;
			this.k_10_sum[this.k_10_a] = k_10_kor + k_10_eng + k_10_mat;
			this.k_10_ave[this.k_10_a] = (k_10_kor + k_10_eng + k_10_mat) / 3;
			this.k_10_name[this.k_10_a] = k_10_name;

		this.k_10_a++;
	}
}
