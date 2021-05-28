package H;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String a = sc.nextLine();
		a = format.format(time);

		System.out.println(a);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finish" + a);
		
		}

	}

}
