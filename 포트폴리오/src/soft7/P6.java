package soft7;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k_10_iArray = {40, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212,          // 배열에 원하는 숫자를 넣어준다
				33, 11, 21, 11, 2121,121, 11, 5, 6, 33}; 		
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {			// k_10_iArray 배열 크기 만큼 반복
			System.out.printf("iArray[%d]=%d\n", k_10_i, k_10_iArray[k_10_i]);  // ( ) 출력
		}
		//MAX찾기
	
		int k_10_iMin = Integer.MAX_VALUE; 									//큰값을 지정해준다
		int k_10_iMinPt = 0;
		for (int k_10_i = 0; k_10_i < k_10_iArray.length; k_10_i++) {
			if (k_10_iMin > k_10_iArray[k_10_i]) {								// 현재 k_10_iMin 들어 있는 값보다 작다면
				k_10_iMin = k_10_iArray[k_10_i];								// 그값을 k_10_iMin에 넣어준다
				k_10_iMinPt = k_10_i;											// 현재 k_10_iMin 값을 번호 저장
			}
		}
		System.out.printf("MIN : iArray[%d]=%d\n", k_10_iMinPt, k_10_iMin);		// ( ) 출력
	
	}	

}
