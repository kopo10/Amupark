package soft7;

import java.text.DecimalFormat;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###");
                 //���� 5 �̸� 32 ���� 15 ���� 2 �Ѱ��� 15
		String[] k_10itemname = { // item�̸��� ���� �迭�̴�
				"01   �׽�Ʈ���555                        3,000           1          3,000", 
				"02*  ��asdadad��īĨ                      1,000           2          2,000",
				"03   ddd���ڼ�����ġss��ġ                1,000           2          2,000", 
				"04   �ǽù��ܹ��Ŵ¸�����                 1,000          12         13,000",//Ʋ���� 
				"05*  ġ���������                       111,000           2        223,000",  
				"06   ���ִ���īĨ                         1,000           2          2,000", 
				"07   �������������                      11,000           2          2,000", 
				"08*  ������Ŀ�Ǿ��̽�                     7,000           2         12,000", //Ʋ���� 
				"09   ��Ƽ���ƾ�                           1,000           2          2,000", 
				"10   ���������־�                         1,000           2          2,000", 
				"11   �����ι�°����                         800           2          1,600", 
				"12   (���̹�����Ʈ����                    4,000           2          8,000", 
				"13   aaa����Ŭ����������                  1,000           2          2,000",
				"14   55��īĨ��Ͼ��                     1,000           2          2,000", 
				"15   �����¶�����                         1,000           6          6,000", 
				"16*  ȣ���̵θ���ġŲ                     1,000           2          2,000", 
				"17*  ����ġŲ�ſ��                       3,000           2          6,000", 
				"18   ��������øŰ�                     1,000           2          2,000", 
				"19   �����������                       1,000           2          2,000", 
				"20   �����ġ�佺                       1,000           2          2,000", 
				"21*  ��Ȧ��������Ʈ                       1,000           2          2,000", 
				"22   �ڹ�Ĩ��Ʈ�¸�����                   1,000           2          2,000",
				"23*  ��������������                       1,000           2          2,000", 
				"24   �ڹٿ��̵�                           1,000           2          2,000", 
				"25   ���̾�Ʈ�ڹ�                         1,000           2          2,000", 
				"26   �̰ǿ�������                         2,000          10         20,100", // Ʋ���� 
				"27   ���������ڼ�Ʈ                       1,000          11         11,000", 
				"28*  ������ﰢ���                       1,000           2          2,000", 
				"29   �Ŷ��¥���                         1,000           2          2,000", 
				"30   ��������ġ                           1,000           2          2,000" }; 
		
		for (int k_10_i = 0; k_10_i < k_10itemname.length; k_10_i++) {
			String k_10_ToString = k_10itemname[k_10_i].toString();
			byte [] k_10_bb = k_10_ToString.getBytes();
			
			
			
			
			String k_10_number = new String (k_10_bb,0,5);										// 1��°���� 5����Ʈ��ŭ ũ��� ����
			String k_10_name = new String (k_10_bb,5,33);										// 6��°���� 33����Ʈ��ŭ ũ��� ����
			String k_10_price1 = new String (k_10_bb,35,15);									// 36��°���� 15����Ʈ��ŭ ũ��� ����
			String k_10_units1 = new String (k_10_bb,55,10);									// 56��°���� 10����Ʈ��ŭ ũ��� ����
			String k_10_totalprice1 = new String (k_10_bb,60,14);								// 61��°���� 14����Ʈ��ŭ ũ��� ����
			
			int k_10_price = Integer.parseInt(k_10_price1.replace(",", "").trim());				// int�� �ٲٰ� , ���� �� ���鵵 ����
			int k_10_units = Integer.parseInt(k_10_units1.replace(",", "").trim());				// int�� �ٲٰ� , ���� �� ���鵵 ����
			
			//String price1 = k_10itemname[i].substring(33, 48);
			
			//String units1 = k_10itemname[i].substring(45, 58);

			int k_10_totalprice = Integer.parseInt(k_10_totalprice1.replace(",", "").trim());   // int�� �ٲٰ� , ���� �� ���鵵 ����
			
			if(k_10_price * k_10_units != k_10_totalprice) {
				System.out.println("******************************");																						// ( ) ���
				System.out.printf("����[%s%s%10s%10s%10s]\n", k_10_number, k_10_name, k_10_price1, k_10_units1, k_10df.format(k_10_totalprice));			// ( ) ���
				System.out.printf("����[%s%s%10s%10s%10s]\n", k_10_number, k_10_name, k_10_price1, k_10_units1, k_10df.format(k_10_price * k_10_units));	// ( ) ���
				System.out.println("******************************");																						// ( ) ���
			}
				
		}
	
		
	}

}
