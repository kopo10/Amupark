package JAVA2;

public class MyTest {

	public static int k_10netprice(int k_10price, double k_10rate) { //int로 받고 인자로 int k_10price, double k_10rate
																	 // 받아준다.
			return (int)(k_10price / (1 + k_10rate));               // int이기 때문에 return 값을 받아준다.
		}													  
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10price = 1234;           // k_10price 를 int로 받고 1234로 지정해준다. 
		double k_10tax_rate = 0.1;      // double로 세율을 0.1로 지정해준다.
		
		int k_10netprice = k_10netprice(k_10price, k_10tax_rate); // k_10netprice를 불러와서 가격과 세율을 입력한다.
		int k_10tax = k_10price - k_10netprice; // 소비자 가격에서 세전가격을 빼준다.
		
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
		System.out.printf("★         소비자가격, 세전가격, 세금 계산           ★\n"); // 출력하고 싶은 내용을 입력해준다.
		System.out.printf(" 소비자 가격: %d, 세전가격: %d 세금: %d\n", k_10price, k_10netprice, k_10tax);
		                               //소비자 가격 , 세전가격, 세금을 %d를 이용해서 정수로 출력해준다.
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력										
	}	
}
