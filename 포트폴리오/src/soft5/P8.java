package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // �������� ǥ���ϱ� ���� Ŭ����
		Calendar k_10cal = Calendar.getInstance(); // ��¥ �ð��� ǥ���ϱ� ���� Ŭ����
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥ �ð��� ���¸� �����ϱ� ���� Ŭ����
		Calendar k_10cal2 = Calendar.getInstance();
		//impleDateFormat k17_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ���� ��¥, �ð��� ���ϴ� ������� �����ϴ� ���Դϴ�.
		// Calendar k17_cal = Calendar.getInstance(); // ���� ��¥, �ð��� ���ϱ� ���� ���Դϴ�.

	      SimpleDateFormat k10_sdt2 = new SimpleDateFormat("MM��dd��"); // ���ο� �������� ��¥�� �������ݴϴ�.
	      Date k10_date = new Date(); // �����ڸ� ����� ���� ���� ��¥�� ������ �ɴϴ�.
	      k_10cal.setTime(k10_date); // �����ڿ� �ð��� �־��ݴϴ�.
	      k_10cal.add(Calendar.DATE, 14); // �׸��� ���糯¥���� 14���� ���� ���� �������ݴϴ�.
	      String k10_in14days = k10_sdt2.format(k_10cal.getTime());
	      
		int k_10totalprice1 =  0;  //k_10totalprice1�� int 0���� ����
		int k_10bftax = 0;   	   //k_10bftax�� int 0���� ����
		double k_10taxrate = 0.1; //k_10taxrate�� int 0���� ����
		int k_10tax = 0;          //k_10tax�� int 0���� ����
	
		String[] k_10item = { "ǻ��� ������a�븶��ũ(�ְ����)", "�����̵�ĸ���(��aa����)(100ȣ)", "�������� ���׸���aa��ũ(�˷�̴�Ÿ��)" }; //������ �̸��� ��̷� ����
		int[] k_10price = { 1000000, 1100, 1000000 }; // ������ ��̷� ����
		int[] k_10units = { 10, 10, 10 }; // ������ ��̷� ����
		String[] k_10code = { "[1031615]", "[11008152]", "[1020800]" }; // �����ȣ�� ��̷� ����
		int[] k_10totalprice = new int[k_10item.length]; //�� �ݾ��� ������ũ�⸸ŭ���� ũ�� ����

		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) { // 0���� ������ũ�⸸ŭ �ݺ�
			k_10totalprice[k_10i] = k_10price[k_10i] * k_10units[k_10i]; // 34line���� �������� ��̿� �ݾ� * ���� ����� �߰�
		}

