package soft6;

import java.text.DecimalFormat;

public class TotalPrint {
	public void TotalPrint() {
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // �� ������ ��Ÿ���� ���� Ŭ����
		String[] k_10itemname = { "123420���׽�Ʈ��a��11ĥ555", "ab��asdadad��īĨ", "ddd���ڼ�����ġss��ġ", "��a�ù�aġ��a��a��a��aa", "ġ���������",  // item�̸��� ���� �迭�̴�
				"abc12119", "�������������", "������Ŀ��()a", "��Ƽ���ƾ�", "��1��2��3��4������6��7��8", "�����ι�°����", "(���̹�����Ʈ����", "aaa����Ŭ����������",
				"55��īĨ��Ͼ��", "�����¶�����", "ȣ���̵θ���ġŲ", "����ġŲ�ſ��", "��������øŰ�", "�����������", "�����ġ�佺", "��Ȧ��������Ʈ", "�ڹ�Ĩ��Ʈ�¸�����",
				"��������������", "�ڹٿ��̵�", "���̾�Ʈ�ڹ�", "�̰Ž���������", "���������ڼ�Ʈ", "������ﰢ���", "�Ŷ��¥���", "��������ġ" }; 
																																					  // �̸�,����,���� �迭�� ���߿�
																									// ��
																									// ���Ұ��̱� ������ �� �迭��
																									// ũ��� ���ƾ��Ѵ�.
		
		int[] k_10price = { 1000, 1000000, 1000000, 1000000, 11000, 1600, 1700, 1800, 1900, 2000, // ������ ��ǰ�� ���� �Է�
							2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000,    // ������ ��ǰ�� ���� �Է�
							3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // ������ ��ǰ ���� �Է�
		int[] k_10units = { 10, 10, 10, 10, 10, 1, 8, 1, 1, 1, 1, 4, 1, 1, 2, 6, 1, 1, 6, 1, 6, 1, 5, 1, 1, 2, 1, 4, 1, 1 }; // ������
		// ��ǰ
		// ������
		// �Է�
		boolean[] k_10taxfree = { false, false, true, true, false, true, true, true, true, false, true, true, true,
				true, true, true, false, true, true, true, true, true, false, true, true, false, true, false, true,
				true }; // ������ǰ��
						// �������ǰ
						// ����
						// boolean
		int k_10With_tax_price = 0; // ������ǰ
		int k_10tax_free_price = 0; // �������ǰ
		int[] k_10total_price_sneak = new int[k_10itemname.length]; // �� ���ڱݾ��� �迭 ����� ����
		String[] k_10mark_check_free = { "*" }; // �������ǰ�� ���� ǥ�ø� ���� �迭
		String[] k_10make_space = { " " }; // ����� ��ǰ�� ĭ�� ���߱� ���� �迭

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i�� 0���� 29���� ����
			k_10total_price_sneak[k_10i] += k_10price[k_10i] * k_10units[k_10i]; // ��ǰ ���ݰ� ��ǰ ������ �����ش�.
			if (k_10taxfree[k_10i] == true) { // �ش� ��ǰ�� �������
				k_10tax_free_price += k_10total_price_sneak[k_10i]; // k_10With_tax_price �� �ش� ���ڿ� ���� �� ������ ��� �����ش�.
				k_10itemname[k_10i] = k_10mark_check_free[0] + k_10itemname[k_10i]; // ������� " " ������ ������ش�
			} else { // �鼼ǰ���̶��
				k_10With_tax_price += k_10total_price_sneak[k_10i]; // �鼼ǰ���� ��ǰ���� ���� �����ش�.
				k_10itemname[k_10i] = k_10make_space[0] + k_10itemname[k_10i]; // �鼼ǰ���ΰ� ǥ�� �� " * "�� �����ش�.
			} // �ݱ�
		} // �ݱ�
		
		double k_10taxrate = 0.1; // �������� 10%�� �����Ѵ�.
		// double k_10before_tax_price = k_10With_tax_price / (1 + k_10taxrate); // �Һ���
		// ���ݿ����� 1 + ������ �����شٸ� �����ݾ��� ���� �� �ִ�
		int k_10real_before_tax_price = (int) (k_10With_tax_price / (1 + k_10taxrate)); // �����ݾ��� �Ҽ��� �����ϰ� ��� ���߿� ��������
		// ������ �Ҽ��� �ݾ� ����
		int k_10total_real_surtax = k_10With_tax_price - k_10real_before_tax_price; // �Һ��� ���ݿ��� �����ݾ��� ���� �ݾ��� �ΰ����̴�
																					// //������ǰ�ݾ׿��� �����ѱݾ��� ���⼭ �߰����ش�.	
		int k_10total_pay = ((k_10tax_free_price + k_10real_before_tax_price + k_10total_real_surtax) / 10) * 10; // �츮�����
		
		
	System.out.printf("\n"); // ( ) ��� ������ 1ĭ ����ش�.
	System.out.printf("%22s%14s\n", "�� ǰ�� ����", k_10df.format(k_10itemname.length)); // ��ǰ�� ���� ���
	System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k_10df.format(k_10tax_free_price)); // �鼼�� �Ǵ� ��ǰ�� �Ѿ�
	System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k_10df.format(k_10real_before_tax_price)); // ������ǰ�� �Ѿ�
	System.out.printf("%24s%14s\n", "��   ��   ��", k_10df.format(k_10total_real_surtax)); // �ΰ����� �Ѿ�
	System.out.printf("%25s%14s\n", "��        ��", k_10df.format(k_10total_pay)); // �Ѿ�
	System.out.printf("%s%24s\n", "�� �� �� �� �� ��", k_10df.format(k_10total_pay)); // �� �����ؾ� �ϴ� �ݾ�
	System.out.printf("-----------------------------------------\n"); // ( ) ���
	System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658"); // ( ) ���
	System.out.printf("%s%16s%10s\n", "ī�����(IC)", "�Ͻú� / ", k_10df.format(k_10total_pay)); // ( ) ���
	System.out.printf("-----------------------------------------\n"); // ( ) ���
	System.out.printf("%25s\n", "[�ż�������Ʈ ����]"); // ( ) ���
	System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�."); // ( ) ���
	System.out.printf("%s%21s%6s\n", "��ȸ�߻�����Ʈ", "9350**9995", k_10df.format(164)); // ( ) ���
	System.out.printf("%s%17s(%6s)\n", "����(����)����Ʈ", k_10df.format(5637), k_10df.format(5473)); // ( ) ��� 0,000��������
																								// ����
																								// ����ϱ� ����
																								// df.format�� ����ߴ�.
	System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�."); // ( ) ���
	System.out.printf("-----------------------------------------\n"); // ( ) ���
	System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�"); // ( ) ���
	System.out.printf("%s%30s\n", "������ȣ :", "34��****"); // ( ) ���

	}
}
