package P0312;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\·ùÇÑ¿­\\Desktop\\Data.csv");
		for(int i = 11; i <16; i++) {
			String data = "Linssse #" + i + "\n";
			fw.write(data);
		}
		}
	}


