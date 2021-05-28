package Soft4kang;

public class NumberRead23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 1001034567;
		
		String sNumVal = String.valueOf(iNumVal);
		
		String sNumVoice = "";
		
		System.out.printf("==> %s [%d자리]\n" , sNumVal, sNumVal.length());
		
		int i, j;
		
		String [] units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String [] unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
		
		i = 0;
		j = sNumVal.length() - 1;
		
		while (true) {
			if(i >= sNumVal.length()) break;
			
			System.out.printf("%s[%s]",
					sNumVal.substring(i, i+1),
					units[Integer.parseInt(sNumVal.substring(i, i+1))]);  //substing 인자 하나만 주는걸로 해봄 
																			//실행되는지
			if (sNumVal.substring(i, i+1).equals("0")) {
				if(unitX[j].equals("만") || unitX[j].equals("억")) {
					sNumVoice = sNumVoice + "" + unitX[j];
				} else {
					
				}
			} else {
				sNumVoice = sNumVoice
						+ units[Integer.parseInt(sNumVal.substring(i, i + 1))]
						+ unitX[j];		
			}
			i++; j--;
		}
		System.out.printf("\n %s[%s]\n" , sNumVal, sNumVoice);
	}

}
