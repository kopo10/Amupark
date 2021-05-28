package soft7;

public class P66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k_10_iArray = { 40, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {							 // 배열에 원하는 숫자를 넣어준다										
			System.out.printf("iArray[%d]=%d\n", k_10_i, k_10_iArray[k_10_i]);					// k_10_iArray 배열 크기 만큼 반복
		}
		// MAX찾기

		int k_10_iMax = 0; // 처음시작배열부터시작
		int k_10_iMaxPt = 0;
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {							// 현재 k_10_iMax 들어 있는 값보다 크다면
			if (k_10_iMax < k_10_iArray[k_10_i]) {												// 그값을 k_10_iMax에 넣어준다
				k_10_iMax = k_10_iArray[k_10_i];												// 현재 k_10_iMax 값을 번호 저장
				k_10_iMaxPt = k_10_i;	
			}

		}
		System.out.printf("MAX : iArray[%d]=%d\n", k_10_iMaxPt, k_10_iMax);							// ( ) 출력

	}

}
