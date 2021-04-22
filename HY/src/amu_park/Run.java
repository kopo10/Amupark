package amu_park;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Run {
	public InputClass inputclass = null;
	public ConstvaluseClass constval = null;
	public OutPutClass output = null;
	public Write write = null;
	//public Mysql mysql = null;	
	Calendar time = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY"); //4�ڸ��� �ʿ��ϱ� ������
	String thisyearxxxx = sdf.format(time.getTime());

	public Run() {
		inputclass = new InputClass();
		constval = new ConstvaluseClass();
		output = new OutPutClass();
		write = new Write();
		//mysql = new Mysql();
	}

	public int dayResidentNumber(String ResidentNumber) {  //�ְ����� ���� �߰����� �� �ΰ��� �������ϴ�.

		int howmuch = 0;
		int ThisYear = Integer.parseInt(thisyearxxxx); //���� �⵵�� �ռ��� 2���� ����
		int BornYear = Integer.parseInt(ResidentNumber.substring(0, 2)); //�ֹ���ȣ���� �⵵�� �ش��ϴ� ��ȣ�� ����
		int OldOrYoung = (int) ResidentNumber.charAt(6) - 48; // 1,2�� ����� 2000�� ���� ������̴�.

		switch (OldOrYoung / 3) { // 5,6 Ż���ڴ� ������� �ʾҴ�.
		case 0:
			if (ThisYear - 1900 - BornYear < constval.min_Elder1) { //����⵵ - 1900 - �¾�⵵�� �� ���� ���� ���ߴ�.
				howmuch = constval.Adult_Day_Price;					//��������� ������� �ʰ� ������ ���� �� ���̶�� �����ߴ�.
			} else {
				howmuch = constval.Elder_Day_Price;
			}
			return howmuch;
		case 1:
			if (ThisYear - 1900 - BornYear < constval.min_baby) { // 2000������Ĵ� �ֹκ�ȣ 7��° ���ڰ� 3 ���� 4�̱� ������
				howmuch = constval.Kid_Day_Price; // �ֱ�                 // 3���� �����ָ� ���� 1�� �ȴ�.
				return howmuch;
			} else if (ThisYear - 1900 - BornYear < constval.Min_Teen1
					&& ThisYear - 1900 - BornYear > constval.Max_Teen2) { //û�ҳ�
				howmuch = constval.Teen_Day_Price;
			} else {
				howmuch = constval.Adult_Day_Price; // �
			}

		}
		return howmuch;
	}

	public int nightResidentNumber(String ResidentNumber) { // ���� �޼ҵ�� �߰����ΰ� �����ϰ� ���� �����ϴ�
		int howmuch = 0;
		int ThisYear = Integer.parseInt(thisyearxxxx);
		int BornYear = Integer.parseInt(ResidentNumber.substring(0, 2));
		int OldOrYoung = (int) ResidentNumber.charAt(6) - 48; // 1,2�� ����� 2000�� ���� ������̴�.
		// System.out.println(OldOrYoung);
		switch (OldOrYoung / 3) { // 5,6 Ż���ڴ� ������� �ʾҴ�.
		case 0: // 2000��� ���� �����
			if (ThisYear - 1900 - BornYear < constval.min_Elder1) { //���� �⵵ - 1900 -�ֹι�ȣ �� 2�ڸ�
				howmuch = constval.Adult_night_Price;
			} else {
				howmuch = constval.Elder_night_Price;
			}
			return howmuch;
		case 1: // 2000��� ���� �����
			if (ThisYear - 1900 - BornYear < constval.min_baby) { //���� �⵵ - 1900 -�ֹι�ȣ �� 2�ڸ�
				howmuch = constval.Kid_night_Price;
				return howmuch;
			} else if (ThisYear - 1900 - BornYear < constval.Min_Teen1
					&& ThisYear - 1900 - BornYear > constval.Max_Teen2) { //���� �⵵ - 1900 -�ֹι�ȣ �� 2�ڸ�
				howmuch = constval.Teen_night_Price;
			} else {
				howmuch = constval.Adult_night_Price;
			}
		}
		return howmuch;
	}

	public double Discount(int discount) { //�������� ���ϱ� ���� ���� �޼ҵ�.
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

	public int total_price(int Price, String howmany, double discount) { //���̿� ���� Ƽ�� ����, ����, �������� ���� �ѱݾ�
		int total_price = (int) (Price * Integer.parseInt(howmany) * discount);
		return total_price;
	}

	public String Array(String DayOrNight, String jumin, String count, int typediscount, String Real_discount) { //���γ����� ����ϱ� ���� print�� �ʿ��� ������ ���� �Է��ϰ�
		String print = "";																						//return������ print�� ���.
		print += output.DayNight(Integer.parseInt(DayOrNight)) + " "; //�ְ��� �߰���
		print += output.group1(jumin) + " X "; //���� �׷�
		print += count + "  "; //����
		if (Integer.parseInt(DayOrNight) == 1) {
			print += (int) (dayResidentNumber(jumin) * Discount(typediscount) * Integer.parseInt(count)) + "��  "; //�ְ��� ����

		} else {
			print += (int) (nightResidentNumber(jumin) * Discount(typediscount) * Integer.parseInt(count)) + "��  "; //�߰��� ����
		}
		print += "*" + Real_discount + "\n";  //��� ���� ǥ��
		return print;
	}
		
	public void write(String DayOrNight, String HowOld, String Count, String Price, String Discount) //csv������ ����� ���� �ʿ��� ���ڸ� �޾Ƽ�
			throws IOException {																	//write class�� �����ش�.
		write.write(DayOrNight, HowOld, Count, Price, Discount);
		//mysql.abc(DayOrNight, HowOld, Integer.parseInt(Count), Integer.parseInt(Price), Discount);
	}

}
