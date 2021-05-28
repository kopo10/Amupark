	package soft6;

public class P8Elev2 {
	public int k_10_limit_up_floor; 			// k_10_limit_up_floor를 int로 선언
	public int k_10_limit_down_floor;			// k_10_limit_down_floor를 int로 선언
	public int k_10_floor ;					// k_10_floor를 int로 선언
	public String k_10_help;					// k_10_help를 String로 선언
	
	P8Elev2() {
		k_10_limit_up_floor = 10;				// k_10_limit_up_floor를 10으로 정의
		k_10_limit_down_floor = 1;				// k_10_limit_down_floor를 1로 정의	
		k_10_floor = 1;							// k_10_floor를 1로 정의
		k_10_help = "엘리베이터 기본 준공 완료";// k_10_help를 	"엘리베이터 기본 준공 완료"로 정의
	}
	
	P8Elev2(int k_10_up_floor, int k_10_d_floor, int k_10_in_floor){ // 오버로드로 다른 생성자 만들어주기
		k_10_limit_up_floor = k_10_up_floor;						  //k_10_limit_up_floor을 k_10_up_floor로 정의
		k_10_limit_down_floor = k_10_d_floor;						  //k_10_limit_down_floor을 k_10_d_floor로 정의
		k_10_floor = k_10_in_floor;									  //k_10_floor을 k_10_in_floor로 정의					
		k_10_help = "엘리베이터 맞춤 준공완료";					      // k_10_help를 "맞춤"로 정의				
	}
	
	void up() {
		if (k_10_floor == k_10_limit_up_floor) {  												// k_10_floor와 k_10_limit_up_floor가 같다면
			k_10_help = "마지막 층입니다";														// k_10_help를 "마지막 층입니다"로 정의		
		} else {
			k_10_floor++;																		// k_10_floor증가
			k_10_help = String.format("[%d] 층입니다", k_10_floor); 							// 층이 올라가는것을 출력
		}
	}
	
	void down() {
		if (k_10_floor == k_10_limit_down_floor) {												// k_10_floor와 k_10_limit_up_floor가 같다면
			k_10_help = "처음 층입니다";														// k_10_help를 "처음 층입니다"로 정의	
		} else {	
			k_10_floor--;																		// k_10_floor감소
			k_10_help = String.format("[%d] 층입니다", k_10_floor);								// 층이 내려가는것을 출력
		}
	}
	
	void up (int k_10_u) {																		
		for (int k_10_i = 0; k_10_i < k_10_u; k_10_i++) {										//받은 인자만큼 반복
			down();																				//down메소드를 불러온다
		}
	}
	
	void msg (String k_10_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",						// ( ) 출력
				k_10_id, k_10_help, k_10_limit_up_floor, k_10_limit_down_floor, k_10_floor);    // ( ) 출력
	}
	
}
