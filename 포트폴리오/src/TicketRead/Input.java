package TicketRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {
	public void input() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\·ùÇÑ¿­\\Desktop//133.csv"));
		String line;
		
		while ((line = reader.readLine()) != null) {
			String[] a = line.split(",");
			System.out.println(a);
		}
	}

}
