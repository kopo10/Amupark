package C;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // �� ������ ��Ÿ���� ���� Ŭ����
		Calendar k_10cal = Calendar.getInstance(); // ��¥ �ð� ���
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ��¥ �ð��� ��Ÿ���� ���� Ŭ����
		SimpleDateFormat k_10sdf1 = new SimpleDateFormat("YYYYMMdd"); // line13�� �ٸ� ���·� ����ϱ� ���� Ŭ����
		SimpleDateFormat k_10sdf2 = new SimpleDateFormat("YYYY/MM/dd HH:mm");

		String[] k_10itemname = { "123420���׽�Ʈ��a��11ĥ555", "ab��asdadad��īĨ", "ddd���ڼ�����ġss��ġ", "��a�ù�aġ��a��a��a��aa", "ġ���������",
				"abc12119", "�������������", "������Ŀ��()a", "��Ƽ���ƾ�", "��1��2��3��4������6��7��8", "�����ι�°����", "(���̹�����Ʈ����", "aaa����Ŭ����������",
				"55��īĨ��Ͼ��", "�����¶�����", "ȣ���̵θ���ġŲ", "����ġŲ�ſ��", "��������øŰ�", "�����������", "�����ġ�佺", "��Ȧ��������Ʈ", "�ڹ�Ĩ��Ʈ�¸�����",
				"��������������", "�ڹٿ��̵�", "���̾�Ʈ�ڹ�", "�̰Ž���������", "���������ڼ�Ʈ", "������ﰢ���", "�Ŷ��¥���", "��������ġ" }; // item�̸��� ���� �迭�̴�
																									// �̸�,����,���� �迭�� ���߿�
																									// ��
																									// ���Ұ��̱� ������ �� �迭��
																									// ũ��� ���ƾ��Ѵ�.
		int[] k_10price = { 1000, 1000000, 1000000, 1000000, 11000, 1600, 1700, 1800, 1900, 2000, 2100, 2200, 2300, 2400,
				2500, 2600, // ������ ��ǰ�� ���� �Է�
				2700, 2800, 2900, 3000, 3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // ������ ��ǰ ���� �Է�
		int[] k_10units = { 10, 10, 10, 10, 10, 1, 8, 1, 1, 1, 1, 4, 1, 1, 2, 6, 1, 1, 6, 1, 6, 1, 5, 1, 1, 2, 1, 4,
				1, 1 }; // ������
		// ��ǰ
		// ������
		// �Է�
		boolean[] k_10taxfree = { false, false, true, true, false, true, true, true, true, false, true, true, true, true,
				true, true, false, true, true, true, true, true, false, true, true, false, true, false, true, true }; // ������ǰ��
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
		System.out.printf("%s%27s\n", "emart", "�̸�Ʈ ������ (031)888-1234"); // ( ) ���
		System.out.printf("%27s\n", "206-86-50913 ����"); // ( ) ���
		System.out.printf("%26s\n", "���� ������ ������� 552"); // ( ) ���
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�"); // ( ) ���
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)"); // ( ) ���
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)"); // ( ) ���
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)"); // ( ) ���
		System.out.println(""); // ( ) ���
		System.out.printf("%s%s%18s\n", "[�� ��]", k_10sdf2.format(k_10cal.getTime()), "POS:0011-9861"); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%7s%14s%5s%6s\n", "��ǰ��", "�� ��", "�� ��", "�� ��"); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) {
			int lengthdiff = k_10itemname[k_10i].length() - 9; // ���� ����
			// System.out.println("lendiff : " +k_10i +" ++ "+lengthdiff);

			if (lengthdiff > 0 && k_10itemname[k_10i].getBytes().length > 18) {
				//System.out.println(k_10i +  k_10itemname[k_10i]);
				for (int k_10k = 0; k_10k <= lengthdiff; k_10k++) {
					//System.out.println("k : " + k_10i);

					if (k_10itemname[k_10i].substring(0, 9 + k_10k).getBytes().length == 17) {
						if (k_10itemname[k_10i].substring(9 + k_10k, 9 + k_10k + 1).getBytes().length == 2) {
							k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k) + " ";
							//System.out.println("## " + k_10itemname[k_10i]);
							break;

						} else {
							k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k + 1);
							//System.out.println("@@ " + k_10itemname[k_10i]);
							break;

						}
					} else if (k_10itemname[k_10i].substring(0, 9 + k_10k).getBytes().length == 18) {
						k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k);
						//System.out.println("** " + k_10itemname[k_10i]);
						break;
					}

				}

			} else {

				int k_10num = 18 - k_10itemname[k_10i].getBytes().length;

				for (int k_10j = 0; k_10j < k_10num; k_10j++) {
					k_10itemname[k_10i] += " ";
				}
			}

		}

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i�� 0 ���� 29���� ��� (��ǰ�� 30�� �����ϱ�)
			if (k_10i % 5 == 0 && k_10i != 0) { // 6��°���� ������� ----�� ��������ν� ���� 5������ �ٷ� �����ش�.
				System.out.printf("-----------------------------------------\n"); // ( ) ���
			}
			System.out.printf("%s%9s %2s %10s\n", k_10itemname[k_10i], k_10df.format(k_10price[k_10i]),
					k_10df.format(k_10units[k_10i]), k_10df.format(k_10total_price_sneak[k_10i])); // ���� �ݾ� ���� �� ���� ���
		}
		int k_10total_pay = ((k_10tax_free_price + k_10real_before_tax_price + k_10total_real_surtax) / 10) * 10; // �츮�����
																													// ����
																													// 1����
																													// ������
																													// �����Ƿ�
																													// 1��������
		System.out.printf("\n"); // ( ) ��� // �������ش�.
		System.out.printf("%15s%21s\n", "�ѹ�ǰ����", k_10df.format(k_10itemname.length)); // ��ǰ�� ���� ���
		System.out.printf("%16s%21s\n", "(*)�鼼  ��ǰ", k_10df.format(k_10tax_free_price)); // �鼼�� �Ǵ� ��ǰ�� �Ѿ�
		System.out.printf("%16s%21s\n", "����  ��ǰ", k_10df.format(k_10real_before_tax_price)); // ������ǰ�� �Ѿ�
		System.out.printf("%17s%21s\n", "��  ��  ��", k_10df.format(k_10total_real_surtax)); // �ΰ����� �Ѿ�
		System.out.printf("%18s%21s\n", "��      ��", k_10df.format(k_10total_pay)); // �Ѿ�
		System.out.printf("%s%29s\n", "�������ݾ�", k_10df.format(k_10total_pay)); // �� �����ؾ� �ϴ� �ݾ�
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658"); // ( ) ���
		System.out.printf("%s%20s%10s\n", "ī�����", "�Ͻú� / ", k_10df.format(k_10total_pay)); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%25s\n", "[�ż�������Ʈ ����]"); // ( ) ���
		System.out.printf("%s\n", "��*�� ������ ����Ʈ ��Ȳ�Դϴ�."); // ( ) ���
		System.out.printf("%s%20s%7s\n", "��ȸ�߻�����Ʈ", "9350**9995", k_10df.format(164)); // ( ) ���
		System.out.printf("%s%17s(%6s)\n", "����(����)����Ʈ", k_10df.format(5637), k_10df.format(5473)); // ( ) ��� 0,000�������� ����
																									// ����ϱ� ����
																									// df.format�� ����ߴ�.
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�."); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� ����ο�"); // ( ) ���
		System.out.printf("%s%30s\n", "������ȣ :", "34��****"); // ( ) ���
		System.out.printf("%s%31s\n", "�����ð� :", k_10sdf.format(k_10cal.getTime())); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150"); // ( ) ���
		System.out.printf("%15s%s", k_10sdf1.format(k_10cal.getTime()), "/00119861/00164980/31"); // ( ) ���
	}
}

