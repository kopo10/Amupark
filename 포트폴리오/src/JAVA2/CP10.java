package JAVA2;

public class CP10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6P
		int k_10ii; // k_10이라는 숫자형 변수를 선언
		k_10ii = 1 + 2; // k_10이라는 변수를 1 + 2 초기화
			System.out.printf("#1-1 : %d\n" , k_10ii); // %d는 정수 형식으로 출력, 
													//출력지시자와 출력값의 숫자 일치
		k_10ii = 1 + 2 * 3; //k_10이라는 숫자형 변수를 1 + 2 * 3로 초기화
			System.out.printf("#1-1 : %d\n" , k_10ii); //%d로 k_10을 정수로 계산(사친역산 순서기억)
		
			
		//7P
		int k_10sum; // c는 맨 앞에서만 선언해야 하지만, c++,java는 필요할 때 선언해도 됨, 하지만 지저분
		k_10sum = 0; //누적, 루프는 꼭 초기화
		//1부터 100까지 더해보자
		for (int i = 1; i < 101; i++) { //i를 10까지 반복하는 명령어
			k_10sum = k_10sum + i;	//반복하는 i를 전부 더하기 위한 소스	
		}
			System.out.printf("#2 : %d\n" , k_10sum); // 21번째 줄에서 1부터 100까지 
														//더한 값을 정수로 출력
			System.out.printf("#2-2 : %d\n" , k_10sum / 100); // 21번째 줄에서 계산한 값을 
																//100으로 나눈 후 정수로 출력	
		int [] k_10v = {1,2,3,4,5}; // 배열을 이용해서 k_10v 를 정의 후 초기화
		int k_10vSum; // k_10vSum이라는 숫자형 변수를 정의
		
		k_10vSum = 0; // k_10vSum이라는 숫자형 변수를 0으로 초기화
		
		for (int i = 0; i < 5; i++) { // for구문을 이용해서 i라는 숫자형 변수를 정의 후 0으로 초기화 후 
										//5보다 작게 범위 설정 후 1씩 증가			
			k_10vSum = k_10vSum+k_10v[i];  // k_10vSum를 k_10vSum+k_10v[i] 로 초기화	
		}
			System.out.printf("#2-3 : %d\n" , k_10vSum); // 35줄에서 계산한 값을 출력 (for문 밖에 있기 때문에
													// for문이 다 돌면서 합산한 값이 출력된다.
		
		
		//8P
		k_10ii = 1000 / 3; // int 이기 때문에 소숫점이 없이 정수로 출력된다
			System.out.printf("#3-1 : %d\n" , k_10ii); // 1000/3을 계산한 출력값
		
		k_10ii = 1000%3; // %를 사용하면 1000을 3으로 나누고 나머지를 알수있다.
			System.out.printf("#3-2 : %d\n" , k_10ii); //1000/3의 나머지를 출력
		
		for (int i = 0; i < 20; i++) { //정수 i가 0부터 19까지 반복하는 함수)
			System.out.printf("#3-3 : %d " , i); // for안에 있으므로 for가 돌 때마다 i가 출력된다.
			
			if (((i + 1) % 5) == 0) {  //i + 1 을 5로 나눴을 때 나머지가 0이 true일 경우				
				System.out.println("\n"); // if가 true 일 때 \n 을 출력해준다.
			}
		}
		
		
		//9P   // 원하는 자릿수 반올림, 버림처리를 배워보자!
		k_10ii = 12345; //k_10ii 를 선언 후 12345로 초기화
		int k_10j = (k_10ii / 10) * 10; // int k_10j 를 k_10ii를 10으로 나누고 다시 곱해주기
			System.out.printf("#4-1 : %d\n" , k_10j); // 10으로 나누면 1234.5가 되지만 정수이므로 1234가 되고
														// 다시 10을 곱해서 12340이 된다.
		k_10ii = 12345;   //k_10ii 를 선언 후 12345로 초기화
		k_10j = ((k_10ii + 5) / 10) * 10;    //k_10ii + 5를 10으로 나누고 다시 10 곱해주기
			System.out.printf("#4-2 : %d\n" , k_10j); // 12345 + 5를 하게 되면 12350이 되고 10을 나누면 
													  // 1235가 되고 다시 10을 곱해서 12350이 된다.
		k_10ii = 12344; //k_10ii 를 선언 후 12344로 초기화
		k_10j = ((k_10ii + 5) / 10) * 10;  //k_10ii + 5를 10으로 나누고 다시 10 곱해주기
			System.out.printf("#4-2 : %d\n" , k_10j); // 12344 + 5를 하게 되면 12349 가 되고 10을 나누면
			                                          // 1234.9가 되지만 정수이므로 1234가 되고 10을 곱하면 12340이 된다.
			
		//10P
		
		double k_10MyValF; // double 타입으로 k_10MyValF을 선언
		
		k_10MyValF = 14 / 5;  // k_10MyValF을 14 / 5 로 초기화
		System.out.printf("#5-2 : %f\n" , k_10MyValF); // %f는 소수점으로 출력하는 명령어이지만
														// 14 / 5 둘 다 정수이므로 정수로 출력 된다.															
		k_10MyValF = 14.0 / 5; // k_10MyValF을 14.0 / 5 로 초기화
		System.out.printf("#5-3 : %f\n" , k_10MyValF); // k_10MyValF을 14.0 / 5 로 초기화 했으므로
														// 14.0이 소수점이 있기 때문에 
		k_10MyValF = (14.0) / 5 + 0.5; // k_10MyValF을 (14.0) / 5 + 0.5 로 초기화
		System.out.printf("#5-3 : %f\n" , k_10MyValF); // (14.0) / 5 를 먼저 연산하고 + 0.5를 해준다
		
		k_10MyValF = (int) ((14.0) / 5 + 0.5); //k_10MyValF을 (int) ((14.0) / 5 + 0.5 로 초기화
		System.out.printf("#5-3 : %f\n" , k_10MyValF); //(14.0) / 5 를 먼저 연산하고 + 0.5를 더 해준게 
														// 3.3이므로 정수로 변환해주면 3이 된다.		
													
	}

}

