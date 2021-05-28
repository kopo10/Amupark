package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // 돈단위를 표시하기 위한 클래스
		Calendar k_10cal = Calendar.getInstance(); // 날짜 시간을 표시하기 위한 클래스
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜 시간의 형태를 설정하기 위한 클래스
		Calendar k_10cal2 = Calendar.getInstance();
		//impleDateFormat k17_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 실제 날짜, 시간을 원하는 방식으로 지정하는 식입니다.
		// Calendar k17_cal = Calendar.getInstance(); // 실제 날짜, 시간을 구하기 위한 식입니다.

	      SimpleDateFormat k10_sdt2 = new SimpleDateFormat("MM월dd일"); // 새로운 형식으로 날짜를 지정해줍니다.
	      Date k10_date = new Date(); // 생성자를 만들어 실제 현재 날짜를 가지고 옵니다.
	      k_10cal.setTime(k10_date); // 생성자에 시간을 넣어줍니다.
	      k_10cal.add(Calendar.DATE, 14); // 그리고 현재날짜에서 14일을 더한 값을 저장해줍니다.
	      String k10_in14days = k10_sdt2.format(k_10cal.getTime());
	      
		int k_10totalprice1 =  0;  //k_10totalprice1를 int 0으로 정의
		int k_10bftax = 0;   	   //k_10bftax를 int 0으로 정의
		double k_10taxrate = 0.1; //k_10taxrate를 int 0으로 정의
		int k_10tax = 0;          //k_10tax를 int 0으로 정의
	
		String[] k_10item = { "퓨어에어 비말차단a용마스크(최고급형)", "슬라이드식명찰(가aa로형)(100호)", "매직흡착 인테리어aa후크(알루미늄타입)" }; //아이템 이름을 어레이로 정의
		int[] k_10price = { 1000000, 1100, 1000000 }; // 가격을 어레이로 정의
		int[] k_10units = { 10, 10, 10 }; // 수량을 어레이로 정의
		String[] k_10code = { "[1031615]", "[11008152]", "[1020800]" }; // 종목번호를 어레이로 정의
		int[] k_10totalprice = new int[k_10item.length]; //총 금액을 아이템크기만큼으로 크기 정의

		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) { // 0부터 아이템크기만큼 반복
			k_10totalprice[k_10i] = k_10price[k_10i] * k_10units[k_10i]; // 34line에서 설정해준 어레이에 금액 * 수량 계산후 추가
		}

