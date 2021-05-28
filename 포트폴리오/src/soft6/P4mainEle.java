package soft6;

public class P4mainEle {
	private static int k_10_inVal; // private으로 k_10_inVal int로 선언
	public static void up() {
		k_10_inVal++; //k_10_inVal증가
		System.out.printf("난 그냥 메소드[%d]\n", k_10_inVal); // ( ) 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k_10_inVal = 0; //k_10_inVal를 0으로 정의
		P4Elevater k_10_elev;
		
		k_10_elev = new P4Elevater(); // P4Elevater 클래스 불러오기
		
		up(); //up메소드 불러오기
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { //0부터 10까지 반복
			k_10_elev.up(); // P4Elevater에 있는up 메소드 불러오기
			System.out.printf("MSG[%s]\n", k_10_elev.k_10_help); // ( ) 출력	
		}
		
		for(int i = 0; i < 10; i++) { // 0부터 10까지 출력
			k_10_elev.down(); //P4Elevater에 있는 down 메소드 불러오기
			
			System.out.printf("MSg[%s]\n", k_10_elev.k_10_help); // ( ) 출력
		}
	}

}
