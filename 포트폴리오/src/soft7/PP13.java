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
		public static void dataSort() {												// 솔트를 위한 메소드
			Comparator<PP11intput> k_10_bikyeokijun = new Comparator<PP11intput>() {
				public int compare(PP11intput k_10_a1, PP11intput k_10_a2) {
					return (k_10_a2.sum() - k_10_a1.sum());								//k_10_a2에서 k_10_a1을 빼준다.
				}
			};
			Collections.sort(k_10_ArrayPP11intput, k_10_bikyeokijun);					// k_10_ArrayPP10OneRec을 k_10_bikyeokijun으로 솔트해준다
		}

		
		public static void dataSet() {
			for (int k_10_i = 0; k_10_i <= k_10_iPerson; k_10_i++) { // 사람수만큼 반복
				int k_10_student_id = k_10_i + 1;
				String k_10_name = String.format("홍길%02d", k_10_i); // 사람 수가 카운트 된다.
				int k_10_kor = (int) (Math.random() * 100); // 랜덤으로 숫자가 나옴
				int k_10_eng = (int) (Math.random() * 100); // 랜덤으로 숫자가 나옴
				int k_10_mat = (int) (Math.random() * 100); // 랜덤으로 숫자가 나옴
				k_10_ArrayPP11intput.add(new PP11intput(k_10_student_id, k_10_name, k_10_kor, k_10_eng, k_10_mat)); // k_10_ArrayPP11intput에 값을 넣어준다
			}
		}

		public static void print() {
			PP111Output k_10_out = new PP111Output();

			int k_10_kor31 = 0; // 반마다 평균을 내기 위한 int
			int k_10_mat31 = 0; // 반마다 평균을 내기 위한 int
			int k_10_eng31 = 0; // 반마다 평균을 내기 위한 int

			k_10_out.title1(); // title 출력
			for (int k_10_i = 1; k_10_i <= k_10_iPerson; k_10_i++) { // 사람 수만큼 반복
				PP11intput k_10_rec;

				k_10_rec = k_10_ArrayPP11intput.get(k_10_i - 1);
				System.out.printf("%3d %8s %6d %8d %8d   %7d   %6.2f\n", k_10_rec.student_id(), k_10_rec.name(), k_10_rec.kor(), k_10_rec.eng(), // ( ) 출력
						k_10_rec.mat(), k_10_rec.sum(), k_10_rec.ave());

				k_10_sumkor += k_10_rec.kor();	// 국어 합계를 
				k_10_sumeng += k_10_rec.eng();
				k_10_summat += k_10_rec.mat();
				k_10_sumsum += k_10_rec.sum();
				k_10_sumave += k_10_rec.ave();

				if ((k_10_i % 30 == 0 && k_10_i != 0)) { // 30마다 평균 계산

					k_10_kor31 += k_10_sumkor; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
					k_10_mat31 += k_10_summat; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
					k_10_eng31 += k_10_sumeng; // 30번마다 평균을 내기도 하고 누적도 해야하므로 누적을 위한 값 저장
					int k_10_total30 = k_10_sumkor + k_10_sumeng + k_10_summat; // 총합 구하기
					double k_10_total30ave = (k_10_summat + k_10_sumeng + k_10_sumkor) / 3; // 평균 구하기
					int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31; // 누적 총합 구하기
					double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3; // 누적 평균 구하기

					k_10_out.pagefornow(); // ( ) 출력
					System.out.printf("합계%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor, k_10_sumeng, k_10_summat, k_10_total30,
							k_10_total30ave); // 현재 합계 출력하기
					System.out.printf("평균%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor / 30, k_10_sumeng / 30, k_10_summat / 30,
							k_10_total30 / 30, k_10_total30ave / 30); // 현재 합계 출력하기
					k_10_out.pagefortotal();
					System.out.printf("합계%18d  %7d   %6d   %6d  %7.2f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,
							k_10_total31ave); // 누적 합계 출력하기
					System.out.printf("평균%18d  %7d   %6d  %6d    %6.2f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i,
							k_10_mat31 / k_10_i, k_10_total31 / k_10_i, k_10_total31ave / k_10_i); // 누적 평균 출력하기
					k_10_out.title2(); // ( ) 출력
					k_10_out.title1(); // ( ) 출력

					k_10_sumkor = 0; // 값 초기화
					k_10_sumeng = 0; // 값 초기화
					k_10_summat = 0; // 값 초기화

				} else if (k_10_i == 200) { // 마지막엔 30명이 안되므로 따로 설정해준다 k_10_out.title2(); // ( ) 출력
											// k_10_out.title1(); // ( ) 출력을 출력하길 원하지 않으므로

					k_10_kor31 += k_10_sumkor;  // 국어 합계
					k_10_mat31 += k_10_summat;	// 수학 합계
 					k_10_eng31 += k_10_sumeng;	// 영어 합계
					int k_10_total30 = k_10_sumkor + k_10_sumeng + k_10_summat; 	 		 // 합계 
					double k_10_total30ave = (k_10_sumkor + k_10_sumeng + k_10_summat) / 3; //합계 평균
					int k_10_total31 = k_10_kor31 + k_10_mat31 + k_10_eng31;				 // 누적합계
					double k_10_total31ave = (k_10_kor31 + k_10_mat31 + k_10_eng31) / 3;	// 누적합계평균

					k_10_out.pagefornow(); 																							// ( ) 출력
					System.out.printf("합계%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor, k_10_sumeng, k_10_summat, k_10_total30,	// ( ) 출력
							k_10_total30ave);																								
					System.out.printf("평균%18d  %7d   %6d   %6d  %7.2f\n", k_10_sumkor / 20, k_10_sumeng / 20, k_10_summat / 20,	// ( ) 출력
							k_10_total30 / 20, k_10_total30ave / 20);
					k_10_out.pagefortotal();																						// ( ) 출력
					System.out.printf("합계%18d  %7d   %6d   %6d  %7.2f\n", k_10_kor31, k_10_eng31, k_10_mat31, k_10_total31,		// ( ) 출력
							k_10_total31ave);
					System.out.printf("평균%18d  %7d   %6d   %6d  %7.2f\n", k_10_kor31 / k_10_i, k_10_eng31 / k_10_i,				// ( ) 출력
							k_10_mat31 / k_10_i, k_10_total31 / k_10_i, k_10_total31ave / k_10_i);									// ( ) 출력

					k_10_sumkor = 0; // 값 초기화
					k_10_sumeng = 0; // 값 초기화
					k_10_summat = 0; // 값 초기화
				}

			}
		}

		
	}


