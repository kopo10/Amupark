package F;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fff {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\류한열\\Desktop\\TEST.csv"));
      List<List<String>> List = new ArrayList<List<String>>();
      List<String> OneLine = new ArrayList<String>();
      String line = "";
      while ((line = reader.readLine()) != null) {
         String[] array = line.split(",");
         OneLine = Arrays.asList(array);
         List.add(OneLine);
      }
      int sum = 0;
      int min = Integer.MAX_VALUE;
      int max = 0;
      for (int i = 1; i < List.size(); i++) {
         sum = sum + Integer.parseInt(List.get(i).get(4));
         if (min > Integer.parseInt(List.get(i).get(4))) {
            min = Integer.parseInt(List.get(i).get(4));
         } else if (max < Integer.parseInt(List.get(i).get(4))) {
            max = Integer.parseInt(List.get(i).get(4));
         }
      }
      double avg = Double.parseDouble(line);
      System.out.println("최소 : " + min);
      System.out.println("최대 : " + max);
      System.out.println("합계 : " + sum);
      System.out.println("평균 : " + sum / (List.size() - 1));
   }
}