package soft6;

public class P5TvRemocon {
	

	int k_10_ChannelUp = 10; 												//k_10_ChannelUp�� 10���� ����
	int k_10_ChannelDown = 1;												//k_10_ChannelDown�� 1�� ����
	int k_10_VolUp = 10; 													//k_10_VolUp�� 10���� ����
	int k_10_VolDown = 0;													//k_10_VolDown�� 0���� ����
			
	int k_10_Channelnow = 1;												// k_10_Channelnow�� 1�� ����
	int k_10_Volnow = 1;													// k_10_Volnow�� 1�� ����	
	String k_10_help;														// k_10_help�� String���� ����
	
	void ChannelUp() {
		if (k_10_Channelnow == k_10_ChannelUp) { 							// k_10_Channelnow�� k_10_ChannelUp�� ���ٸ�
			k_10_help = "������ä���Դϴ�"; 								// k_10_help�� ������ä���Դϴٷ� ����
		} else {
			k_10_Channelnow++; 												// �ֻ����� �ƴ� �� ������ �ö�
			k_10_help = String.format("%d��ä���Դϴ�", k_10_Channelnow); 	// ä���� ����ȴ�.
		}
	}
	
	void ChannelDown() {
		if (k_10_Channelnow == k_10_ChannelDown) { 						     // k_10_Channelnow�� k_10_ChannelUp�� ���ٸ�
			k_10_help = "ó��ä���Դϴ�";									// k_10_help�� ó��ä���Դϴٷ� ����
		} else {										
			k_10_Channelnow--;												// �ֻ����� �ƴ� �� ������ ������
			k_10_help = String.format("%d��ä���Դϴ�", k_10_Channelnow); 	// ä���� ����ȴ�.
		}
	}

	void VolUp() {
		if (k_10_Volnow == k_10_VolUp) {									// k_10_Volnow�� k_10_VolUp�� ���ٸ�
			k_10_help = "�ִ�Ҹ��Դϴ�.";									// k_10_help�� �ִ�Ҹ��Դϴٷ� ����
		} else {
			k_10_Volnow++; 													// �ֻ����� �ƴ� �� ������ �ö�
			k_10_help = String.format("�Ҹ���%d�Դϴ�", k_10_Volnow);		// ä���� ����ȴ�.
		}
	}
	
void VolDown() {															
		if (k_10_Volnow == k_10_VolDown) {									// k_10_Volnow�� k_10_VolUp�� ���ٸ�
			k_10_help = "���Ұ��Դϴ�..";									// k_10_help�� ���Ұ��Դϴٷ� ����
		} else {
			k_10_Volnow--;													// �ֻ����� �ƴ� �� ������ ������
			k_10_help = String.format("�Ҹ���%d�Դϴ�", k_10_Volnow);		// ä���� ����ȴ�.
		}
	}

	
	

}
