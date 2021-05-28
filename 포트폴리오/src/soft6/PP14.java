package soft6;

public class PP14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iPerson = 30;														//학생수 정의
		PP13InputData k_10_indata = new PP13InputData(k_10_iPerson);
		PP14Output k_10_out = new PP14Output();

		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) {					//학생수만큼 반복
			String k_10_name = String.format("홍길%02d", k_10_i);					//각각의 학생의 이름과 점수 정의
			int k_10_kor = (int) (Math.random() * 100);
			int k_10_eng = (int) (Math.random() * 100);
			int k_10_mat = (int) (Math.random() * 100);
			k_10_indata.SetData(k_10_i, k_10_name, k_10_kor, k_10_eng, k_10_mat);   //SetData에 넣어주면 SetData가 배열에 넣어준다.
			// indata.korave();

		}
		int k_10_kortotal = 0;
		int k_10_mattotal = 0;
		int k_10_engtotal = 0;

		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { 					// 학생수만큼 반복
			
			k_10_kortotal += k_10_indata.k_10_kor[k_10_i-1];							// 국어점수를 전부 더해준다.
			k_10_mattotal += k_10_indata.k_10_mat[k_10_i-1];							// 수학점수를 전부 더해준다.
			k_10_engtotal += k_10_indata.k_10_eng[k_10_i-1];							// 영어점수를 전부 더해준다.
		}
		int k_10_total = k_10_kortotal + k_10_mattotal + k_10_engtotal;				// 모든 과목 점수를 더해준다

		int k_10_korave = k_10_kortotal / 30;										//국어과목을 학생수만큼 나눠준다
		int k_10_matave = k_10_mattotal / 30;										//수학과목을 학생수만큼 나눠준다
		int k_10_engave = k_10_engtotal / 30;										//영어과목을 학생수만큼 나눠준다

		int k_10_avetotal = k_10_korave + k_10_matave + k_10_engave;				//평균총합을 구해준다

		double k_10_totalave = k_10_total / 3;										//평균의 평균을 구해준다.
		double k_10_avetotalave = (k_10_korave + k_10_matave + k_10_engave) / 3;

		k_10_out.title();
		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) {

			System.out.printf("%03d %7s %5d %6d %6d %7d %7.0f\n", k_10_i, k_10_indata.k_10_name[k_10_i-1], k_10_indata.k_10_kor[k_10_i-1], k_10_indata.k_10_eng[k_10_i-1], // ( ) 출력
					k_10_indata.k_10_mat[k_10_i-1], k_10_indata.k_10_sum[k_10_i-1], k_10_indata.k_10_ave[k_10_i-1]);
		}
		k_10_out.end();

		System.out.printf("합계%15d  %6d   %4d   %5d  %5.0f  \n", k_10_kortotal, k_10_mattotal, k_10_engtotal, k_10_total, k_10_totalave);								 // ( ) 출력
		System.out.printf("평균%15d  %6d   %4d   %5d  %5.0f  \n", k_10_korave, k_10_engave, k_10_matave, k_10_avetotal, k_10_avetotalave);									 // ( ) 출력

	}

}
