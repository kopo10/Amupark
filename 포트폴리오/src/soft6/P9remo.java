package soft6;

public class P9remo {  

	private int k_10_ChannelUp;
	private int k_10_ChannelDown;
	private int k_10_Channelnow;

	private int k_10_VolUp;
	private int k_10_VolDown;
	private int k_10_Volnow;

	private String k_10_help;

	P9remo() {                    //�����ڿ� �ʿ��� ���ڸ� �Է��Ѵ�.
		k_10_ChannelUp = 10;
		k_10_ChannelDown = 0;
		k_10_Channelnow = 1;

		k_10_VolUp = 5;
		k_10_VolDown = 0;
		k_10_Volnow = 0;
		k_10_help = "���������� �Ϸ�";

	}

	void ChannelUp() { 								// ä���� �ø��� �޼ҵ�
		if (k_10_Channelnow == k_10_ChannelUp) { // k_10_Channelnow == k_10_ChannelUp �� ��
			k_10_help = "������ ä���Դϴ�";     // ( )���
		} else {
			k_10_help = String.format("[%d] ä���Դϴ�", k_10_Channelnow);  
			k_10_Channelnow++; 					//ä�� �÷���
		}
	}

	void ChannelDown() { 							//ä���� ������ �޼ҵ�
		if (k_10_Channelnow == k_10_ChannelDown) { // k_10_Channelnow == k_10_ChannelDown �� ��
			k_10_help = "ùä���Դϴ�";  // ( )���
		} else {
			k_10_help = String.format("[%d] ä���Դϴ�", k_10_Channelnow);
			k_10_Channelnow--; 						// ä�� ������
		}
	}

	void VolUp() { 						  			//���� �ø��� �޼ҵ�
		if (k_10_Volnow == k_10_VolUp) { 			// k_10_Volnow == k_10_VolUp �� ��
			k_10_help = "�ִ�Ҹ��Դϴ�";
		} else {
			k_10_Volnow++;
			k_10_help = String.format("[%d] �Ҹ��Դϴ�", k_10_Volnow);
		}
	}

	void Voldown() { 								// ���� ������ �޼ҵ�
		if (k_10_Volnow == k_10_VolDown) {			//k_10_Volnow == k_10_VolDown ���
			k_10_help = "���Ұ��Դϴ�";
		} else {
			k_10_help = String.format("[%d] �Ҹ��Դϴ�", k_10_Volnow);
			k_10_Volnow--;
		}
	}

	void Channelmsg(String k_10_id) { // ä�� �޽���
		System.out.printf("%s=>[%s] �ִ�ä��[%d] �ּ�ä��[%d] ����ä��[%d]\n", k_10_id, k_10_help, k_10_ChannelUp, k_10_ChannelDown, k_10_Channelnow); // ( ) ���
	}

	void Volmsg(String k_10_id) {
		System.out.printf("%s=>[%s] �ִ뺼��[%d] �ּҺ���[%d] ���纼��[%d]\n", k_10_id, k_10_help, k_10_VolUp, k_10_VolDown, k_10_Volnow);  			// ( ) ���
	}

}
