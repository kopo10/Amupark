package soft6;

public class P8Elevmain {

	static P8Elev2 k_10_eLev1;
	static P8Elev2 k_10_eLev2;
	static P8Elev2 k_10_eLev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k_10_eLev1 = new P8Elev2(); 					// ���ڰ� ���� P8Elev2 ������ �ҷ�����
		k_10_eLev2 = new P8Elev2(20, 1, 8);				// ���ڰ� �ִ� P8Elev2 ������ �ҷ�����
		k_10_eLev3 = new P8Elev2(50, -3, 5);			// ���ڰ� �ִ� P8Elev2 ������ �ҷ�����

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {  // 10�� �ݺ�
			k_10_eLev1.up(); 							// up �޼ҵ� �ҷ�����
			k_10_eLev1.msg("1������ ���� ������");      // msg �޼ҵ� �ҷ�����
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {	// 10�� �ݺ�
			k_10_eLev1.up(2);							// up �޼ҵ� �ҷ�����
			k_10_eLev1.msg("1������ 2���� ������");		// msg �޼ҵ� �ҷ�����
		}

		for (int k_10_i = 0; k_10_i < 10; k_10_i++) {	// 10�� �ݺ�
			k_10_eLev1.up(3);							// up �޼ҵ� �ҷ�����
			k_10_eLev1.msg("1������ 3���� ������");		// msg �޼ҵ� �ҷ�����
		}

	}

}
