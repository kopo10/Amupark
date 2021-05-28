package soft6;

import java.text.DecimalFormat;

public class TotalPrint {
	public void TotalPrint() {
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // 돈 단위를 나타내기 위한 클래스
		String[] k_10itemname = { "123420자테스트이a면11칠555", "ab맛asdadad포카칩", "ddd초코센드위치ss위치", "피a시방a치즈a햄a버a거aa", "치즈없는피자",  // item이름을 위한 배열이다
				"abc12119", "뉴질랜드산항이", "오늘의커피()a", "시티위아아", "가1나2다3라4마가바6사7아8", "스물두번째과자", "(싸이버버세트라지", "aaa프링클스오리지널",
				"55포카칩어니언맛", "떡없는떡볶이", "호식이두마리치킨", "땅땅치킨매운맛", "라면은역시매고랭", "된장찌개맛사탕", "삼겹살맛치토스", "나홀로집에세트", "자바칩세트는맛없다",
				"오레오레오레오", "자바에이드", "자이언트자바", "이거슨오떡오떡", "마지막과자세트", "차가운삼각김밥", "신라면짜장맛", "맛탕과김치" }; 
																																					  // 이름,가격,수량 배열을 나중에
																									// 다
																									// 더할것이기 때문에 셋 배열의
																									// 크기는 같아야한다.
		
		int[] k_10price = { 1000, 1000000, 1000000, 1000000, 11000, 1600, 1700, 1800, 1900, 2000, // 각각의 상품의 가격 입력
							2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000,    // 각각의 상품의 가격 입력
							3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // 각각의 상품 가격 입력
		int[] k_10units = { 10, 10, 10, 10, 10, 1, 8, 1, 1, 1, 1, 4, 1, 1, 2, 6, 1, 1, 6, 1, 6, 1, 5, 1, 1, 2, 1, 4, 1, 1 }; // 각각의
		// 상품
		// 수량을
		// 입력
		boolean[] k_10taxfree = { false, false, true, true, false, true, true, true, true, false, true, true, true,
				true, true, true, false, true, true, true, true, true, false, true, true, false, true, false, true,
				true }; // 과세물품과
						// 비과세물품
						// 위한
						// boolean
		int k_10With_tax_price = 0; // 과세물품
		int k_10tax_free_price = 0; // 비과세물품
		int[] k_10total_price_sneak = new int[k_10itemname.length]; // 총 과자금액의 배열 사이즈를 정의
		String[] k_10mark_check_free = { "*" }; // 비과세물품을 위한 표시를 위한 배열
		String[] k_10make_space = { " " }; // 비과세 물품과 칸을 맞추기 위한 배열

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i가 0부터 29까지 돌때
			k_10total_price_sneak[k_10i] += k_10price[k_10i] * k_10units[k_10i]; // 상품 가격과 상품 수량을 곱해준다.
			if (k_10taxfree[k_10i] == true) { // 해당 상품이 과세라면
				k_10tax_free_price += k_10total_price_sneak[k_10i]; // k_10With_tax_price 에 해당 과자에 대한 총 가격을 계속 더해준다.
				k_10itemname[k_10i] = k_10mark_check_free[0] + k_10itemname[k_10i]; // 과세라면 " " 공간을 만들어준다
			} else { // 면세품목이라면
				k_10With_tax_price += k_10total_price_sneak[k_10i]; // 면세품목인 제품들을 전부 더해준다.
				k_10itemname[k_10i] = k_10make_space[0] + k_10itemname[k_10i]; // 면세품목인걸 표시 할 " * "을 더해준다.
			} // 닫기
		} // 닫기
		
		double k_10taxrate = 0.1; // 세금율을 10%로 정의한다.
		// double k_10before_tax_price = k_10With_tax_price / (1 + k_10taxrate); // 소비자
		// 가격에에서 1 + 세율을 나눠준다면 과세금액을 구할 수 있다
		int k_10real_before_tax_price = (int) (k_10With_tax_price / (1 + k_10taxrate)); // 세전금액을 소숫점 제거하고 출력 나중에 세금으로
		// 절삭한 소숫점 금액 보완
		int k_10total_real_surtax = k_10With_tax_price - k_10real_before_tax_price; // 소비자 가격에서 과세금액을 빼준 금액이 부가세이다
																					// //과세물품금액에서 절삭한금액을 여기서 추가해준다.	
		int k_10total_pay = ((k_10tax_free_price + k_10real_before_tax_price + k_10total_real_surtax) / 10) * 10; // 우리나라는
		
		
	System.out.printf("\n"); // ( ) 출력 라인을 1칸 비워준다.
	System.out.printf("%22s%14s\n", "총 품목 수량", k_10df.format(k_10itemname.length)); // 물품의 수량 출력
	System.out.printf("%23s%14s\n", "(*)면 세  물 품", k_10df.format(k_10tax_free_price)); // 면세가 되는 제품의 총액
	System.out.printf("%23s%14s\n", "과 세  물 품", k_10df.format(k_10real_before_tax_price)); // 과세물품의 총액
	System.out.printf("%24s%14s\n", "부   가   세", k_10df.format(k_10total_real_surtax)); // 부가세의 총액
	System.out.printf("%25s%14s\n", "합        계", k_10df.format(k_10total_pay)); // 총액
	System.out.printf("%s%24s\n", "결 제 대 상 금 액", k_10df.format(k_10total_pay)); // 총 결제해야 하는 금액
	System.out.printf("-----------------------------------------\n"); // ( ) 출력
	System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658"); // ( ) 출력
	System.out.printf("%s%16s%10s\n", "카드결제(IC)", "일시불 / ", k_10df.format(k_10total_pay)); // ( ) 출력
	System.out.printf("-----------------------------------------\n"); // ( ) 출력
	System.out.printf("%25s\n", "[신세계포인트 적립]"); // ( ) 출력
	System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다."); // ( ) 출력
	System.out.printf("%s%21s%6s\n", "금회발생포인트", "9350**9995", k_10df.format(164)); // ( ) 출력
	System.out.printf("%s%17s(%6s)\n", "누계(가용)포인트", k_10df.format(5637), k_10df.format(5473)); // ( ) 출력 0,000형식으로
																								// 돈을
																								// 출력하기 위해
																								// df.format을 사용했다.
	System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다."); // ( ) 출력
	System.out.printf("-----------------------------------------\n"); // ( ) 출력
	System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여"); // ( ) 출력
	System.out.printf("%s%30s\n", "차량번호 :", "34저****"); // ( ) 출력

	}
}
