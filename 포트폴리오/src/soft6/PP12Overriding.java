package soft6;

public class PP12Overriding extends P8Elev2{

	void Repair() {
		k_10_help = String.format("수리중입니다"); 									//help를 수리중입니다로 정의
	}
	
	void up() {
		if (k_10_floor >= k_10_limit_up_floor) {									//k_10_floor >= k_10_limit_up_floor 일 때
			k_10_help = "마지막층입니다";											//help를 마지막층입니다로 정의
		} else {
			k_10_floor = k_10_floor + 2;
			k_10_help = String.format("%d층입니다", k_10_floor);					// 2층씩 올라간다.
		}
		
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍고 있는 MSG [%s]\n", this.k_10_help);   // ( ) 출력
	}
	
}
