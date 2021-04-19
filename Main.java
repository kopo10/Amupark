<<<<<<< HEAD
// ArrayList<ArrayList<String>> doublearray = new ArrayList<ArrayList<String>>();
package amu_park;

import java.io.IOException;
import java.util.ArrayList;
=======
package amu_park;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
>>>>>>> b8c9ae5df888c40be8a41cb70b4cae2eca579f7c

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		OutPutClass out = new OutPutClass();
		Run run = new Run();
		InputClass input = new InputClass();
		int AgePrice;
		double discount2;
		String group = "";
		String jumin = "";
		String DayOrNight = "";
		String discount = "";
		String count = "";
		String price = "";
		int last = 0;

		int totalprice = 0;
		int real_total_price = 0;

		ArrayList<String> get_Print_ArrayList = new ArrayList<String>();
		while (true) {
			DayOrNight = input.DayOrNight();
			jumin = input.ResidentNumber();
			count = input.HowMany();
			discount = input.Discount();

			price = "";
			int typediscount = Integer.parseInt(discount);

			String Real_discount = out.Discount2(typediscount);

			int Real_DayOrNight = Integer.parseInt(DayOrNight);
			if (Real_DayOrNight == 1) {
				run.dayResidentNumber(jumin); // 나이로 인한 할인된 가격
				run.Discount(typediscount); // 나이 말고 할인
				totalprice = run.total_price(run.dayResidentNumber(jumin), count, run.Discount(typediscount));

			} else if (Real_DayOrNight == 2) {
				run.nightResidentNumber(jumin); // 나이에 따른 가격
				run.Discount(typediscount); // 상황에 따른 할인
									// count 수량
				totalprice = run.total_price(run.nightResidentNumber(jumin), count, run.Discount(typediscount));

			}
			out.thanks(totalprice);

			String print = "";
			print += out.DayNight(Integer.parseInt(DayOrNight)) + " ";
			print += out.group1(jumin) + " X ";
			print += count + "  ";
			if (Integer.parseInt(DayOrNight) == 1) {
				print += run.dayResidentNumber(jumin) + "원  ";
			} else {
				print += run.nightResidentNumber(jumin) + "원  ";
			}
			print += "*" + Real_discount;

			real_total_price += totalprice;
			get_Print_ArrayList.add(print);

			if (input.Continue() == 2) {
				out.done();
				out.Poli();
				//out.total_price(real_total_price);

				for (int i = 0; i < get_Print_ArrayList.size(); i++) {

					get_Print_ArrayList.get(i);
					System.out.println(get_Print_ArrayList.get(i));
				}
				out.total_price(real_total_price);
				out.line();

				last = input.LastAsk();
				if (last == 2) {
					break;
				}
			}
		}
=======
		Run run = new Run();
		InputClass input = new InputClass();
		int DayOrNight = 0;

		
		DayOrNight = input.DayOrNight();
		if(DayOrNight == 1) {
			run.DayOrNight(DayOrNight);
			
		}
		
	
		
>>>>>>> b8c9ae5df888c40be8a41cb70b4cae2eca579f7c
	}

}
