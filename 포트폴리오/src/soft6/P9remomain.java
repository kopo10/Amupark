package soft6;

public class P9remomain {

		static P9remo k_10_remo1;
		static P9remo k_10_remo2;
		static P9remo k_10_remo3;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			k_10_remo1 = new P9remo();
//			remo2 = new P9remo(20, 1, 8);
//			remo3 = new P9remo(50, -3, 5);

			for (int k_10_i = 0; k_10_i < 10; k_10_i++) {  // 10�� �ݺ�
				k_10_remo1.ChannelUp();
				k_10_remo1.Channelmsg("ä�� �ø���");
			}

			for (int k_10_i = 0; k_10_i < 11; k_10_i++) {  // 11�� �ݺ�
				k_10_remo1.ChannelDown();
				k_10_remo1.Channelmsg("ä�� ������");
			}

			for (int k_10_i = 0; k_10_i < 5; k_10_i++) {   // 5�� �ݺ�
				k_10_remo1.VolUp();
				k_10_remo1.Volmsg("�Ҹ� �ø���");
			}
			
			for (int k_10_i = 0; k_10_i < 6; k_10_i++) {   // 6�� �ݺ�
				k_10_remo1.Voldown();
				k_10_remo1.Volmsg("�Ҹ� ������");
			}
		}

}
