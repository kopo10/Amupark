package soft5;

public class soft9Wearther2 {

	public String seq(String k_10_seq) {
		k_10_seq = k_10_seq + "��";
		if (k_10_seq.getBytes().length < 4) { // seq�� 4���� �۴ٸ�
			k_10_seq = k_10_seq + " "; // seq�� " " + seq ������
		}
		return k_10_seq; // ����
	}

	public String hour(String k_10_hour) {
		k_10_hour = k_10_hour + "�ð�";
		if (k_10_hour.getBytes().length < 6) { // hour�� 6���� �۴ٸ�
			k_10_hour = k_10_hour + " "; // hour�� " " + hour ������
		}

		return k_10_hour; // ����
	}

	public String day(String k_10_day) {
		if (k_10_day.getBytes().length < 4) { // day�� 4���� �۴ٸ�
			k_10_day = k_10_day + " "; // day�� day + " " ������
		}
		return k_10_day; // ����
	}

	public String temp(String k_10_temp) {
		k_10_temp = k_10_temp + "��";
		if (k_10_temp.getBytes().length < 6) { // temp�� 5���� �۴ٸ�
			for (int i = k_10_temp.getBytes().length; i < 6; i++) { // 5���� temp����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_temp = k_10_temp + " "; // k_10_temp�� " " + k_10_temp ������
			}
		}
		return k_10_temp; // ����
	}

	public String tmx(String k_10_tmx) {
		k_10_tmx = k_10_tmx + "��";
		if (k_10_tmx.getBytes().length < 8) { // tmx�� 8���� �۴ٸ�
			for (int k_10_i = k_10_tmx.getBytes().length; k_10_i < 8; k_10_i++) { // 7���� k_10_tmx����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_tmx = k_10_tmx + " "; // tmx�� " " + tmx ������
			}
		}
		return k_10_tmx; // ����
	}

	public String tmn(String k_10_tmn) {
		k_10_tmn = k_10_tmn + "��";
		if (k_10_tmn.getBytes().length < 8) { // tmn�� 8���� �۴ٸ�
			for (int k_10_i = k_10_tmn.getBytes().length; k_10_i < 8; k_10_i++) { // 7���� k_10_tmn����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_tmn = k_10_tmn + " "; // tmn�� " " + tmn ������
			}
		}
		return k_10_tmn; // ����
	}

	public String sky(String k_10_sky) {
		if (k_10_sky.getBytes().length < 8) { // sky�� 8���� �۴ٸ�
			for (int k_10_i = k_10_sky.getBytes().length; k_10_i < 8; k_10_i++) { // 8���� k_10_sky����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_sky = k_10_sky + " "; // sky�� sky + " " ������
			}
		}
		return k_10_sky; // ����
	}

	public String pty(String k_10_pty) {
		if (k_10_pty.getBytes().length < 7) { // pty�� 7���� �۴ٸ�
			for (int k_10_i = k_10_pty.getBytes().length; k_10_i < 7; k_10_i++) { // 7���� k_10_pty����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_pty = k_10_pty + " "; // pty�� pty + " " ������
			}
		}
		return k_10_pty; // ����
	}

	public String wfKor(String k_10_wfKor) {
		if (k_10_wfKor.getBytes().length < 13) { // wfKor�� 13���� �۴ٸ�
			for (int k_10_i = k_10_wfKor.getBytes().length; k_10_i < 13; k_10_i++) { // 13���� k_10_wfKor����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_wfKor = k_10_wfKor + " "; // wfKor�� wfKor + " " ������
			}
		}
		return k_10_wfKor; // ����
	}

	public String wfEn(String k_10_wfEn) {
		if (k_10_wfEn.getBytes().length < 13) { // wfEn�� 13���� �۴ٸ�
			for (int k_10_i = k_10_wfEn.getBytes().length; k_10_i < 13; k_10_i++) { // 13���� k_10_wfEn����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_wfEn = k_10_wfEn + " "; // wfEn�� wfEn + " " ������
			}
		}
		return k_10_wfEn; // ����
	}

