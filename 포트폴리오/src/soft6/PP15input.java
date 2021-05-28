package soft6;

public class PP15input {
	int k_10_a;   
	int [] k_10_i;                      //각각 학생들의 번호 성적 합계 평균을 구하는데 필요한 함수를 구하기 위해 설정해준 값들이다.
	int [] k_10_kor; 					//배열을 생성해주고 k_10_a을 통해 반복할때마다 번호를 저장해줬다.
	int [] k_10_eng;
	int [] k_10_mat;
	int [] k_10_sum;
	double [] k_10_ave;
	String [] k_10_name;
	public PP15input(int k_10_iPerson) { //인자를 배열의 크기로 한다.
		k_10_a = 0;
		k_10_i = new int[k_10_iPerson];
		k_10_kor = new int[k_10_iPerson];
		k_10_eng = new int[k_10_iPerson];
		k_10_mat = new int[k_10_iPerson];
		k_10_sum = new int[k_10_iPerson];
		k_10_ave = new double[k_10_iPerson];
		k_10_name = new String[k_10_iPerson];
	}
	
	public void SetData(int k_10_i, String k_10_name, int k_10_kor, int k_10_eng, int k_10_mat) { // 받은 인자들을 각각 배열에 넣어준다.
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
