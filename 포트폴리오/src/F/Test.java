public static List<List<String>> get_Double_Array() {
      List<List<String>> double_Array = new ArrayList<List<String>>(); // 이중어레이리스트 정의

      try {
         String line = "";
         BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\Score_Final.csv"));

         while ((line = reader.readLine()) != null) {
            List<String> single_Array = new ArrayList<String>(); // 어레이리스트 정의
            line = line.replace(",\"", "*");
            line = line.replace("\",", "*");
            line = line.replace(",", "*");
            String[] line_Array = line.split("\\*");
            /*
             * String[] line_Array = line.split(","); // 받은 line을 ,기준으로 split해서 // 만든 array
             * 
             */
            single_Array = new ArrayList<> (Arrays.asList(line_Array)); // array를 arraylist로 변환
            double_Array.add(single_Array); // arraylist 를 이중 arraylist의 첫줄에 저장
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return double_Array;
   }