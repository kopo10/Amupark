package F;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("C:\\Users\\���ѿ�\\Desktop\\out.txt");
		for(int i = 0; i < 10; i++) {
			
			String a = "ȯ�� �� �뷱�� : " + i;
			output.write(a.getBytes());
		}
		output.close();
	}

}
