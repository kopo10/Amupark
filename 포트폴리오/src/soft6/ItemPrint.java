package soft6;

import java.text.DecimalFormat;

public class ItemPrint {

	public void Print(int k_10_z) {
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // �� ������ ��Ÿ���� ���� Ŭ����
		String[] k_10itemname = { "123420���׽�Ʈ��a��11ĥ555", "ab��asdadad��īĨ", "ddd���ڼ�����ġss��ġ", "��a�ù�aġ��a��a��a��aa", "ġ���������", // item�̸���
																														// //
																														// �迭�̴�
				"abc12119", "�������������", "������Ŀ��()a", "��Ƽ���ƾ�", "��1��2��3��4������6��7��8", "�����ι�°����", "(���̹�����Ʈ����", "aaa����Ŭ����������",
				"55��īĨ��Ͼ��", "�����¶�����", "ȣ���̵θ���ġŲ", "����ġŲ�ſ��", "��������øŰ�", "�����������", "�����ġ�佺", "��Ȧ��������Ʈ", "�ڹ�Ĩ��Ʈ�¸�����",
				"��������������", "�ڹٿ��̵�", "���̾�Ʈ�ڹ�", "�̰Ž���������", "���������ڼ�Ʈ", "������ﰢ���", "�Ŷ��¥���", "��������ġ" };
		// �̸�,����,���� �迭�� ���߿�
		// ��
		// ���Ұ��̱� ������ �� �迭��
		// ũ��� ���ƾ��Ѵ�.

		int[] k_10price = { 1000, 1000000, 1000000, 1000000, 11000, 1600, 1700, 1800, 1900, 2000, // ������ ��ǰ�� ���� �Է�
				2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000, // ������ ��ǰ�� ���� �Է�
				3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // ������ ��ǰ ���� �Է�
		int[] k_10units = { 10, 10, 10, 10, 10, 1, 8, 1, 1, 1, 1, 4, 1, 1, 2, 6, 1, 1, 6, 1, 6, 1, 5, 1, 1, 2, 1, 4, 1,
				1 }; // ������
		// ��ǰ
		// ������
		// �Է�
		boolean[] k_10taxfree = { false, false, true, true, false, true, true, true, true, false, true, true, true,
				true, true, true, false, true, true, true, true, true, false, true, true, false, true, false, true,
				true }; // ������ǰ��
						// �������ǰ
						// ����
						// boolean
		int[] k_10total_price_sneak = new int[k_10itemname.length]; // �� ���ڱݾ��� �迭 ����� ����
		String[] k_10mark_check_free = { "*" }; // �������ǰ�� ���� ǥ�ø� ���� �迭
		String[] k_10make_space = { " " }; // ����� ��ǰ�� ĭ�� ���߱� ���� �迭
		
		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i�� 0���� 29���� ����
			k_10total_price_sneak[k_10i] += k_10price[k_10i] * k_10units[k_10i]; // ��ǰ ���ݰ� ��ǰ ������ �����ش�.
			if (k_10taxfree[k_10i] == true) { // �ش� ��ǰ�� �������
				k_10itemname[k_10i] = k_10mark_check_free[0] + k_10itemname[k_10i]; // ������� " " ������ ������ش�
			} else { // �鼼ǰ���̶��
				k_10itemname[k_10i] = k_10make_space[0] + k_10itemname[k_10i]; // �鼼ǰ���ΰ� ǥ�� �� " * "�� �����ش�.
			} // �ݱ�
		} // �ݱ�
		
		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i�� itemũ�⸸ŭ �� ��
			int lengthdiff = k_10itemname[k_10i].length() - 9; // ���� ����
			// System.out.println("lendiff : " +k_10i +" ++ "+lengthdiff);

			if (lengthdiff > 0 && k_10itemname[k_10i].getBytes().length > 18) { // lengthdiff�� 0���� ũ�� �� ���ڼ���
																				// 9���ڷ�(18����Ʈ)�� �ϰ� �ͱ� ������
				// System.out.println(k_10i + k_10itemname[k_10i]); //18���� �۴ٸ�
				for (int k_10k = 0; k_10k <= lengthdiff; k_10k++) { // lengthdiff���̸�ŭ �ݺ����ش�.
					// System.out.println("k : " + k_10i);
					if (k_10itemname[k_10i].substring(0, 9 + k_10k).getBytes().length == 17) { // lengthdiff��ŭ ���
																								// substring �����ϴٰ� ����Ʈ��
																								// 17�� �ȴٸ�
						if (k_10itemname[k_10i].substring(9 + k_10k, 9 + k_10k + 1).getBytes().length == 2) { // �ΰ�����
																												// ������
																												// �״���
																												// ����
																												// ũ��(�ѱ�)��
																												// 2�̶��
							k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k) + " "; // �״�� ������ְ� + " "��
																										// ���ش�.
							// System.out.println("## " + k_10itemname[k_10i]);
							break;

						} else {
							k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k + 1); // ����Ʈ�� 1(����Ǵ�
																									// Ư������)��� �̰ͱ���
																									// ������ش�.
							// System.out.println("@@ " + k_10itemname[k_10i]);
							break;
						}
					} else if (k_10itemname[k_10i].substring(0, 9 + k_10k).getBytes().length == 18) { // 18�� ���´ٸ�
						k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 9 + k_10k); // �״�� ������ش�.
						// System.out.println("** " + k_10itemname[k_10i]);
						break;
					}

				}

			} else { // lengthdiff > 0 && k_10itemname[k_10i].getBytes().length > 18�̶��

				int k_10num = 18 - k_10itemname[k_10i].getBytes().length; // �״�� ������ش�.

				for (int k_10j = 0; k_10j < k_10num; k_10j++) { // ������ ���ڶ� ����Ʈ��
					k_10itemname[k_10i] += " "; // " "�� �ش�.
				}
			}

		}

		

		//for (int k_10z = 0; k_10z < k_10itemname.length; k_10z++) { // i�� 0 ���� 29���� ��� (��ǰ�� 30�� �����ϱ�)
			if (k_10_z % 5 == 0 && k_10_z != 0) { // 6��°���� ������� ----�� ��������ν� ���� 5������ �ٷ� �����ش�.
				System.out.printf("-----------------------------------------\n"); // ( ) ���
			}
			System.out.printf("%s%9s %2s %10s\n", k_10itemname[k_10_z], k_10df.format(k_10price[k_10_z]),
					k_10df.format(k_10units[k_10_z]), k_10df.format(k_10total_price_sneak[k_10_z])); // ���� �ݾ� ���� �� ���� ���
		//}
	} // ����
}
