package soft7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5Writeit {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter k_10_fw = new FileWriter("C:\\Users\\류한열\\Desktop\\test.txt", true); // FileWriter을 불러오고 원하는 위치를 적어준다.
		BufferedWriter k_10_bw = new BufferedWriter(k_10_fw);								// BufferedWriter을 부러오고 FileWriter인k_10_fw 넣어준다
		StringBuffer k_10_sf = new StringBuffer();

		BufferedReader k_10_br = new BufferedReader(new InputStreamReader(System.in));
		String k_10_str = "";														
		while (!(k_10_str = k_10_br.readLine()).startsWith("s"))							// s로 시작할 때 까지 반복
			k_10_sf.append(k_10_str + "\n");												// StringBuffer에 계속 넣어준다

		k_10_br.close();	
		k_10_fw.write(k_10_sf.toString());
		k_10_fw.flush();
		k_10_fw.close();
		System.out.println("저장이 완료되었습니다.");										// ( ) 출력
	}
}
