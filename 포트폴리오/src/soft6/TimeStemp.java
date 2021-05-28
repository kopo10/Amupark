package soft6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeStemp {

	SimpleDateFormat k_10sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // 날짜 시간을 나타내기 위한 클래스
	SimpleDateFormat k_10sdf1 = new SimpleDateFormat("YYYYMMdd"); // line13과 다른 형태로 출력하기 위한 클래스
	Calendar k_10cal = Calendar.getInstance(); // 날짜 시간 출력

	public void TimeStemp1() {
		System.out.printf("%s%s%18s\n", "[구 매]", k_10sdf2.format(k_10cal.getTime()), "POS:0011-9861"); // ( ) 출력
	}

	public void TimeStemp2() {
		System.out.printf("%s%31s\n", "입차시간 :", k_10sdf.format(k_10cal.getTime())); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150"); // ( ) 출력
		System.out.printf("%15s%s", k_10sdf1.format(k_10cal.getTime()), "/00119861/00164980/31"); // ( ) 출력
	}
}
