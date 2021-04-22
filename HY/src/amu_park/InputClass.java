package amu_park;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;

	public InputClass() {
		sc = new Scanner(System.in);
	}
	
	public String DayOrNight() {
		String DayOrNight;
		System.out.printf("권종을 선택하세요\n1. 주간권\n2. 야간권\n"); // 주간권 야간권 선택
		DayOrNight = sc.next();
		return DayOrNight; // return값으로 String을 받은 이유는 나중에 csv파일에 넣기 위해서이다.
	}

	public String ResidentNumber() {
		String ResidentNumber;
		System.out.printf("주민번호를 입력하세요(-제외 7자리)\n"); // 7번째 자리인 1.2.3.4가 나이계산 때 필요
		ResidentNumber = sc.next(); // 하기 때문에 필요하다
		return ResidentNumber;
	}

	public String HowMany() { // 수량 판단
		String HowMany = "";
		System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
		HowMany = sc.next();
		while (Integer.parseInt(HowMany) > 10) {
			System.out.println("수량 초과입니다 다시 선택해주세요"); // 수량이 초과하면 초과 메시지 출력 후 재입력
			HowMany = sc.next();
			if (Integer.parseInt(HowMany) < 11) { // 10개 이하로 입력시 정지
				break;
			}
		}
		return HowMany;
	}

	public String Discount() { // 할인 대상인지 판단
		String Discount;
		System.out.println("우대사항을 선택하세요\n1. 없음(나이 우대는 자동처리)\n2. 장애인\n3. 국가유공장\n4. 다자녀\n5. 임산부"); // 할인 대상 입력
		Discount = sc.next();
		return Discount;
	}

	public int Continue() { // 발권 여부
		int Continue;
		System.out.println("계속 발권 하시겠습니까?\n1. 티켓 발권\n2. 종료");
		Continue = sc.nextInt();
		return Continue;
	}

	public String DayNight(int a) { // csv파일에 입력 할 String
		if (a == 1) {
			return "주간권";
		} else {
			return "야간권";
		}
	}

	public String group1(String b) { // csv파일에 입력 할 String
		if (Integer.parseInt(b) == 1) {
			return "유아";
		} else if (Integer.parseInt(b) == 2) {
			return "청소년";
		} else if (Integer.parseInt(b) == 3) {
			return "성인";
		} else {
			return "노인";
		}
	}

	public String Discount2(int discount) { // csv파일에 입력 할 String
		if (discount == 1) {
			return "우대없음";
		} else if (discount == 2) {
			return "장애인";
		} else if (discount == 3) {
			return "유공자";
		} else if (discount == 4) {
			return "다자녀";
		} else {
			return "임산부";
		}
	}

	public int LastAsk() { // 상세내역 출력 후 마지막 질문
		int a = 0;
		System.out.println("계속 진행(1: 새로운 주문, 2: 프로그램 종료) :");
		a = sc.nextInt();
		while (a != 1 && a != 2) { // 새로 주문 하거나 더이상 원하지 않는 번호가 아닌 번호를 눌렸을 때
			System.out.println("잘못 입력하셨습니다 다시 선택해주세요\n1: 새로운 주문, 2: 프로그램 종료 :");
			a = sc.nextInt();
		}
		return a; //숫자를 return 받아서 메인에서 활용
	}
}
