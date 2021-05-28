package soft7;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1HanBlank k_10_han = new P1HanBlank();
		
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Foreword("한글abcd", 15));			//출력
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Foreword("한글한글aa", 15));		//출력
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Backword("한글aa", 15));			//출력
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Backword("한글한글aa", 15));		//출력
		System.out.printf("한글은 [%d]개\n", k_10_han.count("한글한글aa"));						//출력
	}

}
