package soft6;

public class PP10main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PP10Inheritance k_10_elev3;
		
		k_10_elev3 = new PP10Inheritance();
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) { 					 // 10번 반복
			k_10_elev3.up();
			System.out.printf("MSG elev3[%s]\n", k_10_elev3.k_10_help); // ( ) 출력
		}
		
		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {
			k_10_elev3.down();
			System.out.printf("MSG elev3[%s]\n", k_10_elev3.k_10_help); // ( ) 출력
		}
		k_10_elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", k_10_elev3.k_10_help);		// ( ) 출력
		
	}

}
