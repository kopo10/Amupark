package F;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("C:\\Users\\류한열\\Desktop\\out.txt");
		for(int i = 0; i < 10; i++) {
			
			String a = "환전 후 밸런스 : " + i;
			output.write(a.getBytes());
		}
		output.close();
	}

}
