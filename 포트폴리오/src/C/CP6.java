package PRACTICE;

import java.util.Calendar;
import java.util.Scanner;

public class CP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		int year = scanner.nextInt();
		int month = scanner.nextInt();
			
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
				
		System.out.printf("Sunday\t\tMonday\t\tTuesday\t\tWednesday\tThursday\tFriday\t\tSaturday%n");
		
		calendar.set(year, month-1, 1);
		int endDate = calendar.getActualMaximum(Calendar.DATE);
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);

		for (int i = 1; i <= endDate; i++) {
			if (i == 1) {
			 	for (int j = 1; j < dayOfWeek; j++) {
					System.out.printf("\t\t");
				}
			} 
			System.out.printf("%d\t\t", i);
			if (dayOfWeek % 7 == 0) {
				System.out.printf("%n");				
			} 
			dayOfWeek++;
		}
	}
}