	public String pop(String k_10_pop) {
		if (k_10_pop.getBytes().length < 2) { // pop�� 2���� �۴ٸ�
			for (int k_10_i = k_10_pop.getBytes().length; k_10_i < 2; k_10_i++) { // 2���� k_10_pop����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_pop = k_10_pop + " "; // pop�� pop + " " ������
			}
		}
		return k_10_pop; // ����
	}

	public String r12(String k_10_r12) {
		if (k_10_r12.getBytes().length < 3) { // r12�� 3���� �۴ٸ�
			for (int k_10_i = k_10_r12.getBytes().length; k_10_i < 3; k_10_i++) { // 3���� k_10_r12����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_r12 = k_10_r12 + " "; // r12�� r12 + " " ������
			}
		}
		return k_10_r12; // ����
	}

	public String s12(String k_10_s12) {
		if (k_10_s12.getBytes().length < 3) { // s12�� 3���� �۴ٸ�
			for (int k_10_i = k_10_s12.getBytes().length; k_10_i < 3; k_10_i++) { // 3���� k_10_s12����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_s12 = k_10_s12 + " "; // s12�� s12 + " " ������
			}
		}
		return k_10_s12; // ����
	}

	public String ws(String k_10_ws) {
		if (k_10_ws.getBytes().length < 20) { // ws�� 20���� �۴ٸ�
			for (int k_10_i = k_10_ws.getBytes().length; k_10_i < 20; k_10_i++) { // 20���� k_10_ws����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_ws = k_10_ws + " "; // ws�� ws + " " ������
			}
		}
		return k_10_ws; // ����
	}

	public String wd(String k_10_wd) {
		if (k_10_wd.getBytes().length < 4) { // wd�� 4���� �۴ٸ�
			for (int k_10_i = k_10_wd.getBytes().length; k_10_i < 1; k_10_i++) { // 4���� k_10_wd����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_wd = " " + k_10_wd; // wd�� " " + wd ������
			}
		}
		return k_10_wd; // ����
	}

	public String wdKor(String k_10_wdKor) {
		if (k_10_wdKor.getBytes().length < 4) { // wdKor�� 4���� �۴ٸ�
			for (int k_10_i = k_10_wdKor.getBytes().length; k_10_i < 4; k_10_i++) { // 4���� k_10_wdKor����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_wdKor = k_10_wdKor + " "; // wdKor�� wdKor + " " ������
			}
		}
		return k_10_wdKor; // ����
	}

	public String wdEn(String k_10_wdEn) {
		if (k_10_wdEn.getBytes().length < 2) { // wdEn�� 2���� �۴ٸ�
			for (int k_10_i = k_10_wdEn.getBytes().length; k_10_i < 2; k_10_i++) { // 2���� k_10_wdEn����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_wdEn = k_10_wdEn + " "; // wdEn�� wdEn + " " ������
			}
		}
		return k_10_wdEn; // ����
	}

	public String reh(String k_10_reh) {
		if (k_10_reh.getBytes().length < 2) { // reh�� 2���� �۴ٸ�
			for (int k_10_i = k_10_reh.getBytes().length; k_10_i < 2; k_10_i++) { // 2���� k_10_reh����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_reh = k_10_reh + " "; // reh�� reh + " " ������
			}
		}
		return k_10_reh; // ����
	}

	public String r06(String k_10_r06) {
		if (k_10_r06.getBytes().length < 3) { // r06�� 3���� �۴ٸ�
			for (int k_10_i = k_10_r06.getBytes().length; k_10_i < 3; k_10_i++) { // 3���� k_10_r06����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_r06 = k_10_r06 + " "; // r06�� r06 + " " ������
			}
		}
		return k_10_r06; // ����
	}

	public String s06(String k_10_s06) {
		if (k_10_s06.getBytes().length < 3) { // s06�� 3���� �۴ٸ�
			for (int k_10_i = k_10_s06.getBytes().length; k_10_i < 3; k_10_i++) { // 3���� k_10_s06����Ʈũ�⸸ŭ ������ �ݺ�

				k_10_s06 = k_10_s06 + " "; // s06�� s06 + " " ������
			}
		}
		return k_10_s06; // ����
	}

}
