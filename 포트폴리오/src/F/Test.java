public static List<List<String>> get_Double_Array() {
      List<List<String>> double_Array = new ArrayList<List<String>>(); // ���߾�̸���Ʈ ����

      try {
         String line = "";
         BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\Score_Final.csv"));

         while ((line = reader.readLine()) != null) {
            List<String> single_Array = new ArrayList<String>(); // ��̸���Ʈ ����
            line = line.replace(",\"", "*");
            line = line.replace("\",", "*");
            line = line.replace(",", "*");
            String[] line_Array = line.split("\\*");
            /*
             * String[] line_Array = line.split(","); // ���� line�� ,�������� split�ؼ� // ���� array
             * 
             */
            single_Array = new ArrayList<> (Arrays.asList(line_Array)); // array�� arraylist�� ��ȯ
            double_Array.add(single_Array); // arraylist �� ���� arraylist�� ù�ٿ� ����
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return double_Array;
   }