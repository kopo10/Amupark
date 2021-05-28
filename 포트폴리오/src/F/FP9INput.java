package F;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP9INput {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\류한열\\Desktop\\TEST.csv"));
      ArrayList<Integer> count = new ArrayList<Integer>();
      String[] severalLine = new String[15900];   //총 행수보다 1000정도 높게 설정
      int sum = 0;
      int min = Integer.MAX_VALUE;
      int max = 0;
      int i = 0;
      while (true) {
         String line;
         if ((line = reader.readLine()) == null) {
            break;
         }
         severalLine[i] = line;
         i++;
      }
      for (int j = 1; j < 15890; j++) {      //정확한 행 수  j=1한 이유 0번째 행은 구분 한글이여서 필요없음 
         String[] Split = severalLine[j].split(",");
         count.add(Integer.parseInt(Split[4]));      //계산하려는 열
      }
      for (int k = 0; k < count.size(); k++) {
         sum = sum + count.get(k);
         if (min > count.get(k)) {
            min = count.get(k);
         } else if (max < count.get(k)) {
            max = count.get(k);
         }
      }
      
      System.out.println("최소 : " + min);
      System.out.println("최대 : " + max);
      System.out.println("합계 : " + sum);
      System.out.println("평균 : " + sum / (count.size() - 1));
   }
}