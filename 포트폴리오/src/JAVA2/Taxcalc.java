package JAVA2;

public class Taxcalc {
	
	public static int taxcal(int k_10val, int k_10rate) { //int 메소드에 int 변수를 두개 받아준다, void가 아니니까			
		int k_10ret; // int k_10ret 선언                                  // return 값 입력
		if ( ((double)k_10val * (double)k_10rate / 100.0) == k_10val * k_10rate / 100)
			// double 로 계산했을 때는 소숫점이 나올 수 잇으므로 만약 double 과 int 값이 같다면 그대로 계산
			k_10ret = k_10val * k_10rate / 100;
		else 
			k_10ret = k_10val * k_10rate / 100 + 1; //만약 값이 다르다면 분모에 1을 추가해줘서 세금부담을 소비자에게 전가해준다.
		
		return k_10ret; //int기 때문에 return 값을 받는다.	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10val = 273; //제품 가격을 받아준다
		int k_10rate = 3; // 세금율을 받아준다.
		int k_10tax = taxcal(k_10val, k_10rate); // taxcal 에서 만든 if문을 가져온다.
		
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
		System.out.printf("★★★             단순 세금 계산             ★★\n");  //입력할 값을 한글로 출력
		System.out.printf("실제 세금계산: %f\n", k_10val * k_10rate / 100.0); //소수점까지 있는 실제 세금을 printf를 사용해서 받는다.
		System.out.printf("    세전가격: %d     세금 : %d  세금포함가격: %d\n",      //d를 이용해서 정수로 세전가격 세금 세금포함 가격을 받아준다.
							+  k_10val, k_10tax, k_10val + k_10tax);		
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
		
		
		
		
		
		
	}

}
