package soft6;

public class P5Tvmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P5TvRemocon k_10_remo;

		k_10_remo = new P5TvRemocon(); 							   //P5TvRemocon Ŭ���� �ҷ�����

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 		       // 0���� 10���� �ݺ�
			k_10_remo.ChannelUp();                                 // P5TvRemocon Ŭ������ ChannelUp �޼ҵ� �ҷ�����
			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);  // ( ) ���
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 			  // 10�� �ݺ�
			k_10_remo.ChannelDown(); 							  //P5TvRemocon Ŭ������ Channeldown �޼ҵ� �ҷ�����

			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);  // ( ) ���
		}
		
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 		      // 10�� �ݺ�
			k_10_remo.VolUp(); 									  //P5TvRemocon Ŭ������ VolUp �޼ҵ� �ҷ����� 
			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 			  // 10�� �ݺ�
			k_10_remo.VolDown();								  //P5TvRemocon Ŭ������ VolDown �޼ҵ� �ҷ����� 

			System.out.printf("MSG[%s]\n", k_10_remo.k_10_help);  // ( ) ���
		}
	}
}
