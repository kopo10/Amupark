package C;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import PRACTICE.TEST;

public class TRST {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub{
		List<List<String>> double_Array = new ArrayList<List<String>>(); // ���߾�̸���Ʈ ����

		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\���ѿ�\\Desktop\\TEST.csv"));

			while ((line = reader.readLine()) != null) {
				//int[][] sum = new int [][];
				List<String> single_Array = new ArrayList<String>(); // ��̸���Ʈ ����
				String[] line_Array = line.split(","); // ���� line�� ,�������� split�ؼ�
				// ���� array
				single_Array = Arrays.asList(line_Array); // array�� arraylist�� ��ȯ
				double_Array.add(single_Array); // arraylist �� ���� arraylist�� ù�ٿ� ����
			for (int i = 1; i < double_Array.size() + 1; i++) {
				System.out.println(l.size());
				
				System.out.println(double_Array.get(i).get(8));
			}
			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(double_Array);
	}
}
 