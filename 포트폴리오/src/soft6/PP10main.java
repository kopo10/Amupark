package soft6;

public class PP10main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PP10Inheritance k_10_elev3;
		
		k_10_elev3 = new PP10Inheritance();
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 					 // 10�� �ݺ�
			k_10_elev3.up();
			System.out.printf("MSG elev3[%s]\n", k_10_elev3.k_10_help); // ( ) ���
		}
		
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {
			k_10_elev3.down();
			System.out.printf("MSG elev3[%s]\n", k_10_elev3.k_10_help); // ( ) ���
		}
		k_10_elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", k_10_elev3.k_10_help);		// ( ) ���
		
	}

}
