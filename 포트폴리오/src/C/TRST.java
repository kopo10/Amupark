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
		List<List<String>> double_Array = new ArrayList<List<String>>(); // 이중어레이리스트 정의

		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\류한열\\Desktop\\TEST.csv"));

			while ((line = reader.readLine()) != null) {
				//int[][] sum = new int [][];
				List<String> single_Array = new ArrayList<String>(); // 어레이리스트 정의
				String[] line_Array = line.split(","); // 받은 line을 ,기준으로 split해서
				// 만든 array
				single_Array = Arrays.asList(line_Array); // array를 arraylist로 변환
				double_Array.add(single_Array); // arraylist 를 이중 arraylist의 첫줄에 저장
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
 