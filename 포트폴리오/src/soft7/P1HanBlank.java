package soft7;

public class P1HanBlank {

	public static String Foreword (String k_10_a, int b) {
		for (int k_10_i = k_10_a.getBytes().length; k_10_i < b; k_10_i++) {		    //k_10_a와 b의 크기를 비교해보고 모자란만큼 " "을 준다
			k_10_a = " " + k_10_a;
		}
		
	
		return k_10_a;
		
	}
	
	public static String Backword (String k_10_a, int k_10_b) {
		for (int k_10_i = k_10_a.getBytes().length; k_10_i < k_10_b; k_10_i++) {	//k_10_a와 b의 크기를 비교해보고 모자란만큼 " "을 준다
			k_10_a += " ";
		}
		
	
		return k_10_a;
		
	}
	
	public static int count (String k_10_a) {
		int k_10_count = 0; 
		for (int k_10_i = 0; k_10_i < k_10_a.length() ; k_10_i++) { 			// k_10_a의 크기만큼 반복
			
			if (k_10_a.substring(k_10_i, k_10_i + 1).getBytes().length == 2 ) { // 모든글자의 바이트를 구해서 한글의 갯수를 구한다.
				k_10_count++;
				
				
			}
		}

		return k_10_count;
		
	}
}
