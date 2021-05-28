package soft6;

public class P8Elevmain {

	static P8Elev2 k_10_eLev1;
	static P8Elev2 k_10_eLev2;
	static P8Elev2 k_10_eLev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k_10_eLev1 = new P8Elev2(); 					// 인자가 없는 P8Elev2 생성자 불러오기
		k_10_eLev2 = new P8Elev2(20, 1, 8);				// 인자가 있는 P8Elev2 생성자 불러오기
		k_10_eLev3 = new P8Elev2(50, -3, 5);			// 인자가 있는 P8Elev2 생성자 불러오기

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {  // 10번 반복
			k_10_eLev1.up(); 							// up 메소드 불러오기
			k_10_eLev1.msg("1번엘레 한층 오르기");      // msg 메소드 불러오기
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {	// 10번 반복
			k_10_eLev1.up(2);							// up 메소드 불러오기
			k_10_eLev1.msg("1번엘레 2층씩 오르기");		// msg 메소드 불러오기
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {	// 10번 반복
			k_10_eLev1.up(3);							// up 메소드 불러오기
			k_10_eLev1.msg("1번엘레 3층씩 오르기");		// msg 메소드 불러오기
		}

	}

}
