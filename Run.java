package amu_park;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Run {
	public InputClass inputclass = null;
	public ConstvaluseClass constval = null;

	public Run() {
		inputclass = new InputClass();
		constval = new ConstvaluseClass();
	}	
	
	public void DayOrNight(int a) throws IOException {
		if (a == 1) {
			int ab = inputclass.HowMany();
			ResidentNumber(inputclass.ResidentNumber());
			//int c = ResidentNumber(inputclass.ResidentNumber());
		} else {
			inputclass.HowMany();
		}
	}

	public void ResidentNumber(String a) {
		Calendar time = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");

		String b = sdf.format(time.getTime());
		int ThisYear = Integer.parseInt(b);
		int BornYear = Integer.parseInt(a.substring(0, 2));
		System.out.println(ThisYear - 1900 - Integer.parseInt(a.substring(0, 2)));
		switch (a.charAt(6) / 3) { // 5,6 Ż���ڴ� ������� �ʾҴ�.
		case 0:
			if (ThisYear - 1900 - BornYear < 65) {
				// System.out.println(constval.Adult_Day_Price);
				Discount();

			}

		case 1:
			if (ThisYear - 1900 - BornYear < 3) {
				System.out.println("����");
			}
		}

	}


	public int Discount() {
		// int Discount = 0;
		int a = inputclass.Discount();
		switch (a) {
		case 1:
			System.out.println("������ ");
		case 2:

		case 3:
		
		case 4:

		case 5:

		}
		return a;
	}

}
