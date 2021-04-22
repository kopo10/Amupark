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
	SimpleDateFormat sdf = new SimpleDateFormat("YY");   //년도 2자리가 필요할 때가 있고
	SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY");//   4자리가 필요할 때가 있어서 2개를 만들었다.
	String thisyearxx = sdf.format(time.getTime()); // 앞의 두자만 필요할 때 서브스트링으로 잘라도 되지만 이렇게 해봤다.
	String thisyearxxxx = sdf1.format(time.getTime()); // 4자리가 필요할 때.
	public String DayNight(int a) { // 주문내역을 출력할 때 필요한 글자를 return값으로 받았다.
		if (a == 1) {
			return "주간권";
		} else {
			return "야간권";
		}
	}

	public String group1(String jumin) { //주민등록번호를 통해 그룹을 나눴다.
		String group = "";
		if (Integer.parseInt(jumin.substring(0, 2)) > Integer.parseInt(thisyearxx)) { // 2000년대 이전 출생자
			if (Integer.parseInt(thisyearxxxx) - 1900 - Integer.parseInt(jumin.substring(0, 2)) < constval.min_Elder1) { // 현재년도에서 -1900 - 태어난 년도가 65보다 작으면 성인
				group = "성인";
			} else {
				group = "어르신";
			}
		} else {
			if (Integer.parseInt(thisyearxx) - Integer.parseInt(jumin.substring(0, 2)) < constval.min_baby) { //현재년도에서 -1900 - 태어난 년도
				group = "유아";
			} else if (Integer.parseInt(thisyearxx) - Integer.parseInt(jumin.substring(0, 2)) > constval.Min_Teen1
					&& Integer.parseInt(thisyearxx) - Integer.parseInt(jumin.substring(0, 2)) < constval.Max_Teen2) {
				group = "청소년"; //현재년도에서 -1900 - 태어난 년도
			} else {
				group = "성인"; //현재년도에서 -1900 - 태어난 년도
			}
		}
		return group;

	}

	public String Discount2(int discount) { //처음 입력한 할인 사항에 해당하는 번호 값을 저장했다가 출력할 때 사용
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

	public void thanks(int price) { // 주문이 끝났을 때 출력할 문장
		System.out.println("가격은" + price + "원 입니다\n감사합니다.");
	}

	public void done(ArrayList<String> get_Print_ArrayList, int real_total_price) { //파일로 된 피드백을 받기 전에는 이 메소드가 여러개의 메소드로 나눠져있었는데
		System.out.println("================폴리랜드===============");                //피드백을 받고 하나로 합칠 수 있다는걸 알게 되서 합쳤습니다.
		for (int i = 0; i < get_Print_ArrayList.size(); i++) {						//인자에 어레이리스트가 들어갈 수 있는것을 처음 알게 되었습니다. 
			System.out.print(get_Print_ArrayList.get(i));
		}
		System.out.println("\n입장료 총액은 " + real_total_price + "원 입니다."); // 변경
		System.out.println("티켓 발권을 종료합니다.\n감사합니다.\n");
		System.out.println("=====================================");
	}
}
