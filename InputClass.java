package amu_park;

import java.util.Scanner;

public class InputClass {
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
