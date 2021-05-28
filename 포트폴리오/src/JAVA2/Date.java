package JAVA2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar k_10cal = Calendar.getInstance(); //Calendar을 불러온다.
		SimpleDateFormat k_10sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //SimpleDateFormat룰 불러와서 "YYYY/MM/dd HH:mm:ss" 형태를 설정해준다.
		System.out.printf("최종실행시간: %s\n" , k_10sdt.format(k_10cal.getTime()));  //k_10sdt에 입력한 YYYY/MM/dd HH:mm:ss의																			
		                                                                          // 형태로 현재 시간을 출력해준다.				
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★"); //별을 출력
	}
}
