package amu_park;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class OutPutClass {
	public ConstvaluseClass constval = null;
	
	
	public OutPutClass() {
		constval = new ConstvaluseClass();
	
	}

	Calendar time = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("YY");   //�⵵ 2�ڸ��� �ʿ��� ���� �ְ�
	SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY");//   4�ڸ��� �ʿ��� ���� �־ 2���� �������.
	String thisyearxx = sdf.format(time.getTime()); // ���� ���ڸ� �ʿ��� �� ���꽺Ʈ������ �߶� ������ �̷��� �غô�.
	String thisyearxxxx = sdf1.format(time.getTime()); // 4�ڸ��� �ʿ��� ��.
	public String DayNight(int a) { // �ֹ������� ����� �� �ʿ��� ���ڸ� return������ �޾Ҵ�.
		if (a == 1) {
			return "�ְ���";
		} else {
			return "�߰���";
		}
	}

	public String group1(String jumin) { //�ֹε�Ϲ�ȣ�� ���� �׷��� ������.
		String group = "";
		if (Integer.parseInt(jumin.substring(0, 2)) > Integer.parseInt(thisyearxx)) { // 2000��� ���� �����
			if (Integer.parseInt(thisyearxxxx) - 1900 - Integer.parseInt(jumin.substring(0, 2)) < constval.min_Elder1) { // ����⵵���� -1900 - �¾ �⵵�� 65���� ������ ����
				group = "����";
			} else {
				group = "���";
			}
		} else {
			if (Integer.parseInt(thisyearxx) - Integer.parseInt(jumin.substring(0, 2)) < constval.min_baby) { //����⵵���� -1900 - �¾ �⵵
				group = "����";
			} else if (Integer.parseInt(thisyearxx) - Integer.parseInt(jumin.substring(0, 2)) > constval.Min_Teen1
					&& Integer.parseInt(thisyearxx) - Integer.parseInt(jumin.substring(0, 2)) < constval.Max_Teen2) {
				group = "û�ҳ�"; //����⵵���� -1900 - �¾ �⵵
			} else {
				group = "����"; //����⵵���� -1900 - �¾ �⵵
			}
		}
		return group;

	}

	public String Discount2(int discount) { //ó�� �Է��� ���� ���׿� �ش��ϴ� ��ȣ ���� �����ߴٰ� ����� �� ���
		if (discount == 1) {
			return "������ ����";
		} else if (discount == 2) {
			return "����� ���";
		} else if (discount == 3) {
			return "������ ���";
		} else if (discount == 4) {
			return "���ڳ���";
		} else {
			return "�ӻ�� ���";
		}
	}

	public void thanks(int price) { // �ֹ��� ������ �� ����� ����
		System.out.println("������" + price + "�� �Դϴ�\n�����մϴ�.");
	}

	public void done(ArrayList<String> get_Print_ArrayList, int real_total_price) { //���Ϸ� �� �ǵ���� �ޱ� ������ �� �޼ҵ尡 �������� �޼ҵ�� �������־��µ�
		System.out.println("================��������===============");                //�ǵ���� �ް� �ϳ��� ��ĥ �� �ִٴ°� �˰� �Ǽ� ���ƽ��ϴ�.
		for (int i = 0; i < get_Print_ArrayList.size(); i++) {						//���ڿ� ��̸���Ʈ�� �� �� �ִ°��� ó�� �˰� �Ǿ����ϴ�. 
			System.out.print(get_Print_ArrayList.get(i));
		}
		System.out.println("\n����� �Ѿ��� " + real_total_price + "�� �Դϴ�."); // ����
		System.out.println("Ƽ�� �߱��� �����մϴ�.\n�����մϴ�.\n");
		System.out.println("=====================================");
	}
}
