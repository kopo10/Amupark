package soft6;

public class P5Tvmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P5TvRemocon k_10_remo;

		k_10_remo = new P5TvRemocon(); 							   //P5TvRemocon 클래스 불러오기

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 		       // 0부터 10까지 반복
			k_10_remo.ChannelUp();                                 // P5TvRemocon 클래스의 ChannelUp 메소드 불러오기
			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);  // ( ) 출력
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 			  // 10번 반복
			k_10_remo.ChannelDown(); 							  //P5TvRemocon 클래스의 Channeldown 메소드 불러오기

			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);  // ( ) 출력
		}
		
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 		      // 10번 반복
			k_10_remo.VolUp(); 									  //P5TvRemocon 클래스의 VolUp 메소드 불러오기 
			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 			  // 10번 반복
			k_10_remo.VolDown();								  //P5TvRemocon 클래스의 VolDown 메소드 불러오기 

			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);  // ( ) 출력
		}
	}
}
