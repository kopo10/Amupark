package soft6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PP14Output {

	public void title() {
		SimpleDateFormat k_10_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
        Calendar k_10_cal = Calendar.getInstance(); 													// 날짜 시간 출력
        
        
        
		System.out.println("              성적집계표\n");												 // ( ) 출력
		System.out.println("                     출력일자 : " + k_10_sdf.format(k_10_cal.getTime()));	 // ( ) 출력
		System.out.println("==========================================================");				 // ( ) 출력
		System.out.println("번호    이름   국어    영어   수학    총점    평균");						 // ( ) 출력
		System.out.println("==========================================================");				 // ( ) 출력

	}
	public void end() {
		System.out.println("==========================================================");				 // ( ) 출력
	}
	
	
}
