package P0311;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String time = format.format(date);
			System.out.println(time);
		int a = sc.nextInt();
		
		try {
			Thread.sleep(a*1000);				
				System.out.print("time is already over ");
			Date date2 = new Date();
			 time = format.format(date2);
			 	System.out.println(time);
			 	
			int b = sc.nextInt();
				Thread.sleep(b*1000);
				System.out.print("time is over ");
				Date date3 = new Date();
				time = format.format(date3);
				System.out.println(time);
			
		} finally {
			System.out.println("");
		}
	}
}

