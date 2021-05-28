package soft7;

import java.text.DecimalFormat;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###");
                 //숫자 5 이름 32 가격 15 수량 2 총가격 15
		String[] k_10itemname = { // item이름을 위한 배열이다
				"01   테스트라면555                        3,000           1          3,000", 
				"02*  맛asdadad포카칩                      1,000           2          2,000",
				"03   ddd초코센드위치ss위치                1,000           2          2,000", 
				"04   피시방햄버거는맛없어                 1,000          12         13,000",//틀린거 
				"05*  치즈없는피자                       111,000           2        223,000",  
				"06   맛있는포카칩                         1,000           2          2,000", 
				"07   뉴질랜드산항이                      11,000           2          2,000", 
				"08*  오늘의커피아이스                     7,000           2         12,000", //틀린거 
				"09   시티위아아                           1,000           2          2,000", 
				"10   가나가맛있어                         1,000           2          2,000", 
				"11   스물두번째과자                         800           2          1,600", 
				"12   (싸이버버세트라지                    4,000           2          8,000", 
				"13   aaa프링클스오리지널                  1,000           2          2,000",
				"14   55포카칩어니언맛                     1,000           2          2,000", 
				"15   떡없는떡볶이                         1,000           6          6,000", 
				"16*  호식이두마리치킨                     1,000           2          2,000", 
				"17*  땅땅치킨매운맛                       3,000           2          6,000", 
				"18   라면은역시매고랭                     1,000           2          2,000", 
				"19   된장찌개맛사탕                       1,000           2          2,000", 
				"20   삼겹살맛치토스                       1,000           2          2,000", 
				"21*  나홀로집에세트                       1,000           2          2,000", 
				"22   자바칩세트는맛없다                   1,000           2          2,000",
				"23*  오레오레오레오                       1,000           2          2,000", 
				"24   자바에이드                           1,000           2          2,000", 
				"25   자이언트자바                         1,000           2          2,000", 
				"26   이건오떡오떡                         2,000          10         20,100", // 틀린거 
				"27   마지막과자세트                       1,000          11         11,000", 
				"28*  차가운삼각김밥                       1,000           2          2,000", 
				"29   신라면짜장맛                         1,000           2          2,000", 
				"30   맛탕과김치                           1,000           2          2,000" }; 
		
		for (int k_10_i = 0; k_10_i < k_10itemname.length; k_10_i++) {
			String k_10_ToString = k_10itemname[k_10_i].toString();
			byte [] k_10_bb = k_10_ToString.getBytes();
			
			
			
			
			String k_10_number = new String (k_10_bb,0,5);										// 1번째부터 5바이트만큼 크기로 정의
			String k_10_name = new String (k_10_bb,5,33);										// 6번째부터 33바이트만큼 크기로 정의
			String k_10_price1 = new String (k_10_bb,35,15);									// 36번째부터 15바이트만큼 크기로 정의
			String k_10_units1 = new String (k_10_bb,55,10);									// 56번째부터 10바이트만큼 크기로 정의
			String k_10_totalprice1 = new String (k_10_bb,60,14);								// 61번째부터 14바이트만큼 크기로 정의
			
			int k_10_price = Integer.parseInt(k_10_price1.replace(",", "").trim());				// int로 바꾸고 , 제거 후 공백도 제거
			int k_10_units = Integer.parseInt(k_10_units1.replace(",", "").trim());				// int로 바꾸고 , 제거 후 공백도 제거
			
			//String price1 = k_10itemname[i].substring(33, 48);
			
			//String units1 = k_10itemname[i].substring(45, 58);

			int k_10_totalprice = Integer.parseInt(k_10_totalprice1.replace(",", "").trim());   // int로 바꾸고 , 제거 후 공백도 제거
			
			if(k_10_price * k_10_units != k_10_totalprice) {
				System.out.println("******************************");																						// ( ) 출력
				System.out.printf("오류[%s%s%10s%10s%10s]\n", k_10_number, k_10_name, k_10_price1, k_10_units1, k_10df.format(k_10_totalprice));			// ( ) 출력
				System.out.printf("수정[%s%s%10s%10s%10s]\n", k_10_number, k_10_name, k_10_price1, k_10_units1, k_10df.format(k_10_price * k_10_units));	// ( ) 출력
				System.out.println("******************************");																						// ( ) 출력
			}
				
		}
	
		
	}

}
