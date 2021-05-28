package Soft4kang;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0; // score을 0으로 정의
		int num = 1; // num을 0으로 정의

		int score1 = 61;// score1을 61으로 정의
		if (score1 > 60) { // score1이 60 보다 크다면
			System.out.println("합격입니다1."); // ( )안의 문자열을 출력한다.
		} // if문 닫기

		if (score1 > 60) // score1이 60 보다 크다면 (위에 조건과 차이점은 {})
			System.out.println("합격입니다2."); // ( )안의 문자열을 출력한다.

		score = 61; // score을 61로 재정의
		if (score > 60) { // score이 60 보다 크다면
			System.out.println("합격입니다3.");// ( )안의 문자열을 출력한다.
		} else { // if안의 조건이 아니라면 나머지는 
			System.out.println("불합격입니다."); // ( )안의 문자열을 출력한다.
		} // }닫기

		if (num > 0) { //num이 0보다 크다면
			System.out.println("양수입니다");// ( )안의 문자열을 출력한다.
		} else if (num < 0) { //num이 0보다 작다면 
			System.out.println("음수입니다");// ( )안의 문자열을 출력한다.
		} else { //if조건도 아니고 else if 조건도 아니라면
			System.out.println("영입니다");// ( )안의 문자열을 출력한다.
		} // }닫기

		if (score >= 90) { // score이 90이거나 90보다 크다면
			System.out.println("A등급"); // ( )안의 문자열을 출력한다.
		} else if (score >= 80 && score < 90) { // score이 80 보다 크고 90보다 작다면
			System.out.println("B등급"); // ( )안의 문자열을 출력한다.
		} else if (score >= 70 && score < 80) { // score이 70 보다 크고 80보다 작다면
			System.out.println("C등급"); // ( )안의 문자열을 출력한다.
		} else { //if조건도 아니고 else if 조건도 아니라면
			System.out.println("F등급"); // ( )안의 문자열을 출력한다.

		} // }닫기
	} // }닫기
} // }닫기
