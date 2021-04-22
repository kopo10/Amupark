package amu_park;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Write{
	public void write (String DayOrNight, String HowOld, String Count, String Price, String Discount) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\류한열\\Desktop\\134.csv", true); //true룰 적어줘야 축적이 된다.
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd"); // 내가 원하는 날짜시간 형식
		Calendar cal =Calendar.getInstance();
		
		String write = "";	
		write = sdf.format(cal.getTime()) + String.format(",%s,%s,%s,%s,%s", DayOrNight, HowOld, Count, Price, Discount);
		output.write(write.getBytes()); //"C:\\Users\\류한열\\Desktop\\134.csv" 에 write를 입력
		output.close(); // 닫기			
	   
	}	
}

