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
		
			int typediscount = Integer.parseInt(discount); // 우대사항을 번호로 표시
			String Real_discount = out.Discount2(typediscount); //우대사항을 글자로 표시

			int Real_DayOrNight = Integer.parseInt(DayOrNight); // 주간권 야간권
			if (Real_DayOrNight == 1) {
				run.dayResidentNumber(jumin); // 나이로 인한 할인된 가격
				run.Discount(typediscount); // 상황 할인
				totalprice = run.total_price(run.dayResidentNumber(jumin), count, run.Discount(typediscount)); //총 금액

			} else if (Real_DayOrNight == 2) {  // 주간권 야간권
				run.nightResidentNumber(jumin); // 나이에 따른 가격
				run.Discount(typediscount); // 상황에 따른 할인
									// count 수량
				totalprice = run.total_price(run.nightResidentNumber(jumin), count, run.Discount(typediscount)); //총금액
			}
			
			run.write(input.DayNight(Real_DayOrNight), out.group1(jumin), count,
					String.valueOf((int) (run.dayResidentNumber(jumin) * run.Discount(typediscount))), Real_discount + " \n"); // csv파일에 입력
			
			get_Print_ArrayList.add(run.Array(DayOrNight, jumin, count, typediscount, Real_discount)); //상세내역 출력		
			real_total_price += totalprice; // 최종 총액을 구하기 위한 값

			if (input.Continue() == 2) {
				out.done(get_Print_ArrayList , real_total_price);	
				
				last = input.LastAsk(); // 마지막으로 묻기
				if (last == 2) {
					break;
				}
			}
		}
	}

}
