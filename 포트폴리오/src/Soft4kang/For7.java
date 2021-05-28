package Soft4kang;

public class For7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //sum을 int값 0으로 정의
		for (int i = 0; i < 10; i++) { //for를 이용해서 i가 0부터 9까지 반복 //부등호 표시에 유의
			sum = sum + i; //sum을 for가 반복 할때마다 sum + i로 계속 재정의
		}
		System.out.printf("sum %d\n" , sum); // sum이라는 문자열을 출력하고 sum을 정수로 출력 후 \n
		
		for (int i = 0; i < 10; i++) { //for를 이용해서 i가 0부터 9까지 반복 //부등호 표시에 유의
			System.out.printf("★★★★★★★★★★★★★★★★★★\n" , i);  // }닫기	
			System.out.printf("   구구단 %d 단\n" , i);  // 구구단을 출력 후 i를 정수로 출력 단 출력 \n	
			System.out.printf("★★★★★★★★★★★★★★★★★★\n" , i); // ( )안의 문자열을 출력한다.
			for (int j = 0; j < 10; j++) { //for를 이용해서 j가 0부터 9까지 반복
			
				System.out.printf(" %d * %d = %d \n" , i, j, i * j); //i, j, i * j를 정수로 순서대로 출력 후 \n
			} // }닫기	
		} // }닫기	
	} // }닫기	
} // }닫기	
