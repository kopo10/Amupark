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
      BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\���ѿ�\\Desktop\\TEST.csv"));
      ArrayList<Integer> count = new ArrayList<Integer>();
      String[] severalLine = new String[15900];   //�� ������� 1000���� ���� ����
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
      for (int j = 1; j < 15890; j++) {      //��Ȯ�� �� ��  j=1�� ���� 0��° ���� ���� �ѱ��̿��� �ʿ���� 
         String[] Split = severalLine[j].split(",");
         count.add(Integer.parseInt(Split[4]));      //����Ϸ��� ��
      }
      for (int k = 0; k < count.size(); k++) {
         sum = sum + count.get(k);
         if (min > count.get(k)) {
            min = count.get(k);
         } else if (max < count.get(k)) {
            max = count.get(k);
         }
      }
      
      System.out.println("�ּ� : " + min);
      System.out.println("�ִ� : " + max);
      System.out.println("�հ� : " + sum);
      System.out.println("��� : " + sum / (count.size() - 1));
   }
}