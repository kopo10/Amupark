package soft6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeStemp {

	SimpleDateFormat k_10sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // ��¥ �ð��� ��Ÿ���� ���� Ŭ����
	SimpleDateFormat k_10sdf1 = new SimpleDateFormat("YYYYMMdd"); // line13�� �ٸ� ���·� ����ϱ� ���� Ŭ����
	Calendar k_10cal = Calendar.getInstance(); // ��¥ �ð� ���

	public void TimeStemp1() {
		System.out.printf("%s%s%18s\n", "[�� ��]", k_10sdf2.format(k_10cal.getTime()), "POS:0011-9861"); // ( ) ���
	}

	public void TimeStemp2() {
		System.out.printf("%s%31s\n", "�����ð� :", k_10sdf.format(k_10cal.getTime())); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150"); // ( ) ���
		System.out.printf("%15s%s", k_10sdf1.format(k_10cal.getTime()), "/00119861/00164980/31"); // ( ) ���
	}
}
