// ArrayList<ArrayList<String>> doublearray = new ArrayList<ArrayList<String>>();
package amu_park;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutPutClass out = new OutPutClass();
		Run run = new Run();
		InputClass input = new InputClass();

		String jumin = "";
		String DayOrNight = "";
		String discount = "";
		String count = "";
		int last = 0;
		int totalprice = 0;
		int real_total_price = 0;

		ArrayList<String> get_Print_ArrayList = new ArrayList<String>();
		ArrayList<String> get_Print_ArrayList1 = new ArrayList<String>();
		while (true) {
			DayOrNight = input.DayOrNight();
			jumin = input.ResidentNumber();
			count = input.HowMany();
			discount = input.Discount();
		
			int typediscount = Integer.parseInt(discount); // �������� ��ȣ�� ǥ��
			String Real_discount = out.Discount2(typediscount); //�������� ���ڷ� ǥ��

			int Real_DayOrNight = Integer.parseInt(DayOrNight); // �ְ��� �߰���
			if (Real_DayOrNight == 1) {
				run.dayResidentNumber(jumin); // ���̷� ���� ���ε� ����
				run.Discount(typediscount); // ��Ȳ ����
				totalprice = run.total_price(run.dayResidentNumber(jumin), count, run.Discount(typediscount)); //�� �ݾ�

			} else if (Real_DayOrNight == 2) {  // �ְ��� �߰���
				run.nightResidentNumber(jumin); // ���̿� ���� ����
				run.Discount(typediscount); // ��Ȳ�� ���� ����
									// count ����
				totalprice = run.total_price(run.nightResidentNumber(jumin), count, run.Discount(typediscount)); //�ѱݾ�
			}
			
			run.write(input.DayNight(Real_DayOrNight), out.group1(jumin), count,
					String.valueOf((int) (run.dayResidentNumber(jumin) * run.Discount(typediscount))), Real_discount + " \n"); // csv���Ͽ� �Է�
			
			get_Print_ArrayList.add(run.Array(DayOrNight, jumin, count, typediscount, Real_discount)); //�󼼳��� ���		
			real_total_price += totalprice; // ���� �Ѿ��� ���ϱ� ���� ��

			if (input.Continue() == 2) {
				out.done(get_Print_ArrayList , real_total_price);	
				
				last = input.LastAsk(); // ���������� ����
				if (last == 2) {
					break;
				}
			}
		}
	}

}
