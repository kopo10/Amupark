package soft7;

import java.util.ArrayList;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iTestMAX = 1000000;
		ArrayList k_10_iAL =  new ArrayList();
		
		for (int k_10_i = 0; k_10_i < k_10_iTestMAX; k_10_i++) {					 // k_10_iTestMAX만큼 반복
			k_10_iAL.add((int)(Math.random() * 1000000));							 // k_10_iAL에 k_10_iTestMAX크기만큼 배열생성
		}
		
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					 // k_10_iAL 크기만큼 반복
			System.out.printf(" ArrayList %d = %d\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력
		}
		
		System.out.printf("★★★★★★★★★★★★★★★★★★★\n");				 // ( ) 반복
		k_10_iAL.sort(null);														 // ( ) 정렬
			
		for (int k_10_i = 0; k_10_i < k_10_iAL.size(); k_10_i++) {					 // k_10_iAL 크기만큼 반복 
			System.out.printf(" ArrayList %d = %d\n", k_10_i, k_10_iAL.get(k_10_i));// ( ) 출력
		}
		
		
	}

}
