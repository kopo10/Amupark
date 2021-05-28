package soft5;

public class soft9Wearther2 {

	public String seq(String k_10_seq) {
		k_10_seq = k_10_seq + "번";
		if (k_10_seq.getBytes().length < 4) { // seq가 4보다 작다면
			k_10_seq = k_10_seq + " "; // seq를 " " + seq 재정의
		}
		return k_10_seq; // 리턴
	}

	public String hour(String k_10_hour) {
		k_10_hour = k_10_hour + "시간";
		if (k_10_hour.getBytes().length < 6) { // hour가 6보다 작다면
			k_10_hour = k_10_hour + " "; // hour를 " " + hour 재정의
		}

		return k_10_hour; // 리턴
	}

	public String day(String k_10_day) {
		if (k_10_day.getBytes().length < 4) { // day가 4보다 작다면
			k_10_day = k_10_day + " "; // day를 day + " " 재정의
		}
		return k_10_day; // 리턴
	}

	public String temp(String k_10_temp) {
		k_10_temp = k_10_temp + "℃";
		if (k_10_temp.getBytes().length < 6) { // temp가 5보다 작다면
			for (int i = k_10_temp.getBytes().length; i < 6; i++) { // 5에서 temp바이트크기만큼 뺀값을 반복

				k_10_temp = k_10_temp + " "; // k_10_temp를 " " + k_10_temp 재정의
			}
		}
		return k_10_temp; // 리턴
	}

	public String tmx(String k_10_tmx) {
		k_10_tmx = k_10_tmx + "℃";
		if (k_10_tmx.getBytes().length < 8) { // tmx가 8보다 작다면
			for (int k_10_i = k_10_tmx.getBytes().length; k_10_i < 8; k_10_i++) { // 7에서 k_10_tmx바이트크기만큼 뺀값을 반복

				k_10_tmx = k_10_tmx + " "; // tmx를 " " + tmx 재정의
			}
		}
		return k_10_tmx; // 리턴
	}

	public String tmn(String k_10_tmn) {
		k_10_tmn = k_10_tmn + "℃";
		if (k_10_tmn.getBytes().length < 8) { // tmn가 8보다 작다면
			for (int k_10_i = k_10_tmn.getBytes().length; k_10_i < 8; k_10_i++) { // 7에서 k_10_tmn바이트크기만큼 뺀값을 반복

				k_10_tmn = k_10_tmn + " "; // tmn를 " " + tmn 재정의
			}
		}
		return k_10_tmn; // 리턴
	}

	public String sky(String k_10_sky) {
		if (k_10_sky.getBytes().length < 8) { // sky가 8보다 작다면
			for (int k_10_i = k_10_sky.getBytes().length; k_10_i < 8; k_10_i++) { // 8에서 k_10_sky바이트크기만큼 뺀값을 반복

				k_10_sky = k_10_sky + " "; // sky를 sky + " " 재정의
			}
		}
		return k_10_sky; // 리턴
	}

	public String pty(String k_10_pty) {
		if (k_10_pty.getBytes().length < 7) { // pty가 7보다 작다면
			for (int k_10_i = k_10_pty.getBytes().length; k_10_i < 7; k_10_i++) { // 7에서 k_10_pty바이트크기만큼 뺀값을 반복

				k_10_pty = k_10_pty + " "; // pty를 pty + " " 재정의
			}
		}
		return k_10_pty; // 리턴
	}

	public String wfKor(String k_10_wfKor) {
		if (k_10_wfKor.getBytes().length < 13) { // wfKor가 13보다 작다면
			for (int k_10_i = k_10_wfKor.getBytes().length; k_10_i < 13; k_10_i++) { // 13에서 k_10_wfKor바이트크기만큼 뺀값을 반복

				k_10_wfKor = k_10_wfKor + " "; // wfKor를 wfKor + " " 재정의
			}
		}
		return k_10_wfKor; // 리턴
	}

	public String wfEn(String k_10_wfEn) {
		if (k_10_wfEn.getBytes().length < 13) { // wfEn가 13보다 작다면
			for (int k_10_i = k_10_wfEn.getBytes().length; k_10_i < 13; k_10_i++) { // 13에서 k_10_wfEn바이트크기만큼 뺀값을 반복

				k_10_wfEn = k_10_wfEn + " "; // wfEn를 wfEn + " " 재정의
			}
		}
		return k_10_wfEn; // 리턴
	}

