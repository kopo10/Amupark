package TicketRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public void read() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\���ѿ�\\Desktop//133.csv"));

		String line;
		int DayCount = 0;
		int NightCount = 0;
		while ((line = reader.readLine()) != null) {
			String[] FileSplit = line.split(",");
			// System.out.println(a[3]);
			// System.out.println(line.length());
			if (FileSplit[1].equals("�ְ���")) {
				DayCount += Integer.parseInt(FileSplit[3]);
			} else if (FileSplit[1].equals("�߰���")) {
				NightCount += Integer.parseInt(FileSplit[3]);
			}

		}
		System.out.println(DayCount);
		System.out.println(NightCount);
	}
		
	public void OneDay() {
		if (FileSplit[1].equals("�ְ���")) {
			DayCount += Integer.parseInt(FileSplit[3]);
		} else if (FileSplit[1].equals("�߰���")) {
			NightCount += Integer.parseInt(FileSplit[3]);
		}
	}
	
}
