package C;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CP7 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dtf = new SimpleDateFormat("yyyyMMdd");

		String date1 = sc.nextLine();
		String date2 = sc.nextLine();

		Date FirstDate = dtf.parse(date1);
		Date SecondDate = dtf.parse(date2);

		long dif = SecondDate.getTime() - FirstDate.getTime();
		int dayDiff = (int) (dif / (1000 * 60 * 60 * 24));
		System.out.print(dayDiff);
	}
}