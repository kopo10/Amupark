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
		Calendar k_10_cal = Calendar.getInstance(); // ��¥ �ð� ���
		
		System.out.println("              ��������ǥ\n");
		System.out.printf("PAGE: %d                     ������� : %s\n", k_10_count, k_10_sdf.format(k_10_cal.getTime())); // �ð� ��� 
		System.out.println("=========================================================="); // ( ) ���
		System.out.println("��ȣ     �̸�     ����     ����     ����     ����     ���"); // ( ) ���
		System.out.println("=========================================================="); // ( ) ���
		k_10_count++; //page ���� �ø���
	}

	public void title2() {
		System.out.println("\n\n"); // ( )���
	}
	
	public void pagefornow() {
		System.out.println("=========================================================="); // ( )���
		System.out.println("����������                                                "); // ( )���
	} 

	public void pagefortotal() {
		System.out.println("=========================================================="); // ( )���
		System.out.println("����������                                                "); // ( )���
	}
	
}
