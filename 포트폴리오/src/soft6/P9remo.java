package soft6;

public class P9remo {  

	private int k_10_ChannelUp;
	private int k_10_ChannelDown;
	private int k_10_Channelnow;

	private int k_10_VolUp;
	private int k_10_VolDown;
	private int k_10_Volnow;

	private String k_10_help;

	P9remo() {                    //생성자에 필요한 숫자를 입력한다.
		k_10_ChannelUp = 10;
		k_10_ChannelDown = 0;
		k_10_Channelnow = 1;

		k_10_VolUp = 5;
		k_10_VolDown = 0;
		k_10_Volnow = 0;
		k_10_help = "리모컨세팅 완료";

	}

	void ChannelUp() { 								// 채널을 올리는 메소드
		if (k_10_Channelnow == k_10_ChannelUp) { // k_10_Channelnow == k_10_ChannelUp 일 때
			k_10_help = "마지막 채널입니다";     // ( )출력
		} else {
			k_10_help = String.format("[%d] 채널입니다", k_10_Channelnow);  
			k_10_Channelnow++; 					//채널 올려줌
		}
	}

	void ChannelDown() { 							//채널을 내리는 메소드
		if (k_10_Channelnow == k_10_ChannelDown) { // k_10_Channelnow == k_10_ChannelDown 일 때
			k_10_help = "첫채널입니다";  // ( )출력
		} else {
			k_10_help = String.format("[%d] 채널입니다", k_10_Channelnow);
			k_10_Channelnow--; 						// 채널 내려줌
		}
	}

	void VolUp() { 						  			//볼륨 올리는 메소드
		if (k_10_Volnow == k_10_VolUp) { 			// k_10_Volnow == k_10_VolUp 일 때
			k_10_help = "최대소리입니다";
		} else {
			k_10_Volnow++;
			k_10_help = String.format("[%d] 소리입니다", k_10_Volnow);
		}
	}

	void Voldown() { 								// 볼륨 내리는 메소드
		if (k_10_Volnow == k_10_VolDown) {			//k_10_Volnow == k_10_VolDown 라면
			k_10_help = "음소거입니다";
		} else {
			k_10_help = String.format("[%d] 소리입니다", k_10_Volnow);
			k_10_Volnow--;
		}
	}

	void Channelmsg(String k_10_id) { // 채널 메시지
		System.out.printf("%s=>[%s] 최대채널[%d] 최소채널[%d] 현재채널[%d]\n", k_10_id, k_10_help, k_10_ChannelUp, k_10_ChannelDown, k_10_Channelnow); // ( ) 출력
	}

	void Volmsg(String k_10_id) {
		System.out.printf("%s=>[%s] 최대볼륨[%d] 최소볼륨[%d] 현재볼륨[%d]\n", k_10_id, k_10_help, k_10_VolUp, k_10_VolDown, k_10_Volnow);  			// ( ) 출력
	}

}
