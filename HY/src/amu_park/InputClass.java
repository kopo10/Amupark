package amu_park;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;

	public InputClass() {
		sc = new Scanner(System.in);
	}
	
	public String DayOrNight() {
		String DayOrNight;
		System.out.printf("������ �����ϼ���\n1. �ְ���\n2. �߰���\n"); // �ְ��� �߰��� ����
		DayOrNight = sc.next();
		return DayOrNight; // return������ String�� ���� ������ ���߿� csv���Ͽ� �ֱ� ���ؼ��̴�.
	}

	public String ResidentNumber() {
		String ResidentNumber;
		System.out.printf("�ֹι�ȣ�� �Է��ϼ���(-���� 7�ڸ�)\n"); // 7��° �ڸ��� 1.2.3.4�� ���̰�� �� �ʿ�
		ResidentNumber = sc.next(); // �ϱ� ������ �ʿ��ϴ�
		return ResidentNumber;
	}

	public String HowMany() { // ���� �Ǵ�
		String HowMany = "";
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		HowMany = sc.next();
		while (Integer.parseInt(HowMany) > 10) {
			System.out.println("���� �ʰ��Դϴ� �ٽ� �������ּ���"); // ������ �ʰ��ϸ� �ʰ� �޽��� ��� �� ���Է�
			HowMany = sc.next();
			if (Integer.parseInt(HowMany) < 11) { // 10�� ���Ϸ� �Է½� ����
				break;
			}
		}
		return HowMany;
	}

	public String Discount() { // ���� ������� �Ǵ�
		String Discount;
		System.out.println("�������� �����ϼ���\n1. ����(���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��"); // ���� ��� �Է�
		Discount = sc.next();
		return Discount;
	}

	public int Continue() { // �߱� ����
		int Continue;
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?\n1. Ƽ�� �߱�\n2. ����");
		Continue = sc.nextInt();
		return Continue;
	}

	public String DayNight(int a) { // csv���Ͽ� �Է� �� String
		if (a == 1) {
			return "�ְ���";
		} else {
			return "�߰���";
		}
	}

	public String group1(String b) { // csv���Ͽ� �Է� �� String
		if (Integer.parseInt(b) == 1) {
			return "����";
		} else if (Integer.parseInt(b) == 2) {
			return "û�ҳ�";
		} else if (Integer.parseInt(b) == 3) {
			return "����";
		} else {
			return "����";
		}
	}

	public String Discount2(int discount) { // csv���Ͽ� �Է� �� String
		if (discount == 1) {
			return "������";
		} else if (discount == 2) {
			return "�����";
		} else if (discount == 3) {
			return "������";
		} else if (discount == 4) {
			return "���ڳ�";
		} else {
			return "�ӻ��";
		}
	}

	public int LastAsk() { // �󼼳��� ��� �� ������ ����
		int a = 0;
		System.out.println("��� ����(1: ���ο� �ֹ�, 2: ���α׷� ����) :");
		a = sc.nextInt();
		while (a != 1 && a != 2) { // ���� �ֹ� �ϰų� ���̻� ������ �ʴ� ��ȣ�� �ƴ� ��ȣ�� ������ ��
			System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �������ּ���\n1: ���ο� �ֹ�, 2: ���α׷� ���� :");
			a = sc.nextInt();
		}
		return a; //���ڸ� return �޾Ƽ� ���ο��� Ȱ��
	}
}
