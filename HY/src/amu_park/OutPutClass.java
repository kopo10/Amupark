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
	SimpleDateFormat sdf = new SimpleDateFormat("YY");
	SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY");
	String b = sdf.format(time.getTime());

	String thisyear = sdf.format(time.getTime());

	public String DayNight(int a) {
		if (a == 1) {
			return "주간권";
		} else {
			return "야간권";
		}
	}

	public String group1(String jumin) {
		String group = "";
		if (Integer.parseInt(jumin.substring(0, 2)) > Integer.parseInt(thisyear)) { // 2000년대 이전 출생자
			if (Integer.parseInt(sdf1.format(time.getTime())) - 1900 - Integer.parseInt(jumin.substring(0, 2)) < 65) {
				group = "성인";
			} else {
				group = "어르신";
			}
		} else {
			if (Integer.parseInt(jumin.substring(0, 2)) < constval.min_baby) {
				group = "유아";
			} else if (Integer.parseInt(jumin.substring(0, 2)) > constval.Min_Teen1
					&& Integer.parseInt(jumin.substring(0, 2)) < constval.Max_Teen2) {
				group = "청소년";
			} else {
				group = "성인";
			}
		}
		return group;

	}

	public String Discount2(int discount) {
		if (discount == 1) {
			return "우대사항 없음";
		} else if (discount == 2) {
			return "장애인 우대";
		} else if (discount == 3) {
			return "유공자 우대";
		} else if (discount == 4) {
			return "다자녀우대";
		} else {
			return "임산부 우대";
		}
	}

	public void thanks(int price) {
		System.out.println("가격은" + price + "원 입니다\n감사합니다.");
	}

	public void done(ArrayList<String> get_Print_ArrayList, int real_total_price) {
		System.out.println("================폴리랜드===============");
		for (int i = 0; i < get_Print_ArrayList.size(); i++) {
			System.out.print(get_Print_ArrayList.get(i));
		}
		System.out.println("\n입장료 총액은 " + real_total_price + "원 입니다."); // 변경
		System.out.println("티켓 발권을 종료합니다.\n감사합니다.\n");
		System.out.println("=====================================");
	}

//	public void detail (String DayOrNight, String jumin, String count, int typediscount, String Real_discount) {
//		System.out.println(run.Array(DayOrNight, jumin, count, typediscount, Real_discount));
//	}
//	
}
