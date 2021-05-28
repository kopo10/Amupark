package soft7;

import java.util.ArrayList;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k_10_iAL = new ArrayList();
		
		k_10_iAL.add("abc");
		k_10_iAL.add("abcd");
		k_10_iAL.add("efga");
		k_10_iAL.add("가나다0");
		k_10_iAL.add("1234");
		k_10_iAL.add("12rk34");
																					//iAL.add("356"); 어레이리스트를 스트링으로 쓰려고하는데
																					//중간에 숫자 넣으면 안되
		
		System.out.printf("★★★★★★★★★★★★★★★★★★★\n"); 				// ( ) 출력
		System.out.printf(" 시작 ArraySize %d \n", k_10_iAL.size());				// ( ) 출력
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL 크기만큼 반복
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력
		}
		k_10_iAL.set(3, "가라라라"); 												//3번 어레이리스트 내용변경
		System.out.printf("★★★★★★★★★★★★★★★★★★★\n");				// ( ) 출력				
		System.out.printf(" 내용변경 ArraySize %d \n", k_10_iAL.size());			// ( ) 출력
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// ( ) 출력
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력	
		}
		
		k_10_iAL.remove(4);															// 4번째 배열 삭제
		System.out.printf("★★★★★★★★★★★★★★★★★★★\n");				// ( ) 출력
		System.out.printf(" 내용변경 ArraySize %d \n", k_10_iAL.size());			// ( ) 출력
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL 크기만큼 반복	
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력
		}
		
		k_10_iAL.sort(null);														// 정렬하기
		System.out.printf("★★★★★★★★★★★★★★★★★★★\n");				// ( ) 출력
		System.out.printf(" 리스트 ArraySize %d \n", k_10_iAL.size());				// ( ) 출력
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL 크기만큼 반복
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력
		}
		
		k_10_iAL.clear();															// 전부 삭제
		System.out.printf("★★★★★★★★★★★★★★★★★★★\n");				// ( ) 출력
		System.out.printf(" 전부삭제 ArraySize %d \n", k_10_iAL.size());			// ( ) 출력
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					// k_10_iAL 크기만큼 반복
			System.out.printf(" ArrayList %d = %s\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력
		}
	
	
	
	}

}
