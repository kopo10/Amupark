package amu_park;

public class MyOutput {

	public void choose() {
		System.out.println("원하는 매출 내역을 선택하세요^^\n\n1. 주야간 판매량\n\n2. 유형별 판매량\n\n3. 연령별 판매량.\n\n4. 종료");
	}

	public void GroupLine() {
		System.out.println("================권종 별 판매 현황===================");
	}
	
	public void DayLine() {
		System.out.println("================일자 별 판매 현황===================");
	}
	
	public void DiscountLine () {
		System.out.println("================우대권 판매 현황===================");
	}
	
	public void Error () {
		System.out.println("다시 선택해 주세요");
	}
}

//우대권 판매 현황
//일자별 판매 현황