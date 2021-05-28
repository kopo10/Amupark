package soft7;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String[] k_10_OneRec = { 																															// 문자형 배열 k_10_OneRec을 정의하고 값을 저장한다.
				"역명,선탑(지하철),후탑(버스)", "녹동(간이)역,187,5224", "소태역,67702,31941", "학동증심사입구역,37391,34845", "남광주역,225904,64984",
				"문화전당역,39541,99041", "금남로4가역,86431,102566", "금남로5가역,57753,50857", "양동시장역,42574,30712",
				"돌고개역,29245,26934", "농성역,44479,39585", "화정역,31696,47096", "쌍촌역,32700,59617", "운천역,107993,84289",
				"상무역,71421,117217", "김대중컨벤션센터역,14692,32171", "공항역,47623,34129", "송정공원역,273014,52169",
				"광주송정역,67461,130027", "도산역,62237,38307", "평동역,12220,126283" };

		String[] k_10_field_name = k_10_OneRec[0].split(",");
																																// 문자형 배열 k_10_field_name을 정의하고 안에 k_10_OneRec[0](제목부분)을 
																																// 콤마로 짜른 값들을 넣어준다.
		String k_10_temp; 																										// 문자형 클래스 k_10_temp를 정의한다	.
		for (int k_10_i = 1; k_10_i < k_10_OneRec.length; k_10_i++) {														    // for문을 k_10_OneRec의 길이만큼 돌려준다.

			String[] k_10_field = k_10_OneRec[k_10_i].split(",");
																																// k_10_field_를 정의하고 안에 k_10_OneRec[k_10_i](제목부분)을 콤마로 짜른 값들을 넣어준다.
			System.out.printf("***********************************\n"); 														// ( ) 출력
			for (int k_10_j = 0; k_10_j < k_10_field_name.length; k_10_j++) { 													// for문을 k17-field_name만큼 돌려준다.
				if (k_10_j == 1) { 																								// k_10_j가 1이면 (배열안에 1번째 항)
					int k_10_a = Integer.parseInt((k_10_field[k_10_j]));
																																// 변수 k_10_a를 정의하고 k_10_field[k_10_j]를 int형으로 변환한 값을 넣어준다.
					k_10_temp = printNumber(k_10_a); 																			// k_10_temp에는 메소드를 불러 k_10_a 값을 대입한 결과를 저장한다.
					k_10_field[1] = k_10_field[1] + "(" + k_10_temp + ")";
																																// 배열안의 1번째에 숫자를 한글로표기한 결과를 저장한다.
				} else if (k_10_j == 2) {
					int k_10_a = Integer.parseInt((k_10_field[k_10_j]));
																																// 변수 k_10_a를 정의하고 k_10_field[k_10_j]를 int형으로 변환한 값을 넣어준다.
					k_10_temp = printNumber(k_10_a); 																			// k_10_temp에는 메소드를 불러 k_10_a 값을 대입한 결과를 저장한다.
					k_10_field[2] = k_10_field[2] + "(" + k_10_temp + ")";
																																// 배열안의 2번째에 숫자를 한글로표기한 결과를 저장한다.
				}
				System.out.printf(" %s : %s\n", k_10_field_name[k_10_j], k_10_field[k_10_j]);									 // ( ) 출력
			}
			System.out.printf("***********************************\n");															 // ( ) 출력
		}
	}

	public static String printNumber(int k_10_iNumVal) {

		String k_10_sNumVal = String.valueOf(k_10_iNumVal);																		 // 값을 valueof()메소드를 이용해 String타입으로 형변환다

		String k_10_sNumVoice = ""; 																							// String변수 k10_sNumVoice에 null값 저장

																																// 스트링으로 형변화 시킨 "1001034567"과 그 길이인 10 출력
		int k_10_i, k_10_j; 																									// 정수형 변수인 k02_i,k02_j 생성

		String[] k_10_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
																																// k02_units변수에 스트링배열 사이즈가 10이고 값들을 저장
		String[] k_10_unitx = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
																																//k02_unitㅌ변수에 스트링배열 사이즈가 10이고 값들을 저장

		k_10_i = 0; 																											// k02_i변수를 0으로 초기화
		k_10_j = k_10_sNumVal.length() - 1; 																					// -1를 해준이유는 배열은 인텍스번호 0부터 시작하기 때문에 -1를 해줌

		while (true) { 
			if (k_10_i >= k_10_sNumVal.length())
				break;
																																// k_10_sNumval의 길이가 되면 반복문 종료
			if (k_10_sNumVal.substring(k_10_i, k_10_i + 1).equals("0")) {
																																// substring 중에 0이랑 일치하는 것이 있고

				if (k_10_unitx[k_10_j].equals("만") || k_10_unitx[k_10_j].equals("억")) {
																																// 만이나 억이랑 일치하는 글자가 있다면
					k_10_sNumVoice = k_10_sNumVoice + "" + k_10_unitx[k_10_j];
																																// k_10_sNumVoice에 ""과 k_10_unitx[k_10_j]를 더한 값을 넣는다.
				} else {

				}
			} else {
				k_10_sNumVoice = k_10_sNumVoice
						+ k_10_units[Integer.parseInt(k_10_sNumVal.substring(k_10_i, k_10_i + 1))] + k_10_unitx[k_10_j];
																																// k_10_sNumVoice에 값들을 저장합니다.
			}
			k_10_i++; 																											// 증가한다
			k_10_j--; 																											// 감소한다
		}
		return k_10_sNumVoice; 

	}

}
