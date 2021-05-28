package soft7;

import java.util.ArrayList;

public class PP10Array {

	static ArrayList<PP10OneRec> k_10_ArrayPP10OneRec =  new ArrayList <PP10OneRec>();												// PP10OneRec 클래스를 어레이로
	
	static int k_10_sumkor = 0;																									// 국어합계를 위한 변수
	static int k_10_sumeng = 0;																									// 영어합계를 위한 변수
	static int k_10_summat = 0;																									// 수학합계를 위한 변수
	static int k_10_sumsum = 0;																									// 합계를 위한 변수
	static int k_10_sumave = 0;																									// 합계평균를 위한 변수
	static final int k_10_iPerson = 30;
	
	//데이터만들기
	
	public static void dataSet() {
		ArrayList<String> k_10_iAL = new ArrayList<String>();
		for (int k_10_i = 0; k_10_i <= k_10_iPerson; k_10_i++) { 																	// 사람수만큼 반복
			int k_10_student_id = k_10_i;
			String k_10_name = String.format("홍길%02d", k_10_i); 																	// 사람 수가 카운트 된다.
			int k_10_kor = (int) (Math.random() * 100); 																			// 랜덤으로 숫자가 나옴
			int k_10_eng = (int) (Math.random() * 100); 																			// 랜덤으로 숫자가 나옴
			int k_10_mat = (int) (Math.random() * 100); 																			// 랜덤으로 숫자가 나옴
			k_10_ArrayPP10OneRec.add(new PP10OneRec (k_10_student_id, k_10_name, k_10_kor, k_10_eng, k_10_mat));					// k_10_ArrayPP10OneRec에 넣어준다
		}		
	}
	
	//헤더 인쇄
	public static void HeaderPrint() {
	
	
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★"); 															// ( ) 출력
	System.out.printf(" %2s %4s %3s %3s %3s %3s    %2s", "번호", "이름", "국어", "영어", "수학", "합계", "평균\n");					// ( ) 출력
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★"); 															// ( ) 출력
	}
	
	//내용인쇄
	public static void ItemPrint(int i) {
		PP10OneRec k_10_rec;
		
		k_10_rec = k_10_ArrayPP10OneRec.get(i);
		System.out.printf("%4d %6s %3d %5d %5d   %3d   %6.2f\n"																		// ( ) 출력
							, k_10_rec.student_id(), k_10_rec.name(), k_10_rec.kor(), k_10_rec.eng(), k_10_rec.mat(), k_10_rec.sum(), k_10_rec.ave());
		
		k_10_sumkor += k_10_rec.kor();		//국어 합계															
		k_10_sumeng += k_10_rec.eng();		//영어 합계	
		k_10_summat += k_10_rec.mat();		//수학 합계	
		k_10_sumsum += k_10_rec.sum();		//합계 합계	
		k_10_sumave += k_10_rec.ave();		//합계평균 합계	

	}
	
	//꼬리 인쇄
	public static void TailPrint() {
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★\n");														 // ( ) 출력
		System.out.printf("국어합계 %d   국어평균: %6.2f\n", k_10_sumkor, k_10_sumkor / (double)k_10_ArrayPP10OneRec.size());	 	 // ( ) 출력
		System.out.printf("영어합계 %d   영어평균: %6.2f\n", k_10_sumeng, k_10_sumeng / (double)k_10_ArrayPP10OneRec.size());		 // ( ) 출력
		System.out.printf("수학합계 %d   수학평균: %6.2f\n", k_10_summat, k_10_summat / (double)k_10_ArrayPP10OneRec.size()); 		 // ( ) 출력
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★\n"); 														 // ( ) 출력
		System.out.printf("반평균합계 %d   반평균: %6.2f\n", k_10_sumave, k_10_sumave / (double)k_10_ArrayPP10OneRec.size());	     // ( ) 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PP10Array k_10_array = new PP10Array();
		
		dataSet();
		HeaderPrint();
		for(int k_10_i = 0; k_10_i < k_10_ArrayPP10OneRec.size(); k_10_i++) { // k_10_ArrayPP10OneRec 크기만큼 반복
			ItemPrint(k_10_i);												   // 출력
		}
		TailPrint();
	}
	
	
	
	
	
	
	
	
}
