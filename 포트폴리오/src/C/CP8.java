package C;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CP8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int add_date = sc.nextInt();
		String format = "yyyyMMdd";
		Calendar calen = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = sdf.parse(input);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		calen.add(Calendar.DATE, add_date);
		System.out.println(sdf.format(calen.getTime()));
		
	}
}