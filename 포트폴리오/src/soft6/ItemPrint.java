package soft6;

import java.text.DecimalFormat;

public class ItemPrint {

	public void Print(int k_10_z) {
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // 돈 단위를 나타내기 위한 클래스
		String[] k_10itemname = { "123420자테스트이a면11칠555", "ab맛asdadad포카칩", "ddd초코센드위치ss위치", "피a시방a치즈a햄a버a거aa", "치즈없는피자", // item이름을
																														// //
																														// 배열이다
				"abc12119", "뉴질랜드산항이", "오늘의커피()a", "시티위아아", "가1나2다3라4마가바6사7아8", "스물두번째과자", "(싸이버버세트라지", "aaa프링클스오리지널",
				"55포카칩어니언맛", "떡없는떡볶이", "호식이두마리치킨", "땅땅치킨매운맛", "라면은역시매고랭", "된장찌개맛사탕", "삼겹살맛치토스", "나홀로집에세트", "자바칩세트는맛없다",
				"오레오레오레오", "자바에이드", "자이언트자바", "이거슨오떡오떡", "마지막과자세트", "차가운삼각김밥", "신라면짜장맛", "맛탕과김치" };
		// 이름,가격,수량 배열을 나중에
		// 다
		// 더할것이기 때문에 셋 배열의
		// 크기는 같아야한다.

		int[] k_10price = { 1000, 1000000, 1000000, 1000000, 11000, 1600, 1700, 1800, 1900, 2000, // 각각의 상품의 가격 입력
				2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000, // 각각의 상품의 가격 입력
				3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // 각각의 상품 가격 입력
		int[] k_10units = { 10, 10, 10, 10, 10, 1, 8, 1, 1, 1, 1, 4, 1, 1, 2, 6, 1, 1, 6, 1, 6, 1, 5, 1, 1, 2, 1, 4, 1,
				1 }; // 각각의
		// 상품
		// 수량을
		// 입력
		boolean[] k_10taxfree = { false, false, true, true, false, true, true, true, true, false, true, true, true,
				true, true, true, false, true, true, true, true, true, false, true, true, false, true, false, true,
				true }; // 과세물품과
						// 비과세물품
						// 위한
						// boolean
		int[] k_10total_price_sneak = new int[k_10itemname.length]; // 총 과자금액의 배열 사이즈를 정의
		String[] k_10mark_check_free = { "*" }; // 비과세물품을 위한 표시를 위한 배열
		String[] k_10make_space = { " " }; // 비과세 물품과 칸을 맞추기 위한 배열
		
		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i가 0부터 29까지 돌때
			k_10total_price_sneak[k_10i] += k_10price[k_10i] * k_10units[k_10i]; // 상품 가격과 상품 수량을 곱해준다.
			if (k_10taxfree[k_10i] == true) { // 해당 상품이 과세라면
				k_10itemname[k_10i] = k_10mark_check_free[0] + k_10itemname[k_10i]; // 과세라면 " " 공간을 만들어준다
			} else { // 면세품목이라면
				k_10itemname[k_10i] = k_10make_space[0] + k_10itemname[k_10i]; // 면세품목인걸 표시 할 " * "을 더해준다.
			} // 닫기
		} // 닫기
		
		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i가 item크기만큼 돌 때
			int lengthdiff = k_10itemname[k_10i].length() - 9; // 렝스 차이
			// System.out.println("lendiff : " +k_10i +" ++ "+lengthdiff);

			if (lengthdiff > 0 && k_10itemname[k_10i].getBytes().length > 18) { // lengthdiff가 0보다 크고 총 글자수를
																				// 9글자로(18바이트)로 하고 싶기 때문에
				// System.out.println(k_10i + k_10itemname[k_10i]); //18보다 작다면
				for (int k_10k = 0; k_10k <= lengthdiff; k_10k++) { // lengthdiff차이만큼 반복해준다.
					// System.out.println("k : " + k_10i);
					if (k_10itemname[k_10i].substring(0, 9 + k_10k).getBytes().length == 17) { // lengthdiff만큼 계속
																								// substring 증가하다가 바이트가
																								// 17이 된다면
						if (k_10itemname[k_10i].substring(9 + k_10k, 9 + k_10k + 1).getBytes().length == 2) { // 두가지로
																												// 나눠서
																												// 그다음
																												// 글자
																												// 크기(한글)이
																												// 2이라면
							k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k) + " "; // 그대로 출력해주고 + " "을
																										// 해준다.
							// System.out.println("## " + k_10itemname[k_10i]);
							break;

						} else {
							k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k + 1); // 바이트가 1(영어또는
																									// 특수문자)라면 이것까지
																									// 출력해준다.
							// System.out.println("@@ " + k_10itemname[k_10i]);
							break;
						}
					} else if (k_10itemname[k_10i].substring(0, 9 + k_10k).getBytes().length == 18) { // 18로 딱맞다면
						k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k); // 그대로 출력해준다.
						// System.out.println("** " + k_10itemname[k_10i]);
						break;
					}

				}

			} else { // lengthdiff > 0 && k_10itemname[k_10i].getBytes().length > 18이라면

				int k_10num = 18 - k_10itemname[k_10i].getBytes().length; // 그대로 출력해준다.

				for (int k_10j = 0; k_10j < k_10num; k_10j++) { // 나머지 모자란 바이트는
					k_10itemname[k_10i] += " "; // " "을 준다.
				}
			}

		}

		

		//for (int k_10z = 0; k_10z < k_10itemname.length; k_10z++) { // i가 0 부터 29까지 출력 (제품이 30개 있으니까)
			if (k_10_z % 5 == 0 && k_10_z != 0) { // 6번째마다 출력전에 ----을 출력함으로써 과자 5개마다 줄로 나눠준다.
				System.out.printf("-----------------------------------------\n"); // ( ) 출력
			}
			System.out.printf("%s%9s %2s %10s\n", k_10itemname[k_10_z], k_10df.format(k_10price[k_10_z]),
					k_10df.format(k_10units[k_10_z]), k_10df.format(k_10total_price_sneak[k_10_z])); // 과자 금액 수량 총 가격 출력
		//}
	} // 절삭
}
