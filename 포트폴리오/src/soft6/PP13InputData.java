package soft6;

public class PP13InputData {                      // 과목별 점수들을 배열에 넣기 위한 변수들
	int k_10_a;										//먼저 선언을 해주고 생성자에서 값을 넣어준다
	int [] k_10_i;
	int [] k_10_kor;
	int [] k_10_eng;
	int [] k_10_mat;
	int [] k_10_sum;
	double [] k_10_ave;
	int k_10_korave;
	int k_10_engave;
	int k_10_matave;
	int k_10_total;
	
	String [] k_10_name;
	public PP13InputData(int k_10_iPerson) {
		k_10_a = 0;								//배열 순서를 위한 변수
		k_10_i = new int[k_10_iPerson];			//받은 인자 값을 ( 학생수 ) 배열 크기로 정해준다.
		k_10_kor = new int[k_10_iPerson];
		k_10_eng = new int[k_10_iPerson];
		k_10_mat = new int[k_10_iPerson];
		k_10_sum = new int[k_10_iPerson];
		k_10_ave = new double[k_10_iPerson];
		k_10_name = new String[k_10_iPerson];
		
		k_10_korave = 0;
		k_10_engave = 0;
		k_10_matave = 0;
		k_10_total = 0;
	}
	
	
	
	public void SetData(int k_10_i, String k_10_name, int k_10_kor, int k_10_eng, int k_10_mat) {  //인자를 받아서 각 각의 변수들에 넣어준다
	
			this.k_10_kor[this.k_10_a] = k_10_kor;
			this.k_10_eng[this.k_10_a] = k_10_eng;
			this.k_10_mat[this.k_10_a] = k_10_mat;
			this.k_10_sum[this.k_10_a] = k_10_kor + k_10_eng + k_10_mat;
			this.k_10_ave[this.k_10_a] = (k_10_kor + k_10_eng + k_10_mat) / 3;
			this.k_10_name[this.k_10_a] = k_10_name;
			
		
		this.k_10_a++;
	}
	
}
