package TicketRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Practice3.a;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\류한열\\Desktop//133.csv"));
		String line;
		int DayCount = 0;
		int NightCount = 0;
		while ((line = reader.readLine()) != null) {
			String[] FileSplit = line.split(",");
			// System.out.println(a[3]);
			// System.out.println(line.length());
			if (FileSplit[1].equals("주간권")) {
				DayCount += Integer.parseInt(FileSplit[3]);
			} else if (FileSplit[1].equals("야간권")) {
				NightCount += Integer.parseInt(FileSplit[3]);
			}

			
			
		}
		System.out.println(DayCount);
		System.out.println(NightCount);

	}

}
