package soft6;

public class PP13report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iPerson = 10; 														// 학생수 정의
		PP13InputData k_10_indata = new PP13InputData(k_10_iPerson);
			
		for (int k_10_i = 0; k_10_i < k_10_iPerson; k_10_i++) {						// 학생수만큼 반복
			String k_10_name = String.format("홍길%02d", k_10_i);					// 이름과 각 과목의 점수를 만들어준다.
			int k_10_kor = (int)(Math.random()*100);
			int k_10_eng = (int)(Math.random()*100);
			int k_10_mat = (int)(Math.random()*100);
			k_10_indata.SetData(k_10_i, k_10_name, k_10_kor, k_10_eng, k_10_mat);  	// 이름과 점수들을 SetData의 인자로 주면 그 값들을 SetData가 배열에 넣어준다.
		}
		
		 
		for (int k_10_i = 0; k_10_i < k_10_iPerson; k_10_i++) {						// 학생수만큼 반복
			
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어%d, 수학:%d, 총점:%d, 평균:%f\n",
					k_10_i, k_10_indata.k_10_name[k_10_i], k_10_indata.k_10_kor[k_10_i], k_10_indata.k_10_eng[k_10_i], k_10_indata.k_10_mat[k_10_i],  // ( )  출력
					k_10_indata.k_10_sum[k_10_i], k_10_indata.k_10_ave[k_10_i]);
		}
		
	}

}
