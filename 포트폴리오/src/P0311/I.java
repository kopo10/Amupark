package P0311;

import java.text.SimpleDateFormat;
import java.util.Date;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss"); 	
		Date time = new Date();
		String dateAndTime = format.format(time);	
		System.out.println(dateAndTime);
		System.out.println("start");		
		
		try {
			Thread.sleep(3000);
			Date time2 = new Date();
			String dateAndTime2 = format.format(time2);	
			System.out.println(dateAndTime2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("end");
		}
		
		
			
	}
}