	public String pop(String k_10_pop) {
		if (k_10_pop.getBytes().length < 2) { // pop가 2보다 작다면
			for (int k_10_i = k_10_pop.getBytes().length; k_10_i < 2; k_10_i++) { // 2에서 k_10_pop바이트크기만큼 뺀값을 반복

				k_10_pop = k_10_pop + " "; // pop를 pop + " " 재정의
			}
		}
		return k_10_pop; // 리턴
	}

	public String r12(String k_10_r12) {
		if (k_10_r12.getBytes().length < 3) { // r12가 3보다 작다면
			for (int k_10_i = k_10_r12.getBytes().length; k_10_i < 3; k_10_i++) { // 3에서 k_10_r12바이트크기만큼 뺀값을 반복

				k_10_r12 = k_10_r12 + " "; // r12를 r12 + " " 재정의
			}
		}
		return k_10_r12; // 리턴
	}

	public String s12(String k_10_s12) {
		if (k_10_s12.getBytes().length < 3) { // s12가 3보다 작다면
			for (int k_10_i = k_10_s12.getBytes().length; k_10_i < 3; k_10_i++) { // 3에서 k_10_s12바이트크기만큼 뺀값을 반복

				k_10_s12 = k_10_s12 + " "; // s12를 s12 + " " 재정의
			}
		}
		return k_10_s12; // 리턴
	}

	public String ws(String k_10_ws) {
		if (k_10_ws.getBytes().length < 20) { // ws가 20보다 작다면
			for (int k_10_i = k_10_ws.getBytes().length; k_10_i < 20; k_10_i++) { // 20에서 k_10_ws바이트크기만큼 뺀값을 반복

				k_10_ws = k_10_ws + " "; // ws를 ws + " " 재정의
			}
		}
		return k_10_ws; // 리턴
	}

	public String wd(String k_10_wd) {
		if (k_10_wd.getBytes().length < 4) { // wd가 4보다 작다면
			for (int k_10_i = k_10_wd.getBytes().length; k_10_i < 1; k_10_i++) { // 4에서 k_10_wd바이트크기만큼 뺀값을 반복

				k_10_wd = " " + k_10_wd; // wd를 " " + wd 재정의
			}
		}
		return k_10_wd; // 리턴
	}

	public String wdKor(String k_10_wdKor) {
		if (k_10_wdKor.getBytes().length < 4) { // wdKor가 4보다 작다면
			for (int k_10_i = k_10_wdKor.getBytes().length; k_10_i < 4; k_10_i++) { // 4에서 k_10_wdKor바이트크기만큼 뺀값을 반복

				k_10_wdKor = k_10_wdKor + " "; // wdKor를 wdKor + " " 재정의
			}
		}
		return k_10_wdKor; // 리턴
	}

	public String wdEn(String k_10_wdEn) {
		if (k_10_wdEn.getBytes().length < 2) { // wdEn가 2보다 작다면
			for (int k_10_i = k_10_wdEn.getBytes().length; k_10_i < 2; k_10_i++) { // 2에서 k_10_wdEn바이트크기만큼 뺀값을 반복

				k_10_wdEn = k_10_wdEn + " "; // wdEn를 wdEn + " " 재정의
			}
		}
		return k_10_wdEn; // 리턴
	}

	public String reh(String k_10_reh) {
		if (k_10_reh.getBytes().length < 2) { // reh가 2보다 작다면
			for (int k_10_i = k_10_reh.getBytes().length; k_10_i < 2; k_10_i++) { // 2에서 k_10_reh바이트크기만큼 뺀값을 반복

				k_10_reh = k_10_reh + " "; // reh를 reh + " " 재정의
			}
		}
		return k_10_reh; // 리턴
	}

	public String r06(String k_10_r06) {
		if (k_10_r06.getBytes().length < 3) { // r06가 3보다 작다면
			for (int k_10_i = k_10_r06.getBytes().length; k_10_i < 3; k_10_i++) { // 3에서 k_10_r06바이트크기만큼 뺀값을 반복

				k_10_r06 = k_10_r06 + " "; // r06를 r06 + " " 재정의
			}
		}
		return k_10_r06; // 리턴
	}

	public String s06(String k_10_s06) {
		if (k_10_s06.getBytes().length < 3) { // s06가 3보다 작다면
			for (int k_10_i = k_10_s06.getBytes().length; k_10_i < 3; k_10_i++) { // 3에서 k_10_s06바이트크기만큼 뺀값을 반복

				k_10_s06 = k_10_s06 + " "; // s06를 s06 + " " 재정의
			}
		}
		return k_10_s06; // 리턴
	}

}
