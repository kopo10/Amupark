package soft7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5Writeit {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter k_10_fw = new FileWriter("C:\\Users\\���ѿ�\\Desktop\\test.txt", true); // FileWriter�� �ҷ����� ���ϴ� ��ġ�� �����ش�.
		BufferedWriter k_10_bw = new BufferedWriter(k_10_fw);								// BufferedWriter�� �η����� FileWriter��k_10_fw �־��ش�
		StringBuffer k_10_sf = new StringBuffer();

		BufferedReader k_10_br = new BufferedReader(new InputStreamReader(System.in));
		String k_10_str = "";														
		while (!(k_10_str = k_10_br.readLine()).startsWith("s"))							// s�� ������ �� ���� �ݺ�
			k_10_sf.append(k_10_str + "\n");												// StringBuffer�� ��� �־��ش�

		k_10_br.close();	
		k_10_fw.write(k_10_sf.toString());
		k_10_fw.flush();
		k_10_fw.close();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");										// ( ) ���
	}
}
