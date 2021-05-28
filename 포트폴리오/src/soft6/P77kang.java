package soft6;

import soft7.P7OneRec;

public class P77kang {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k_10_iPerson = 200;
		//PP15input k_10_indata = new PP15input(k_10_iPerson);
		PP15Output k_10_out = new PP15Output();
		P77kang2 [] k_10_inData = new P77kang2[k_10_iPerson];
		
		for (int k_10_i = 0; k_10_i < k_10_iPerson; k_10_i++) { // 사람수만큼 반복
			String k_10_name = String.format("홍길%02d", k_10_i); //사람 수가 카운트 된다.
			int k_10_kor = (int) (Math.random() * 100); // 랜덤으로 숫자가 나옴
			int k_10_eng = (int) (Math.random() * 100); // 랜덤으로 숫자가 나옴
			int k_10_mat = (int) (Math.random() * 100); // 랜덤으로 숫자가 나옴
			k_10_inData[k_10_i] = new P77kang2(k_10_name, k_10_kor, k_10_eng, k_10_mat); //나온 값들을 	k_10_inData 에 넣어준다.
		}
		int k_10_kor30 = 0; //반마다 평균을 내기 위한 int
		int k_10_mat30 = 0; //반마다 평균을 내기 위한 int
		int k_10_eng30 = 0; //반마다 평균을 내기 위한 int
		int k_10_kor31 = 0; //반마다 평균을 내기 위한 int
		int k_10_mat31 = 0; //반마다 평균을 내기 위한 int
		int k_10_eng31 = 0; //반마다 평균을 내기 위한 int

		k_10_out.title1(); // title 출력
		for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { // 사람 수만큼 반복

			System.out.printf("%03d %8s %6d %8d %8d %8d %8.0f\n",
								k_10_i, k_10_inData[k_10_i-1].name(), k_10_inData[k_10_i-1].kor(), k_10_inData[k_10_i-1].eng(), k_10_inData[k_10_i-1].mat(),
								k_10_inData[k_10_i-1].sum(), k_10_inData[k_10_i-1].ave());
			k_10_kor30 += k_10_inData[k_10_i-1].kor(); //30명에 대한 국어 총합을 구하기 위한 변수
			k_10_mat30 += k_10_inData[k_10_i-1].mat(); //30명에 대한 수학 총합을 구하기 위한 변수
			k_10_eng30 += k_10_inData[k_10_i-1].eng(); //30명에 대한 영어 총합을 구하기 위한 변수
			if ((k_10_i % 30 == 0 && k_10_i != 0)) { //30마다 평균 계산
				for (int k_10_k = k_10_i - 30; k_10_k < k_10_i; k_10_k++) {
//					k_10_kor30 += k_10_inData[k_10_i-1].kor(); //30명에 대한 국어 총합을 구하기 위한 변수
//					k_10_mat30 += k_10_inData[k_10_i-1].mat(); //30명에 대한 수학 총합을 구하기 위한 변수
//					k_10_eng30 += k_10_inData[k_10_i-1].eng(); //30명에 대한 영어 총합을 구하기 위한 변수
				}

				k_10_kor31 += k_10_kor30; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
				k_10_mat31 += k_10_mat30; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
				k_10_eng31 += k_10_eng30; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
				int k_10_total30 = k_10_kor30 + k_10_mat30 + k_10_eng30; // 총합 구하기
				double k_10_total30ave = (k_10_kor30 + k_10_mat30 + k_10_eng30) / 3; // 평균 구하기
				int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31; // 누적 총합 구하기
				double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3; // 누적 평균 구하기

				k_10_out.pagefornow(); //( ) 출력
				System.out.printf("합계%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30, k_10_eng30, k_10_mat30, k_10_total30,
						k_10_total30ave); // 현재 합계 출력하기
				System.out.printf("평균%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30 / 30, k_10_eng30 / 30, k_10_mat30 / 30,
						k_10_total30 / 30, k_10_total30ave / 30); // 현재 합계 출력하기
				k_10_kor30 = 0; //값 초기화
				k_10_mat30 = 0; //값 초기화
				k_10_eng30 = 0; //값 초기화
				k_10_out.pagefortotal();
				System.out.printf("합계%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,
						k_10_total31ave); // 누적 합계 출력하기 
				System.out.printf("평균%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i, k_10_mat31 / k_10_i,
						k_10_total31 / k_10_i, k_10_total31ave / k_10_i); // 누적 평균 출력하기
				k_10_out.title2(); // ( ) 출력
				k_10_out.title1(); // ( ) 출력
				

			} else if (k_10_i == k_10_iPerson) { // 마지막엔 30명이 안되므로 따로 설정해준다 	k_10_out.title2(); // ( ) 출력
																						//k_10_out.title1(); // ( ) 출력을 출력하길 원하지 않으므로
				for (int k_10_k = k_10_i - 20; k_10_k <= k_10_i; k_10_k++) {
//					k_10_kor30 += k_10_inData[k_10_k-1].kor(); //30명에 대한 국어 총합을 구하기 위한 변수
//					k_10_mat30 += k_10_inData[k_10_k-1].mat(); //30명에 대한 수학 총합을 구하기 위한 변수
//					k_10_eng30 += k_10_inData[k_10_k-1].eng(); //30명에 대한 영어 총합을 구하기 위한 변수

				}
				k_10_kor31 += k_10_kor30; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
				k_10_mat31 += k_10_mat30; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
				k_10_eng31 += k_10_eng30;  // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
				int k_10_total30 = k_10_kor30 + k_10_mat30 + k_10_eng30;
				double k_10_total30ave = (k_10_kor30 + k_10_mat30 + k_10_eng30) / 3;
				int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31;
				double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3;

				k_10_out.pagefornow();
				System.out.printf("합계%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30, k_10_eng30, k_10_mat30, k_10_total30, // ( ) 출력
						k_10_total30ave);
				System.out.printf("평균%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor30 / 20, k_10_eng30 / 20, k_10_mat30 / 20,   // ( ) 출력
						k_10_total30 / 20, k_10_total30ave / 20);
				k_10_kor30 = 0;
				k_10_mat30 = 0;
				k_10_eng30 = 0;
				k_10_out.pagefortotal();
				System.out.printf("합계%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31, // ( ) 출력
						k_10_total31ave);
				System.out.printf("평균%18d  %7d   %6d   %6d  %7.0f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i, k_10_mat31 / k_10_i,   // ( ) 출력
						k_10_total31 / k_10_i, k_10_total31ave / k_10_i);

			}
		}
	}


}
