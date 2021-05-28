package soft6;

public class P2 {
	static int k_10_iStatic; // 클래스내 전역 변수 static에 주의
	
	public static void add(int k_10_i) {
		k_10_iStatic++; //k_10_iStatic 선언
		k_10_i++; //k_10_i선언
		System.out.printf("addd메소드에서->iStatic=[%d]\n", k_10_iStatic); // ( ) 출력
		System.out.printf("addd메소드에서->i=[%d]\n", k_10_i); // ( ) 출력
	}
	
	public static int add2(int k_10_i) {
		k_10_iStatic++; //k_10_iStatic 선언
		k_10_i++; //k_10_i선언
		System.out.printf("add메소드에서->Static=[%d]\n", k_10_iStatic); // ( ) 출력
		System.out.printf("add메소드에서->i=[%d]\n", k_10_i);// ( ) 출력
		return k_10_i;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iMain; //k_10_iMain을 int로 선언
		
		k_10_iMain = 1; //k_10_iMain 을 1로 정의
		k_10_iStatic = 1; // k_10_iStatic을 1로 정의
		
		System.out.printf("**********************************\n"); // ( ) 출력
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", k_10_iStatic); // ( ) 출력
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n", k_10_iMain); // ( ) 출력
		System.out.printf("**********************************\n"); // ( ) 출력
		
		add(k_10_iMain);
		
		System.out.printf("**********************************\n"); // ( ) 출력
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n", k_10_iStatic); // ( ) 출력
		System.out.printf("메소드호출후 메인에서->iMain=[%d]\n", k_10_iMain); // ( ) 출력
		System.out.printf("**********************************\n"); // ( ) 출력
		
		k_10_iMain = add2(k_10_iMain); //이런식으로 값을 전달하고 받는 방법이 이해하기 쉬움
							 //전역변수로 선언후 이함수.. 아니 메소드 저메소드에서 변경해 버리면
		                     //도대체 어떻게 로직이 되었는지 알아보기 어렵다.
		
		System.out.printf("**********************************\n"); // ( ) 출력
		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n", k_10_iStatic); // ( ) 출력
		System.out.printf("메소드 add2호출후 메인에서->iMain=[%d]\n", k_10_iMain); // ( ) 출력
		System.out.printf("**********************************\n"); // ( ) 출력
		
		
	}

}
