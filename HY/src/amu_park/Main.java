package amu_park;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutPutClass out = new OutPutClass();
		Run run = new Run();
		InputClass input = new InputClass();
     
		String jumin = "";			//��ǥ�Ҹ� ����� ���� �ʿ��� ������
		String DayOrNight = ""; //�ְ���, �߰���
		String discount = "";
		String count = "";
		int last = 0; //���������� �� ����� ���� ���� ����
		int totalprice = 0; //�ѹ� ��� �� �� ���� �ݾ�
		int real_total_price = 0; //�ѱݾ�

		ArrayList<String> get_Print_ArrayList = new ArrayList<String>(); // �� ������ ����ϱ� ���� ��� ����Ʈ ������ش�.
		while (true) {  // ���� ��� ���� �𸣱� ������ �ݺ��� ������Ѵ�.
			DayOrNight = input.DayOrNight();
			jumin = input.ResidentNumber();
			count = input.HowMany();
			discount = input.Discount();

			int typediscount = Integer.parseInt(discount); // �������� ��ȣ�� ǥ��
			String Real_discount = out.Discount2(typediscount); // �������� ���ڷ� ǥ��

			int Real_DayOrNight = Integer.parseInt(DayOrNight); // �ְ��� �߰���
			if (Real_DayOrNight == 1) {
				run.dayResidentNumber(jumin); // ���̷� ���� ���ε� ����
				run.Discount(typediscount); // ��Ȳ ����
				totalprice = run.total_price(run.dayResidentNumber(jumin), count, run.Discount(typediscount)); // �� �ݾ�
				real_total_price += totalprice; // ���� �Ѿ��� ���ϱ� ���� ��
				run.write(input.DayNight(Real_DayOrNight), out.group1(jumin), count,
						String.valueOf((int) (run.dayResidentNumber(jumin) * run.Discount(typediscount) * Integer.parseInt(count))), Real_discount + " \n"); // csv���Ͽ� �Է�

			} else if (Real_DayOrNight == 2) { // �ְ��� �߰���
				run.nightResidentNumber(jumin); // ���̿� ���� ����
				run.Discount(typediscount); // ��Ȳ�� ���� ����
				// count ����
				totalprice = run.total_price(run.nightResidentNumber(jumin), count, run.Discount(typediscount)); // �ѱݾ�
				real_total_price += totalprice; // ���� �Ѿ��� ���ϱ� ���� ��
				run.write(input.DayNight(Real_DayOrNight), out.group1(jumin), count,
						String.valueOf((int) (run.nightResidentNumber(jumin) * run.Discount(typediscount) * Integer.parseInt(count))), Real_discount + " \n"); // csv���Ͽ� �Է�
			}

			get_Print_ArrayList.add(run.Array(DayOrNight, jumin, count, typediscount, Real_discount)); // �󼼳��� ���

			if (input.Continue() == 2) {
				out.done(get_Print_ArrayList, real_total_price); //�󼼳����� ���� ������ ��̸���Ʈ�� �ѱݾ��� ���ڷ� �޾Ƽ� out�� �ִ� done �޼ҵ带 �ҷ��´�.
				last = input.LastAsk(); // ���������� ����
				if (last == 2) {
					break;
				}
			}
		}
	}
}
