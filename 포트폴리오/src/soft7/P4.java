package soft7;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String[] k_10_OneRec = { 																															// ������ �迭 k_10_OneRec�� �����ϰ� ���� �����Ѵ�.
				"����,��ž(����ö),��ž(����)", "�쵿(����)��,187,5224", "���¿�,67702,31941", "�е����ɻ��Ա���,37391,34845", "�����ֿ�,225904,64984",
				"��ȭ���翪,39541,99041", "�ݳ���4����,86431,102566", "�ݳ���5����,57753,50857", "�絿���忪,42574,30712",
				"������,29245,26934", "�󼺿�,44479,39585", "ȭ����,31696,47096", "���̿�,32700,59617", "��õ��,107993,84289",
				"�󹫿�,71421,117217", "����������Ǽ��Ϳ�,14692,32171", "���׿�,47623,34129", "����������,273014,52169",
				"���ּ�����,67461,130027", "���꿪,62237,38307", "�򵿿�,12220,126283" };

		String[] k_10_field_name = k_10_OneRec[0].split(",");
																																// ������ �迭 k_10_field_name�� �����ϰ� �ȿ� k_10_OneRec[0](����κ�)�� 
																																// �޸��� ¥�� ������ �־��ش�.
		String k_10_temp; 																										// ������ Ŭ���� k_10_temp�� �����Ѵ�	.
		for (int k_10_i = 1; k_10_i < k_10_OneRec.length; k_10_i++) {														    // for���� k_10_OneRec�� ���̸�ŭ �����ش�.

			String[] k_10_field = k_10_OneRec[k_10_i].split(",");
																																// k_10_field_�� �����ϰ� �ȿ� k_10_OneRec[k_10_i](����κ�)�� �޸��� ¥�� ������ �־��ش�.
			System.out.printf("***********************************\n"); 														// ( ) ���
			for (int k_10_j = 0; k_10_j < k_10_field_name.length; k_10_j++) { 													// for���� k17-field_name��ŭ �����ش�.
				if (k_10_j == 1) { 																								// k_10_j�� 1�̸� (�迭�ȿ� 1��° ��)
					int k_10_a = Integer.parseInt((k_10_field[k_10_j]));
																																// ���� k_10_a�� �����ϰ� k_10_field[k_10_j]�� int������ ��ȯ�� ���� �־��ش�.
					k_10_temp = printNumber(k_10_a); 																			// k_10_temp���� �޼ҵ带 �ҷ� k_10_a ���� ������ ����� �����Ѵ�.
					k_10_field[1] = k_10_field[1] + "(" + k_10_temp + ")";
																																// �迭���� 1��°�� ���ڸ� �ѱ۷�ǥ���� ����� �����Ѵ�.
				} else if (k_10_j == 2) {
					int k_10_a = Integer.parseInt((k_10_field[k_10_j]));
																																// ���� k_10_a�� �����ϰ� k_10_field[k_10_j]�� int������ ��ȯ�� ���� �־��ش�.
					k_10_temp = printNumber(k_10_a); 																			// k_10_temp���� �޼ҵ带 �ҷ� k_10_a ���� ������ ����� �����Ѵ�.
					k_10_field[2] = k_10_field[2] + "(" + k_10_temp + ")";
																																// �迭���� 2��°�� ���ڸ� �ѱ۷�ǥ���� ����� �����Ѵ�.
				}
				System.out.printf(" %s : %s\n", k_10_field_name[k_10_j], k_10_field[k_10_j]);									 // ( ) ���
			}
			System.out.printf("***********************************\n");															 // ( ) ���
		}
	}

	public static String printNumber(int k_10_iNumVal) {

		String k_10_sNumVal = String.valueOf(k_10_iNumVal);																		 // ���� valueof()�޼ҵ带 �̿��� StringŸ������ ����ȯ��

		String k_10_sNumVoice = ""; 																							// String���� k10_sNumVoice�� null�� ����

																																// ��Ʈ������ ����ȭ ��Ų "1001034567"�� �� ������ 10 ���
		int k_10_i, k_10_j; 																									// ������ ������ k02_i,k02_j ����

		String[] k_10_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
																																// k02_units������ ��Ʈ���迭 ����� 10�̰� ������ ����
		String[] k_10_unitx = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
																																//k02_unit�������� ��Ʈ���迭 ����� 10�̰� ������ ����

		k_10_i = 0; 																											// k02_i������ 0���� �ʱ�ȭ
		k_10_j = k_10_sNumVal.length() - 1; 																					// -1�� ���������� �迭�� ���ؽ���ȣ 0���� �����ϱ� ������ -1�� ����

		while (true) { 
			if (k_10_i >= k_10_sNumVal.length())
				break;
																																// k_10_sNumval�� ���̰� �Ǹ� �ݺ��� ����
			if (k_10_sNumVal.substring(k_10_i, k_10_i + 1).equals("0")) {
																																// substring �߿� 0�̶� ��ġ�ϴ� ���� �ְ�

				if (k_10_unitx[k_10_j].equals("��") || k_10_unitx[k_10_j].equals("��")) {
																																// ���̳� ���̶� ��ġ�ϴ� ���ڰ� �ִٸ�
					k_10_sNumVoice = k_10_sNumVoice + "" + k_10_unitx[k_10_j];
																																// k_10_sNumVoice�� ""�� k_10_unitx[k_10_j]�� ���� ���� �ִ´�.
				} else {

				}
			} else {
				k_10_sNumVoice = k_10_sNumVoice
						+ k_10_units[Integer.parseInt(k_10_sNumVal.substring(k_10_i, k_10_i + 1))] + k_10_unitx[k_10_j];
																																// k_10_sNumVoice�� ������ �����մϴ�.
			}
			k_10_i++; 																											// �����Ѵ�
			k_10_j--; 																											// �����Ѵ�
		}
		return k_10_sNumVoice; 

	}

}
