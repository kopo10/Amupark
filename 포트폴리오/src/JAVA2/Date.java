package JAVA2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar k_10cal = Calendar.getInstance(); //Calendar�� �ҷ��´�.
		SimpleDateFormat k_10sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //SimpleDateFormat�� �ҷ��ͼ� "YYYY/MM/dd HH:mm:ss" ���¸� �������ش�.
		System.out.printf("��������ð�: %s\n" , k_10sdt.format(k_10cal.getTime()));  //k_10sdt�� �Է��� YYYY/MM/dd HH:mm:ss��																			
		                                                                          // ���·� ���� �ð��� ������ش�.				
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�"); //���� ���
	}
}
