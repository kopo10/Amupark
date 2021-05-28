package Soft4kang;

import java.text.DecimalFormat;

public class BlankMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item = "���";
		int unit_price = 5000;
		int num = 500;
		int total = 0;
		
		DecimalFormat df = new DecimalFormat( "###,###,###,###,###");
		
		System.out.printf("========================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		System.out.printf("========================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
		   item, df.format(unit_price), df.format(num), df.format(unit_price * num));
		System.out.printf("=====================================\n");
	}

}
