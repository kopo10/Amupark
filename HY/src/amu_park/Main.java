package amu_park;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutPutClass out = new OutPutClass();
		Run run = new Run();
		InputClass input = new InputClass();
     
		String jumin = "";			//매표소를 만들기 위해 필요한 변수들
		String DayOrNight = ""; //주간권, 야간권
		String discount = "";
		String count = "";
		int last = 0; //마지막으로 더 살건지 묻기 위한 변수
		int totalprice = 0; //한번 계산 할 때 마다 금액
		int real_total_price = 0; //총금액

		ArrayList<String> get_Print_ArrayList = new ArrayList<String>(); // 상세 내역을 출력하기 위해 어레이 리스트 만들어준다.
		while (true) {  // 고객이 몇번 살지 모르기 때문에 반복을 해줘야한다.
			DayOrNight = input.DayOrNight();
			jumin = input.ResidentNumber();
			count = input.HowMany();
			discount = input.Discount();

			int typediscount = Integer.parseInt(discount); // 우대사항을 번호로 표시
			String Real_discount = out.Discount2(typediscount); // 우대사항을 글자로 표시

			int Real_DayOrNight = Integer.parseInt(DayOrNight); // 주간권 야간권
			if (Real_DayOrNight == 1) {
				run.dayResidentNumber(jumin); // 나이로 인한 할인된 가격
				run.Discount(typediscount); // 상황 할인
				totalprice = run.total_price(run.dayResidentNumber(jumin), count, run.Discount(typediscount)); // 총 금액
				real_total_price += totalprice; // 최종 총액을 구하기 위한 값
				run.write(input.DayNight(Real_DayOrNight), out.group1(jumin), count,
						String.valueOf((int) (run.dayResidentNumber(jumin) * run.Discount(typediscount) * Integer.parseInt(count))), Real_discount + " \n"); // csv파일에 입력

			} else if (Real_DayOrNight == 2) { // 주간권 야간권
				run.nightResidentNumber(jumin); // 나이에 따른 가격
				run.Discount(typediscount); // 상황에 따른 할인
				// count 수량
				totalprice = run.total_price(run.nightResidentNumber(jumin), count, run.Discount(typediscount)); // 총금액
				real_total_price += totalprice; // 최종 총액을 구하기 위한 값
				run.write(input.DayNight(Real_DayOrNight), out.group1(jumin), count,
						String.valueOf((int) (run.nightResidentNumber(jumin) * run.Discount(typediscount) * Integer.parseInt(count))), Real_discount + " \n"); // csv파일에 입력
			}

			get_Print_ArrayList.add(run.Array(DayOrNight, jumin, count, typediscount, Real_discount)); // 상세내역 출력

			if (input.Continue() == 2) {
				out.done(get_Print_ArrayList, real_total_price); //상세내역을 전부 저정한 어레이리스트와 총금액을 인자로 받아서 out에 있는 done 메소드를 불러온다.
				last = input.LastAsk(); // 마지막으로 묻기
				if (last == 2) {
					break;
				}
			}
		}
	}
}
