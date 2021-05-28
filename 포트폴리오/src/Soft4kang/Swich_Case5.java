package Soft4kang;

public class Swich_Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "123456-1234567"; //string type의 jumin을 정의
		switch (jumin.charAt(7)) { // jumin.charAt(7) 안에 있는 값
		case '1' : //jumin.charAt(7)값이 1이라면
			System.out.println("20세기전 태어난 남자 사람\n"); // ( )안의 문자열을 출력한다.
			break; //switch 종료
		case '2' : //jumin.charAt(7)값이 1이라면 
			System.out.println("20세기전 태어난 여자 사람\n"); // ( )안의 문자열을 출력한다.
			break; //switch 종료
		case '3' : //jumin.charAt(7)값이 1이라면
			System.out.println("20세기후 태어난 남자 사람\n"); // ( )안의 문자열을 출력한다.
			break; //switch 종료
		case '4' : //jumin.charAt(7)값이 1이라면
			System.out.println("20세기후 태어난 남자 사람\n"); // ( )안의 문자열을 출력한다.
			break; //switch 종료
		default : //위에 case조건에 하나도 맞지 않다면
			System.out.println("사람\n"); // ( )안의 문자열을 출력한다.
			break; //switch 종료
		} // }닫기
	} // }닫기
} // }닫기
