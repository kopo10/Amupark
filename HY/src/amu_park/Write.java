package amu_park;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Write{
	public void write (String DayOrNight, String HowOld, String Count, String Price, String Discount) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\���ѿ�\\Desktop\\134.csv", true); //true�� ������� ������ �ȴ�.
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd"); // ���� ���ϴ� ��¥�ð� ����
		Calendar cal =Calendar.getInstance();
		
		String write = "";	
		write = sdf.format(cal.getTime()) + String.format(",%s,%s,%s,%s,%s", DayOrNight, HowOld, Count, Price, Discount);
		output.write(write.getBytes()); //"C:\\Users\\���ѿ�\\Desktop\\134.csv" �� write�� �Է�
		output.close(); // �ݱ�			
	   
	}	
}

