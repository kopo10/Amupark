package soft6;

public class PP12Overriding extends P8Elev2{

	void Repair() {
		k_10_help = String.format("�������Դϴ�"); 									//help�� �������Դϴٷ� ����
	}
	
	void up() {
		if (k_10_floor >= k_10_limit_up_floor) {									//k_10_floor >= k_10_limit_up_floor �� ��
			k_10_help = "���������Դϴ�";											//help�� ���������Դϴٷ� ����
		} else {
			k_10_floor = k_10_floor + 2;
			k_10_help = String.format("%d���Դϴ�", k_10_floor);					// 2���� �ö󰣴�.
		}
		
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("Ŭ���� �ȿ��� ��� �ִ� MSG [%s]\n", this.k_10_help);   // ( ) ���
	}
	
}
