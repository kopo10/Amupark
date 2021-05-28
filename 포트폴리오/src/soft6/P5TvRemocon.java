package soft6;

public class P5TvRemocon {
	

	int k_10_ChannelUp = 10; 												//k_10_ChannelUp을 10으로 정의
	int k_10_ChannelDown = 1;												//k_10_ChannelDown을 1로 정의
	int k_10_VolUp = 10; 													//k_10_VolUp을 10으로 정의
	int k_10_VolDown = 0;													//k_10_VolDown을 0으로 정의
			
	int k_10_Channelnow = 1;												// k_10_Channelnow을 1로 정의
	int k_10_Volnow = 1;													// k_10_Volnow을 1로 정의	
	String k_10_help;														// k_10_help을 String으로 선언
	
	void ChannelUp() {
		if (k_10_Channelnow == k_10_ChannelUp) { 							// k_10_Channelnow와 k_10_ChannelUp이 같다면
			k_10_help = "마지막채널입니다"; 								// k_10_help를 마지막채널입니다로 정의
		} else {
			k_10_Channelnow++; 												// 최상층이 아닐 때 한층씩 올라감
			k_10_help = String.format("%d번채널입니다", k_10_Channelnow); 	// 채널이 변경된다.
		}
	}
	
	void ChannelDown() {
		if (k_10_Channelnow == k_10_ChannelDown) { 						     // k_10_Channelnow와 k_10_ChannelUp이 같다면
			k_10_help = "처음채널입니다";									// k_10_help를 처음채널입니다로 정의
		} else {										
			k_10_Channelnow--;												// 최상층이 아닐 때 한층씩 내려감
			k_10_help = String.format("%d번채널입니다", k_10_Channelnow); 	// 채널이 변경된다.
		}
	}

	void VolUp() {
		if (k_10_Volnow == k_10_VolUp) {									// k_10_Volnow와 k_10_VolUp이 같다면
			k_10_help = "최대소리입니다.";									// k_10_help를 최대소리입니다로 정의
		} else {
			k_10_Volnow++; 													// 최상층이 아닐 때 한층씩 올라감
			k_10_help = String.format("소리는%d입니다", k_10_Volnow);		// 채널이 변경된다.
		}
	}
	
void VolDown() {															
		if (k_10_Volnow == k_10_VolDown) {									// k_10_Volnow와 k_10_VolUp이 같다면
			k_10_help = "음소거입니다..";									// k_10_help를 음소거입니다로 정의
		} else {
			k_10_Volnow--;													// 최상층이 아닐 때 한층씩 내려감
			k_10_help = String.format("소리는%d입니다", k_10_Volnow);		// 채널이 변경된다.
		}
	}

	
	

}