//		String k_10itemname1 = "퓨어에어 비말차단용마스크(최고급형)"; // 아이템 이름 정의
//		String k_10itemcode1 = "1031615"; // 아이템 코드 정의
//		int k_10price1 = 3000000; // 가격을 3000으로 정의
//		int k_10amount1 = 21; // 수량을 1로 정의
//		int k_10total_price1 = k_10price1 * k_10amount1; // 1번 물건의 총 가격을 표시
//
//		String k_10itemname2 = "슬라이드식명찰(가로형)(100호)"; // 2번 물건의 아이템 이름 정의
//		String k_10itemcode2 = "11008152"; // 아이템 코드 정의
//		int k_10price2 = 1000; // 가격을 1000으로 정의
//		int k_10amount2 = 1222; // 수량을 1로 정의
//		int k_10total_price2 = k_10price2 * k_10amount2; // 2번 물건의 총 가격을 표시
//
//		String k_10itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; // 3번 물건의 이름 정의
//		String k_10itemcode3 = "1020800"; // 아이템 코드 정의
//		int k_10price3 = 1000; // 아이템 가격 정의
//		int k_10amount3 = 1; // 아이템 수량 정의
//		int k_10total_price3 = k_10price3 * k_10amount3; // 아이템 3의 총 가격을 정의
//
//		double k_10taxRate = 1.1; // 세금율 0.1 + 1 로 정의;
//		double k_10_tax1 = k_10price1 - (k_10price1 / k_10taxRate); // 가격에서 과세금액을 빼주면 택스를 구할 수 있다.
//		int k_10real_tax1; // 소숫점을 땐 세금을 구하기 위해 선언해줬다.
//		if (k_10_tax1 == (int) (k_10_tax1)) { // 만약 소숫점이 없다면
//			k_10real_tax1 = (int) k_10_tax1; // 그대로 int로 변환만 해준다.
//		} else { // 만약 소숫점이 있어서 같지 않다면
//			k_10real_tax1 = (int) k_10_tax1 + 1; // 인트로 변환해서 소숫점을 제거 후 + 1 을 해준다.
//		} // 닫기
//		int k_10bf_tax_price1 = k_10price1 - k_10real_tax1; // 과세금액
//		int k_10total_af_price1 = k_10bf_tax_price1 * k_10amount1; // 과세금액 * 수량 // 총과세금액
//
//		double k_10_tax2 = k_10price2 - (k_10price2 / k_10taxRate); // 가격에서 과세금액을 빼주면 세금을 구할 수 있다.
//		int k_10real_tax2; // 택스를 구해주기 위해 선언
//		if (k_10_tax2 == (int) (k_10_tax2)) { // 만약 소숫점이 없다면
//			k_10real_tax2 = (int) k_10_tax2; // 그대로 int로만 변환
//		} else { // 소숫점이 있다면
//			k_10real_tax2 = (int) k_10_tax2 + 1; // int로 변환 후 소숫점 제거 후 + 1
//		} // 닫기
//		int k_10bf_tax_price2 = k_10price2 - k_10real_tax2; // 소비자 가격에서 택스를 제외한 과세금액
//		int k_10total_af_price2 = k_10bf_tax_price2 * k_10amount2; // 과세금액 * 수량 = 총 과세금액
//
//		double k_10_tax3 = k_10price3 - (k_10price3 / k_10taxRate); // 소비자가격에서 과세금액을 빼준 금액 = 세금
//
//		int k_10real_tax3; // 소숫점이 없는 세금를 구하기 위한 선언
//		if (k_10_tax3 == (int) (k_10_tax3)) { // 세금에 소숫점이 없다면
//			k_10real_tax3 = (int) k_10_tax3; // int로 변환
//		} else { // 그게 아니라면
//			k_10real_tax3 = (int) k_10_tax3 + 1; // 인트로 변환 후 + 1
//		} // 닫기
//		int k_10bf_tax_price3 = k_10price3 - k_10real_tax3; // 소비자 가격에서 세금을 뺀 과세 금액
//		int k_10total_af_price3 = k_10bf_tax_price3 * k_10amount3; // 과세금액에서 세금을 곱한 총 과세금액

		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) { // 0부터 아이템크기만큼 반복
			int lengthdiff = k_10item[k_10i].length() - 9; // 렝스 차이

			if (lengthdiff > 0 && k_10item[k_10i].getBytes().length > 18) { // 18바이트만 출력을 원하기 때문에 lengthdiff차이가 0보다 크고 바이트가 18보다 작을 때

				for (int k_10k = 0; k_10k <= lengthdiff; k_10k++) { //k가 lengthdiff만큼 반복

					if (k_10item[k_10i].substring(0, 9 + k_10k).getBytes().length == 17) { //lengthdiff만큼 반복 하면 subString 이 1만큼 증가하는데 그 크기가 17이 된다면
						if (k_10item[k_10i].substring(9 + k_10k, 9 + k_10k + 1).getBytes().length == 2) { // 그렇다면 그 다음 글자의 크기가 2(한글)이라면
							k_10item[k_10i] = k_10item[k_10i].substring(0, 9 + k_10k) + " "; //그대로 출력하고 " "추가
							break;

						} else {
							k_10item[k_10i] = k_10item[k_10i].substring(0, 9 + k_10k + 1); // 1(영어)라면 그대로 출력
							break;

						}
					} else if (k_10item[k_10i].substring(0, 9 + k_10k).getBytes().length == 18) { // lengthdiff만큼 늘려주다가 바이트 크기가 18으로 된다면
						k_10item[k_10i] = k_10item[k_10i].substring(0, 9 + k_10k); //그대로 출력
						break;
					}
				}
			} else { //(lengthdiff > 0 && k_10item[k_10i].getBytes().length > 18 이조건이 아니라면

				int k_10num = 18 - k_10item[k_10i].getBytes().length; //그대로 출력해준다.

				for (int k_10j = 0; k_10j < k_10num; k_10j++) { //그리고 남은 바이트 만큼
					k_10item[k_10i] += " "; //여백을 준다.
				}
			}

		}
		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) { //아이템전부를 반복하고 싶기 때문에 아이템크기만큼 반복
			k_10totalprice1 += k_10totalprice[k_10i]; //전부 더해준다.
		}
		k_10bftax = (int) (k_10totalprice1 / (k_10taxrate + 1)); //과세금액
		k_10tax = k_10totalprice1 - k_10bftax;  //부가세
		
		System.out.printf("%24s\n", "\"국민가게, 다이소\""); // ( ) 출력
		System.out.printf("%s\n", "(주)아성다이소_분당서현점"); // ( ) 출력
		System.out.printf("%s\n", "전화:031-702-6016"); // ( ) 출력
		System.out.printf("%s\n", "본사:서울 강남구 남부순환로 2748 (도곡동)"); // ( ) 출력
		System.out.printf("%s\n", "대표:박정부,신호섭 213-81-52063"); // ( ) 출력
		System.out.printf("%s\n", "매장:경기도 성남시 분당구 분당로53번길 11 (서현동)"); // ( ) 출력
		System.out.println("========================================="); // ( ) 출력
		System.out.printf("%25s\n", "소비자 중심경영(CCM) 인증기업 "); // ( ) 출력
		System.out.printf("%26s\n", "ISO 9001 품질경영시스템 인증기업"); // ( ) 출력
		System.out.println("========================================="); // ( ) 출력
		System.out.printf("%17s%s%s\n", "교환/환불 14일(", k10_in14days,")이내,"); // ( ) 출력
		System.out.printf("%s\n", "(전자)영수증, 결제카드 지참 후 구입매장에서 가능"); // ( ) 출력
		System.out.printf("%24s\n", "포장/가격 택 훼손시 교환/환불 불가"); // ( ) 출력
		System.out.printf("%23s\n", "체크카드 취소 시 최대 7일 소요"); // ( ) 출력
		System.out.println("========================================="); // ( ) 출력
		System.out.printf("%s%28s\n", "[POS 1058231]", k_10sdf.format(k_10cal2.getTime())); // ( ) 출력
		System.out.println("========================================="); // ( ) 출력

		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) {

			System.out.printf("%s%9s %2s %10s\n", k_10item[k_10i], k_10df.format(k_10price[k_10i]),
					k_10df.format(k_10units[k_10i]), k_10df.format(k_10totalprice[k_10i])); // ( ) 출력
			System.out.printf("%s\n", k_10code[k_10i]);
		}

		System.out.printf("%18s%19s\n", "과세합계",
						  k_10df.format(k_10bftax)); // ( ) 출력
		System.out.printf("%19s%19s\n", "부가세", k_10df.format(k_10tax)); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s%33s\n", "판매합계", k_10df.format(k_10totalprice1)); // ( ) // 출력
		System.out.println("========================================="); // ( ) 출력
		System.out.printf("%s%33s\n", "신용카드", k_10df.format(k_10totalprice1)); // 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s%33s\n", "우리카드", "538720**********"); // ( ) 출력
		System.out.printf("%s%6s %10s\n", "승인번호 77982843(0)", "승인금액",
				k_10df.format(k_10totalprice1)); // ( ) 출력
		System.out.println("========================================="); // ( ) 출력
		System.out.printf("%26s%s\n", k_10sdf.format(k_10cal2.getTime()), " 분당서현점"); // ( ) 출력
		System.out.printf("%s\n", "상품 및 기타 문의 : 1522-4400"); // ( ) 출력
		System.out.printf("%s\n", "멤버십 및 샵다이소 관련 문의 : 1599-2211"); // ( ) 출력
		System.out.printf("%28s\n", "2112820610158231"); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s\n", "◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요! ◈"); // ( ) 출력
	} 
}
