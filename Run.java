package amu_park;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
   
public class Run {  
	public InputClass inputclass = null;
	public ConstvaluseClass constval = null;
	public OutPutClass output = null;

	public Run() {
		inputclass = new InputClass();
		constval = new ConstvaluseClass();
		output = new OutPutClass();
	}

	public int dayResidentNumber(String ResidentNumber) {
		Calendar time = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YY");
		int howold = 0;
		String b = sdf.format(time.getTime());
		int ThisYear = Integer.parseInt(b);
		int BornYear = Integer.parseInt(ResidentNumber.substring(0, 2));
		int OldOrYoung = (int) ResidentNumber.charAt(6) - 48;

		switch (OldOrYoung / 3) { // 5,6 Ż���ڴ� ������� �ʾҴ�.
		case 0:
			if (ThisYear - 1900 - BornYear < constval.min_Elder1) {
				howold = constval.Adult_Day_Price;
			} else {
				howold = constval.Elder_Day_Price;
			}
			return howold;
		case 1:
			if (ThisYear - 1900 - BornYear < constval.min_baby) {
				howold = constval.Kid_Day_Price;
				return howold;
			} else if (ThisYear - 1900 - BornYear < constval.Min_Teen1
					&& ThisYear - 1900 - BornYear > constval.Max_Teen2) {
				howold = constval.Teen_Day_Price;
			} else {
				howold = constval.Adult_Day_Price;
			}

		}
		return howold;
	}

	public int nightResidentNumber(String ResidentNumber) {
		Calendar time = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		int howold = 0;
		String b = sdf.format(time.getTime());
		int ThisYear = Integer.parseInt(b);
		int BornYear = Integer.parseInt(ResidentNumber.substring(0, 2));
		int OldOrYoung = (int) ResidentNumber.charAt(6) - 48;
		// System.out.println(OldOrYoung);
		switch (OldOrYoung / 3) { // 5,6 Ż���ڴ� ������� �ʾҴ�.
		case 0: // 2000��� ���� �����
			if (ThisYear - 1900 - BornYear < constval.min_Elder1) {
				howold = constval.Adult_night_Price;
			} else {
				howold = constval.Elder_night_Price;
			}
			return howold;
		case 1: // 2000��� ���� �����
			if (ThisYear - 1900 - BornYear < constval.min_baby) {
				howold = constval.Kid_night_Price;
				return howold;
			} else if (ThisYear - 1900 - BornYear < constval.Min_Teen1
					&& ThisYear - 1900 - BornYear > constval.Max_Teen2) {
				howold = constval.Teen_night_Price;
			} else {
				howold = constval.Adult_night_Price;
			}

		}
		return howold;
	}

	public double Discount(int discount) {
		double howdiscount = 0;
		switch (discount) {
		case 1:
			howdiscount = 1.0;
			break;
		case 2:
			howdiscount = constval.disabled;
			break;
		case 3:
			howdiscount = constval.DoForNation;
			break;
		case 4:
			howdiscount = constval.ManyChildren;
			break;
		case 5:
			howdiscount = constval.disabled;
			break;
		}
		return howdiscount;
	}

	public int total_price(int Price, String howmany, double discount) {
		int total_price = (int) (Price * Integer.parseInt(howmany) * discount);
		return total_price;

	}

}
