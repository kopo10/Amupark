package DOg;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket s1 = null;
		Socket s2;
		OutputStream os1;
		DataOutputStream os2;
		InputStream is1;
		DataInputStream is2;
		
		try {
			s1 = new ServerSocket (5432);
		} catch (IOException e) {e.printStackTrace();}
	
		while (true) {
			try {
				System.out.println("Ŭ���̾�Ʈ �����");	
				s2 = s1.accept();
				System.out.println("Ŭ���̾�Ʈ ���� ����");
				os1 = s2.getOutputStream();
				os2 = new DataOutputStream(os1);
				os2.writeUTF("����");
				
				is1 = s2.getInputStream();
				is2 = new DataInputStream(is1);
				String st = new String(is2.readUTF());
				System.out.println(st);
				
				is1.close();
				is2.close();
				os1.close();
				os2.close();
				s2.close();

			}	catch(IOException e) {e.printStackTrace();}		
	    }
	}
}
