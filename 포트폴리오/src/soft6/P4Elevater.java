package soft6;

public class P4Elevater {
	int k_10_limit_up_floor = 10; //k_10_limit_up_floor을 10으로 정의
	int k_10_limit_down_floor = 0; //k_10_limit_down_floor을 0으로 정의
	int k_10_floor = 1; // k_10_floor을 1로 정의
	String k_10_help; //k_10_help을 String 으로 선언
	
	void up() {
		if (k_10_floor == k_10_limit_up_floor) { //k_10_floor와 k_10_limit_up_floor이 같다면
			k_10_help = "마지막층입니다"; // k_10_help는 마지막층입니다 
		} else { //아닐시
			k_10_floor++; // 최상층이 아닐 때 한층씩 올라감
			k_10_help = String.format("%d층입니다", k_10_floor); //k_10_help는 1층올라간 층이라고 알려준다.
		}
	}
	
	void down() {
		if (k_10_floor == k_10_limit_down_floor) { //k_10_floor와 k_10_limit_up_floor이 같다면
			k_10_help = "처음층입니다."; // k_10_help는 마지막층입니다 
		} else { //아닐시
			k_10_floor--;// 최하층이 아닐 때 한층씩 올라감
			k_10_help = String.format("%d층입니다", k_10_floor);  //k_10_help는 1층내려간 층이라고 알려준다.
		}
	}
}
