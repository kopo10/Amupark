package soft6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PP14Output {

	public void title() {
		SimpleDateFormat k_10_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
        Calendar k_10_cal = Calendar.getInstance(); 													// ��¥ �ð� ���
        
        
        
		System.out.println("              ��������ǥ\n");												 // ( ) ���
		System.out.println("                     ������� : " + k_10_sdf.format(k_10_cal.getTime()));	 // ( ) ���
		System.out.println("==========================================================");				 // ( ) ���
		System.out.println("��ȣ    �̸�   ����    ����   ����    ����    ���");						 // ( ) ���
		System.out.println("==========================================================");				 // ( ) ���

	}
	public void end() {
		System.out.println("==========================================================");				 // ( ) ���
	}
	
	
}
