package amu_park;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Run {
	public InputClass inputclass = null;
	public ConstvaluseClass constval = null;
	public OutPutClass output = null;
	public Write write = null;
	//public Mysql mysql = null;	
	Calendar time = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY"); //4자리가 필요하기 때문에
	String thisyearxxxx = sdf.format(time.getTime());

	public Run() {
		inputclass = new InputClass();
		constval = new ConstvaluseClass();
		output = new OutPutClass();
		write = new Write();
		//mysql = new Mysql();
	}

	public int dayResidentNumber(String ResidentNumber) {  //주간권일 때랑 야간권일 때 두개로 나눴습니다.

		int howmuch = 0;
		int ThisYear = Integer.parseInt(thisyearxxxx); //현재 년도의 앞숫자 2개만 추출
		int BornYear = Integer.parseInt(ResidentNumber.substring(0, 2)); //주문번호에서 년도에 해당하는 번호를 추출
		int OldOrYoung = (int) ResidentNumber.charAt(6) - 48; // 1,2인 사람은 2000년 이전 출생자이다.

		switch (OldOrYoung / 3) { // 5,6 탈북자는 고려하지 않았다.
		case 0:
			if (ThisYear - 1900 - BornYear < constval.min_Elder1) { //현재년도 - 1900 - 태어난년도랑 각 나이 별로 비교했다.
				howmuch = constval.Adult_Day_Price;					//생년월인은 고려하지 않고 생일이 지난 만 나이라고 가정했다.
			} else {
				howmuch = constval.Elder_Day_Price;
			}
			return howmuch;
		case 1:
			if (ThisYear - 1900 - BornYear < constval.min_baby) { // 2000년대이후는 주민보호 7번째 숫자가 3 도는 4이기 때문에
				howmuch = constval.Kid_Day_Price; // 애기                 // 3으로 나눠주면 몫이 1이 된다.
				return howmuch;
			} else if (ThisYear - 1900 - BornYear < constval.Min_Teen1
					&& ThisYear - 1900 - BornYear > constval.Max_Teen2) { //청소년
				howmuch = constval.Teen_Day_Price;
			} else {
				howmuch = constval.Adult_Day_Price; // 어른
			}

		}
		return howmuch;
	}

	public int nightResidentNumber(String ResidentNumber) { // 위의 메소드와 야간권인걸 제외하고 전부 동일하다
		int howmuch = 0;
		int ThisYear = Integer.parseInt(thisyearxxxx);
		int BornYear = Integer.parseInt(ResidentNumber.substring(0, 2));
		int OldOrYoung = (int) ResidentNumber.charAt(6) - 48; // 1,2인 사람은 2000년 이전 출생자이다.
		// System.out.println(OldOrYoung);
		switch (OldOrYoung / 3) { // 5,6 탈북자는 고려하지 않았다.
		case 0: // 2000년대 이전 출생자
			if (ThisYear - 1900 - BornYear < constval.min_Elder1) { //현재 년도 - 1900 -주민번호 앞 2자리
				howmuch = constval.Adult_night_Price;
			} else {
				howmuch = constval.Elder_night_Price;
			}
			return howmuch;
		case 1: // 2000년대 이후 출생자
			if (ThisYear - 1900 - BornYear < constval.min_baby) { //현재 년도 - 1900 -주민번호 앞 2자리
				howmuch = constval.Kid_night_Price;
				return howmuch;
			} else if (ThisYear - 1900 - BornYear < constval.Min_Teen1
					&& ThisYear - 1900 - BornYear > constval.Max_Teen2) { //현재 년도 - 1900 -주민번호 앞 2자리
				howmuch = constval.Teen_night_Price;
			} else {
				howmuch = constval.Adult_night_Price;
			}
		}
		return howmuch;
	}

	public double Discount(int discount) { //할인율을 구하기 귀해 만든 메소드.
		double howdiscount = 0;
		switch (discount) {
		case 1:
			howdiscount = 1.0;
			break;
		case 2:
			howdiscount = constval.disabled;
			break;
		case 3:
			howdiscount = constval.DoForNation;
			break;
		case 4:
			howdiscount = constval.ManyChildren;
			break;
		case 5:
			howdiscount = constval.disabled;
			break;
		}
		return howdiscount;
	}

	public int total_price(int Price, String howmany, double discount) { //나이에 따른 티켓 가격, 수량, 할인율을 곱한 총금액
		int total_price = (int) (Price * Integer.parseInt(howmany) * discount);
		return total_price;
	}

	public String Array(String DayOrNight, String jumin, String count, int typediscount, String Real_discount) { //세부내역을 출력하기 위해 print에 필요한 정보를 전부 입력하고
		String print = "";																						//return값으로 print를 줬다.
		print += output.DayNight(Integer.parseInt(DayOrNight)) + " "; //주간권 야간권
		print += output.group1(jumin) + " X "; //나이 그룹
		print += count + "  "; //수량
		if (Integer.parseInt(DayOrNight) == 1) {
			print += (int) (dayResidentNumber(jumin) * Discount(typediscount) * Integer.parseInt(count)) + "원  "; //주간권 가격

		} else {
			print += (int) (nightResidentNumber(jumin) * Discount(typediscount) * Integer.parseInt(count)) + "원  "; //야간권 가격
		}
		print += "*" + Real_discount + "\n";  //우대 내역 표시
		return print;
	}
		
	public void write(String DayOrNight, String HowOld, String Count, String Price, String Discount) //csv파일을 만들기 위해 필요한 인자를 받아서
			throws IOException {																	//write class에 보내준다.
		write.write(DayOrNight, HowOld, Count, Price, Discount);
		//mysql.abc(DayOrNight, HowOld, Integer.parseInt(Count), Integer.parseInt(Price), Discount);
	}

}
