	package soft6;

public class P8Elev2 {
	public int k_10_limit_up_floor; 			// k_10_limit_up_floor�� int�� ����
	public int k_10_limit_down_floor;			// k_10_limit_down_floor�� int�� ����
	public int k_10_floor ;					// k_10_floor�� int�� ����
	public String k_10_help;					// k_10_help�� String�� ����
	
	P8Elev2() {
		k_10_limit_up_floor = 10;				// k_10_limit_up_floor�� 10���� ����
		k_10_limit_down_floor = 1;				// k_10_limit_down_floor�� 1�� ����	
		k_10_floor = 1;							// k_10_floor�� 1�� ����
		k_10_help = "���������� �⺻ �ذ� �Ϸ�";// k_10_help�� 	"���������� �⺻ �ذ� �Ϸ�"�� ����
	}
	
	P8Elev2(int k_10_up_floor, int k_10_d_floor, int k_10_in_floor){ // �����ε�� �ٸ� ������ ������ֱ�
		k_10_limit_up_floor = k_10_up_floor;						  //k_10_limit_up_floor�� k_10_up_floor�� ����
		k_10_limit_down_floor = k_10_d_floor;						  //k_10_limit_down_floor�� k_10_d_floor�� ����
		k_10_floor = k_10_in_floor;									  //k_10_floor�� k_10_in_floor�� ����					
		k_10_help = "���������� ���� �ذ��Ϸ�";					      // k_10_help�� "����"�� ����				
	}
	
	void up() {
		if (k_10_floor == k_10_limit_up_floor) {  												// k_10_floor�� k_10_limit_up_floor�� ���ٸ�
			k_10_help = "������ ���Դϴ�";														// k_10_help�� "������ ���Դϴ�"�� ����		
		} else {
			k_10_floor++;																		// k_10_floor����
			k_10_help = String.format("[%d] ���Դϴ�", k_10_floor); 							// ���� �ö󰡴°��� ���
		}
	}
	
	void down() {
		if (k_10_floor == k_10_limit_down_floor) {												// k_10_floor�� k_10_limit_up_floor�� ���ٸ�
			k_10_help = "ó�� ���Դϴ�";														// k_10_help�� "ó�� ���Դϴ�"�� ����	
		} else {	
			k_10_floor--;																		// k_10_floor����
			k_10_help = String.format("[%d] ���Դϴ�", k_10_floor);								// ���� �������°��� ���
		}
	}
	
	void up (int k_10_u) {																		
		for (int k_10_i = 0; k_10_i < k_10_u; k_10_i++) {										//���� ���ڸ�ŭ �ݺ�
			down();																				//down�޼ҵ带 �ҷ��´�
		}
	}
	
	void msg (String k_10_id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n",						// ( ) ���
				k_10_id, k_10_help, k_10_limit_up_floor, k_10_limit_down_floor, k_10_floor);    // ( ) ���
	}
	
}
