package soft6;

public class P4Elevater {
	int k_10_limit_up_floor = 10; //k_10_limit_up_floor�� 10���� ����
	int k_10_limit_down_floor = 0; //k_10_limit_down_floor�� 0���� ����
	int k_10_floor = 1; // k_10_floor�� 1�� ����
	String k_10_help; //k_10_help�� String ���� ����
	
	void up() {
		if (k_10_floor == k_10_limit_up_floor) { //k_10_floor�� k_10_limit_up_floor�� ���ٸ�
			k_10_help = "���������Դϴ�"; // k_10_help�� ���������Դϴ� 
		} else { //�ƴҽ�
			k_10_floor++; // �ֻ����� �ƴ� �� ������ �ö�
			k_10_help = String.format("%d���Դϴ�", k_10_floor); //k_10_help�� 1���ö� ���̶�� �˷��ش�.
		}
	}
	
	void down() {
		if (k_10_floor == k_10_limit_down_floor) { //k_10_floor�� k_10_limit_up_floor�� ���ٸ�
			k_10_help = "ó�����Դϴ�."; // k_10_help�� ���������Դϴ� 
		} else { //�ƴҽ�
			k_10_floor--;// �������� �ƴ� �� ������ �ö�
			k_10_help = String.format("%d���Դϴ�", k_10_floor);  //k_10_help�� 1�������� ���̶�� �˷��ش�.
		}
	}
}
