package P0312;

import java.io.FileInputStream;
import java.io.IOException;

public class D {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\·ùÇÑ¿­\\Desktop\\Data.csv");
		input.read(content);
		String allLine = new String(content);
		
		String[] lines = allLine.split("\n");		
			System.out.print(lines[2]);			
		String[] year = new String[10];
		String[] acci = new String[10];
		String[] death = new String[10];
		String[] injur = new String[10];
		
		for (int i = 1; i < 21; i++) {
			String[] num =lines[i].split(",");
			year[i-1] = num[0];
			acci[i-1] = num[1];
			death[i-1] = num[2];
			injur[i-1] = num[3];
		}
			System.out.println(year[5]);
			System.out.println(acci[2]);
			System.out.println(death[3]);
			System.out.println(injur[4]);
			input.close();
	}
}
				
			
			
			
			
			
	//	String[] year = new String[20];
	//String[] accident = new String[20];
	//String[] death = new String[20];
	//String[] injured = new String[20];
		
	//System.out.println(year);
	//System.out.println(accident);
			