//		String k_10itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)"; // ������ �̸� ����
//		String k_10itemcode1 = "1031615"; // ������ �ڵ� ����
//		int k_10price1 = 3000000; // ������ 3000���� ����
//		int k_10amount1 = 21; // ������ 1�� ����
//		int k_10total_price1 = k_10price1 * k_10amount1; // 1�� ������ �� ������ ǥ��
//
//		String k_10itemname2 = "�����̵�ĸ���(������)(100ȣ)"; // 2�� ������ ������ �̸� ����
//		String k_10itemcode2 = "11008152"; // ������ �ڵ� ����
//		int k_10price2 = 1000; // ������ 1000���� ����
//		int k_10amount2 = 1222; // ������ 1�� ����
//		int k_10total_price2 = k_10price2 * k_10amount2; // 2�� ������ �� ������ ǥ��
//
//		String k_10itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // 3�� ������ �̸� ����
//		String k_10itemcode3 = "1020800"; // ������ �ڵ� ����
//		int k_10price3 = 1000; // ������ ���� ����
//		int k_10amount3 = 1; // ������ ���� ����
//		int k_10total_price3 = k_10price3 * k_10amount3; // ������ 3�� �� ������ ����
//
//		double k_10taxRate = 1.1; // ������ 0.1 + 1 �� ����;
//		double k_10_tax1 = k_10price1 - (k_10price1 / k_10taxRate); // ���ݿ��� �����ݾ��� ���ָ� �ý��� ���� �� �ִ�.
//		int k_10real_tax1; // �Ҽ����� �� ������ ���ϱ� ���� ���������.
//		if (k_10_tax1 == (int) (k_10_tax1)) { // ���� �Ҽ����� ���ٸ�
//			k_10real_tax1 = (int) k_10_tax1; // �״�� int�� ��ȯ�� ���ش�.
//		} else { // ���� �Ҽ����� �־ ���� �ʴٸ�
//			k_10real_tax1 = (int) k_10_tax1 + 1; // ��Ʈ�� ��ȯ�ؼ� �Ҽ����� ���� �� + 1 �� ���ش�.
//		} // �ݱ�
//		int k_10bf_tax_price1 = k_10price1 - k_10real_tax1; // �����ݾ�
//		int k_10total_af_price1 = k_10bf_tax_price1 * k_10amount1; // �����ݾ� * ���� // �Ѱ����ݾ�
//
//		double k_10_tax2 = k_10price2 - (k_10price2 / k_10taxRate); // ���ݿ��� �����ݾ��� ���ָ� ������ ���� �� �ִ�.
//		int k_10real_tax2; // �ý��� �����ֱ� ���� ����
//		if (k_10_tax2 == (int) (k_10_tax2)) { // ���� �Ҽ����� ���ٸ�
//			k_10real_tax2 = (int) k_10_tax2; // �״�� int�θ� ��ȯ
//		} else { // �Ҽ����� �ִٸ�
//			k_10real_tax2 = (int) k_10_tax2 + 1; // int�� ��ȯ �� �Ҽ��� ���� �� + 1
//		} // �ݱ�
//		int k_10bf_tax_price2 = k_10price2 - k_10real_tax2; // �Һ��� ���ݿ��� �ý��� ������ �����ݾ�
//		int k_10total_af_price2 = k_10bf_tax_price2 * k_10amount2; // �����ݾ� * ���� = �� �����ݾ�
//
//		double k_10_tax3 = k_10price3 - (k_10price3 / k_10taxRate); // �Һ��ڰ��ݿ��� �����ݾ��� ���� �ݾ� = ����
//
//		int k_10real_tax3; // �Ҽ����� ���� ���ݸ� ���ϱ� ���� ����
//		if (k_10_tax3 == (int) (k_10_tax3)) { // ���ݿ� �Ҽ����� ���ٸ�
//			k_10real_tax3 = (int) k_10_tax3; // int�� ��ȯ
//		} else { // �װ� �ƴ϶��
//			k_10real_tax3 = (int) k_10_tax3 + 1; // ��Ʈ�� ��ȯ �� + 1
//		} // �ݱ�
//		int k_10bf_tax_price3 = k_10price3 - k_10real_tax3; // �Һ��� ���ݿ��� ������ �� ���� �ݾ�
//		int k_10total_af_price3 = k_10bf_tax_price3 * k_10amount3; // �����ݾ׿��� ������ ���� �� �����ݾ�

		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) { // 0���� ������ũ�⸸ŭ �ݺ�
			int lengthdiff = k_10item[k_10i].length() - 9; // ���� ����

			if (lengthdiff > 0 && k_10item[k_10i].getBytes().length > 18) { // 18����Ʈ�� ����� ���ϱ� ������ lengthdiff���̰� 0���� ũ�� ����Ʈ�� 18���� ���� ��

				for (int k_10k = 0; k_10k <= lengthdiff; k_10k++) { //k�� lengthdiff��ŭ �ݺ�

					if (k_10item[k_10i].substring(0, 9 + k_10k).getBytes().length == 17) { //lengthdiff��ŭ �ݺ� �ϸ� subString �� 1��ŭ �����ϴµ� �� ũ�Ⱑ 17�� �ȴٸ�
						if (k_10item[k_10i].substring(9 + k_10k, 9 + k_10k + 1).getBytes().length == 2) { // �׷��ٸ� �� ���� ������ ũ�Ⱑ 2(�ѱ�)�̶��
							k_10item[k_10i] = k_10item[k_10i].substring(0, 9 + k_10k) + " "; //�״�� ����ϰ� " "�߰�
							break;

						} else {
							k_10item[k_10i] = k_10item[k_10i].substring(0, 9 + k_10k + 1); // 1(����)��� �״�� ���
							break;

						}
					} else if (k_10item[k_10i].substring(0, 9 + k_10k).getBytes().length == 18) { // lengthdiff��ŭ �÷��ִٰ� ����Ʈ ũ�Ⱑ 18���� �ȴٸ�
						k_10item[k_10i] = k_10item[k_10i].substring(0, 9 + k_10k); //�״�� ���
						break;
					}
				}
			} else { //(lengthdiff > 0 && k_10item[k_10i].getBytes().length > 18 �������� �ƴ϶��

				int k_10num = 18 - k_10item[k_10i].getBytes().length; //�״�� ������ش�.

				for (int k_10j = 0; k_10j < k_10num; k_10j++) { //�׸��� ���� ����Ʈ ��ŭ
					k_10item[k_10i] += " "; //������ �ش�.
				}
			}

		}
		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) { //���������θ� �ݺ��ϰ� �ͱ� ������ ������ũ�⸸ŭ �ݺ�
			k_10totalprice1 += k_10totalprice[k_10i]; //���� �����ش�.
		}
		k_10bftax = (int) (k_10totalprice1 / (k_10taxrate + 1)); //�����ݾ�
		k_10tax = k_10totalprice1 - k_10bftax;  //�ΰ���
		
		System.out.printf("%24s\n", "\"���ΰ���, ���̼�\""); // ( ) ���
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����"); // ( ) ���
		System.out.printf("%s\n", "��ȭ:031-702-6016"); // ( ) ���
		System.out.printf("%s\n", "����:���� ������ ���μ�ȯ�� 2748 (���)"); // ( ) ���
		System.out.printf("%s\n", "��ǥ:������,��ȣ�� 213-81-52063"); // ( ) ���
		System.out.printf("%s\n", "����:��⵵ ������ �д籸 �д��53���� 11 (������)"); // ( ) ���
		System.out.println("========================================="); // ( ) ���
		System.out.printf("%25s\n", "�Һ��� �߽ɰ濵(CCM) ������� "); // ( ) ���
		System.out.printf("%26s\n", "ISO 9001 ǰ���濵�ý��� �������"); // ( ) ���
		System.out.println("========================================="); // ( ) ���
		System.out.printf("%17s%s%s\n", "��ȯ/ȯ�� 14��(", k10_in14days,")�̳�,"); // ( ) ���
		System.out.printf("%s\n", "(����)������, ����ī�� ���� �� ���Ը��忡�� ����"); // ( ) ���
		System.out.printf("%24s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�"); // ( ) ���
		System.out.printf("%23s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�"); // ( ) ���
		System.out.println("========================================="); // ( ) ���
		System.out.printf("%s%28s\n", "[POS 1058231]", k_10sdf.format(k_10cal2.getTime())); // ( ) ���
		System.out.println("========================================="); // ( ) ���

		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) {

			System.out.printf("%s%9s %2s %10s\n", k_10item[k_10i], k_10df.format(k_10price[k_10i]),
					k_10df.format(k_10units[k_10i]), k_10df.format(k_10totalprice[k_10i])); // ( ) ���
			System.out.printf("%s\n", k_10code[k_10i]);
		}

		System.out.printf("%18s%19s\n", "�����հ�",
						  k_10df.format(k_10bftax)); // ( ) ���
		System.out.printf("%19s%19s\n", "�ΰ���", k_10df.format(k_10tax)); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%33s\n", "�Ǹ��հ�", k_10df.format(k_10totalprice1)); // ( ) // ���
		System.out.println("========================================="); // ( ) ���
		System.out.printf("%s%33s\n", "�ſ�ī��", k_10df.format(k_10totalprice1)); // ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%33s\n", "�츮ī��", "538720**********"); // ( ) ���
		System.out.printf("%s%6s %10s\n", "���ι�ȣ 77982843(0)", "���αݾ�",
				k_10df.format(k_10totalprice1)); // ( ) ���
		System.out.println("========================================="); // ( ) ���
		System.out.printf("%26s%s\n", k_10sdf.format(k_10cal2.getTime()), " �д缭����"); // ( ) ���
		System.out.printf("%s\n", "��ǰ �� ��Ÿ ���� : 1522-4400"); // ( ) ���
		System.out.printf("%s\n", "����� �� �����̼� ���� ���� : 1599-2211"); // ( ) ���
		System.out.printf("%28s\n", "2112820610158231"); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s\n", "�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż� ȸ������ �� �پ��� ������ ����������! ��"); // ( ) ���
	} 
}
