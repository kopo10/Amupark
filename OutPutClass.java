package amu_park;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
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
				group = "어른";
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

		// 주간 청소년 수량 가격 우대

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

	public void thanks(int  price) {
		System.out.println("가격은" + price + "원 입니다\n 감사합니다.");
	}
	
	
	
	public void done() {
		System.out.println("티켓 발권을 종료합니다.\n감사합니다.\n\n");
	}

	public void Poli() {
		System.out.println("================폴리랜드=============");
	}
	
	public void total_price(int totalprice) {
		System.out.println("\n\n입장료 총액은 " + totalprice + "원 입니다.");		
	}
	
	public void line() {
		System.out.println("=====================================");
	}
	
	
	
	
	
=======
public class OutPutClass {

>>>>>>> b8c9ae5df888c40be8a41cb70b4cae2eca579f7c
}
