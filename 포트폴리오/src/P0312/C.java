package P0312;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class C {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	try {
		FileOutputStream output = new FileOutputStream("C:\\Users\\·ùÇÑ¿­\\Desktop\\out.csv");
		//for (int i =1; i < 11; i++) {
		//	String data = "Line #" + i + "\n";
			String data = "\"kim\",lee,77";
			output.write(data.getBytes());
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
			
		}
		
	}


