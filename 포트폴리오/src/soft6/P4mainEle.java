package soft6;

public class P4mainEle {
	private static int k_10_inVal; // private���� k_10_inVal int�� ����
	public static void up() {
		k_10_inVal++; //k_10_inVal����
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k_10_inVal); // ( ) ���
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k_10_inVal = 0; //k_10_inVal�� 0���� ����
		P4Elevater k_10_elev;
		
		k_10_elev = new P4Elevater(); // P4Elevater Ŭ���� �ҷ�����
		
		up(); //up�޼ҵ� �ҷ�����
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { //0���� 10���� �ݺ�
			k_10_elev.up(); // P4Elevater�� �ִ�up �޼ҵ� �ҷ�����
			System.out.printf("MSG[%s]\n", k_10_elev.k_10_help); // ( ) ���	
		}
		
		for(int i = 0; i < 10; i++) { // 0���� 10���� ���
			k_10_elev.down(); //P4Elevater�� �ִ� down �޼ҵ� �ҷ�����
			
			System.out.printf("MSg[%s]\n", k_10_elev.k_10_help); // ( ) ���
		}
	}

}
