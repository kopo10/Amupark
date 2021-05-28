package P0311;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time =new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		System.out.println("start");
		
		try {
			
			for (int i = 0; i < 100; i++) {												
				System.out.println(i);
				Thread.sleep(1000);			
			}
		} catch (InterruptedException e) {
			e.printStackTrace();			
		}
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("end");
	}
}
