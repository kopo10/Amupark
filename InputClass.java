package amu_park;

import java.util.Scanner;

public class InputClass {
<<<<<<< HEAD
	Scanner sc = null;

	public InputClass() {
		sc = new Scanner(System.in);

	}

	public String DayOrNight() {
		String DayOrNight;
		System.out.printf("������ �����ϼ���\n1. �ְ���\n2. �߰���\n");
		DayOrNight = sc.next();
		return DayOrNight;
	}

	public String ResidentNumber() {
		String ResidentNumber;
		System.out.printf("�ֹι�ȣ�� �Է��ϼ���\n");
		ResidentNumber = sc.next();
		return ResidentNumber;

	}

	public String HowMany() {
		String HowMany = "";

		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");

		HowMany = sc.next();
		while (Integer.parseInt(HowMany) > 10) {
			System.out.println("���� �ʰ��Դϴ� �ٽ� �������ּ���");
			HowMany = sc.next();
			if (Integer.parseInt(HowMany) < 11) {
				break;
			}
		}
		return HowMany;
	}

	public String Discount() {
		String Discount;
		System.out.println("�������� �����ϼ���\n1. ����(���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��");
		Discount = sc.next();
		return Discount;
	}

	public int price(int total_price) {
		System.out.println("������ : " + total_price + "�Դϴ�\n�����մϴ�");
		return 0;
	}

	public int Continue() {
		int Continue;
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?\n1. Ƽ�� �߱�\n2. ����");
		Continue = sc.nextInt();
		return Continue;
	}

	public String DayNight(int a) {
		if (a == 1) {
			return "�ְ���";
		} else {
			return "�߰���";
		}
	}

	public String group1(String b) {
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

	public String Discount2(int discount) {
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

	public int LastAsk() {
		int a = 0;
		System.out.println("��� ����(1: ���ο� �ֹ�, 2: ���α׷� ����) :");
		a = sc.nextInt();
		return a;
	}

}
=======
	Scanner sc= null;
	public InputClass(){
		sc = new Scanner(System.in);
	}
	
	public int DayOrNight () {
		int DayOrNight;
		System.out.println("������ �����ϼ���\n1. �ְ���\n2. �߰���");
		DayOrNight= sc.nextInt();	
		return DayOrNight;		
	}
	
	public int HowMany () {
		int HowMany;
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		HowMany = sc.nextInt();	
		sc.nextLine();
		return HowMany;		
	}
	
	public String ResidentNumber () {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		String ResidentNumber;
		ResidentNumber = sc.nextLine();
		return ResidentNumber;		
	}
	
	public int Discount () {
		int Discount;
		System.out.println("�������� �����ϼ���\n1. ����(���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��");
		Discount = sc.nextInt();
		return Discount;		
	}
	
	public int Continue () {
		int Continue;
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?\n1. Ƽ�� �߱�\n2. ����");
		Continue = sc.nextInt();
		return Continue;		
	}
	
	
	
	
	
//������ ��, �����մϴ�.	
//	
	
	// ���� Ŭ����  "   "
}
>>>>>>> b8c9ae5df888c40be8a41cb70b4cae2eca579f7c
