package soft6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PP15Output {
	int k_10_count;

	public PP15Output() {
		k_10_count = 1;
	}

	public void title1() {
		SimpleDateFormat k_10_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		Calendar k_10_cal = Calendar.getInstance(); // 날짜 시간 출력
		
		System.out.println("              성적집계표\n");
		System.out.printf("PAGE: %d                     출력일자 : %s\n", k_10_count, k_10_sdf.format(k_10_cal.getTime())); // 시간 출력 
		System.out.println("=========================================================="); // ( ) 출력
		System.out.println("번호     이름     국어     영어     수학     총점     평균"); // ( ) 출력
		System.out.println("=========================================================="); // ( ) 출력
		k_10_count++; //page 숫자 늘리기
	}

	public void title2() {
		System.out.println("\n\n"); // ( )출력
	}
	
	public void pagefornow() {
		System.out.println("=========================================================="); // ( )출력
		System.out.println("현재페이지                                                "); // ( )출력
	} 

	public void pagefortotal() {
		System.out.println("=========================================================="); // ( )출력
		System.out.println("누적페이지                                                "); // ( )출력
	}
	
}
