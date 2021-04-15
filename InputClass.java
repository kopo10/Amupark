package amu_park;

import java.util.Scanner;

public class InputClass {
	Scanner sc= null;
	public InputClass(){
		sc = new Scanner(System.in);
	}
	
	public int DayOrNight () {
		int DayOrNight;
		System.out.println("권종을 선택하세요\n1. 주간권\n2. 야간권");
		DayOrNight= sc.nextInt();	
		return DayOrNight;		
	}
	
	public int HowMany () {
		int HowMany;
		System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
		HowMany = sc.nextInt();	
		sc.nextLine();
		return HowMany;		
	}
	
	public String ResidentNumber () {
		System.out.println("주민번호를 입력하세요");
		String ResidentNumber;
		ResidentNumber = sc.nextLine();
		return ResidentNumber;		
	}
	
	public int Discount () {
		int Discount;
		System.out.println("우대사항을 선택하세요\n1. 없음(나이 우대는 자동처리)\n2. 장애인\n3. 국가유공장\n4. 다자녀\n5. 임산수");
		Discount = sc.nextInt();
		return Discount;		
	}
	
	public int Continue () {
		int Continue;
		System.out.println("계속 발권 하시겠습니까?\n1. 티켓 발권\n2. 종료");
		Continue = sc.nextInt();
		return Continue;		
	}
	
	
	
	
	
//가격은 얼마, 감사합니다.	
//	
	
	// 종료 클릭시  "   "
}