//for (int k_10i = 0; k_10i < k_10price.length; k_10i++) {
//	stringprice[k_10i] = String.valueOf(k_10price[k_10i]);
//
//	int num = 8 - stringprice[k_10i].getBytes().length;
//	for (int k_10j = 0; k_10j < num; k_10j++) {
//		stringprice[k_10i] += " ";
//		
//	}
//
//	price[k_10i] = Integer.parseInt(stringprice[k_10i].substring(0, stringprice[k_10i].length() - num));
//}
//
//for (int k_10i = 0; k_10i < k_10units.length; k_10i++) {
//	stringunits[k_10i] = String.valueOf(k_10units[k_10i]);
//	int num = 2 - stringunits[k_10i].getBytes().length;
//	for (int k_10j = 0; k_10j < num; k_10j++) {
//		stringunits[k_10i] = " " + stringunits[k_10i];
//		
//	}
//
//	units[k_10i] = Integer.parseInt(stringunits[k_10i].substring(num));
//}
//
//for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) {
//	stringtotalprice[k_10i] = String.valueOf(k_10total_price_sneak[k_10i]);
//	int num = 8 - String.valueOf(k_10total_price_sneak[k_10i]).getBytes().length;
//
//	for (int k_10j = 0; k_10j < num; k_10j++) {
//		stringtotalprice[k_10i] = " " + stringtotalprice[k_10i];
//
//	}
//	totalpirce[k_10i] = Integer.parseInt(stringtotalprice[k_10i].substring(num));
//
//}
