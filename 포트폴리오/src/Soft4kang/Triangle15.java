package Soft4kang;

public class Triangle15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // 잘쓰지 않는 방법!!!!
		int iA, iB; // iA, iB를 int로 정의

		iA = 0; // iA를 0으로 정의
		while (true) { // break가 없다면 무한
			iB = 0; // iB를 0으로 정의

			while (true) { // break가 없다면 무한
				System.out.printf("*"); // ( )안의 문자열을 출력한다

				if (iA == iB)
					break; // iA == iB라면 13line 의 while을 종료한다.
				iB++; // iB 증가
			} // } 닫기
			System.out.printf("\n"); // ( )안의 문자열을 출력한다
			iA++; // iB 증가
			if (iA == 30) { // iA == 30라면
				break; // 10line while종료
			} // } 닫기
		} // } 닫기

	} // } 닫기

} // } 닫기
