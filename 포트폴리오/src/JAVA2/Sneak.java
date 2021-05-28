package JAVA2;

public class Sneak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k_10item = {"맛동산", "웨하스", "롯센드", "오오땅", "사브레"}; //Stirng 배열로 과자들을 나열한다.
		int[] k_10price = {1000, 2000, 3000, 2500, 1450}; // int로 과자들의 가격을 받아 온다.
		int[] k_10amount = {10, 2, 1, 3, 5}; // int로 과자들의 수량을 받아 온다.
		double k_10tax_rate = 0.1; // double로 과자들의 세금을 가져온다.
		int k_10total_sum = 0; // sum과 같은 수를 이용할 땐 0으로 값을 지정해준다. 하지 않으면 원하지 않는 값의 차이가 날 수 있다.
		
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("★★           너가 지른 과자들        ★★\n");
		System.out.printf("항 목     단 가      수 량         합 계   \n");
		for (int k_10i = 0; k_10i < k_10item.length; k_10i++) {     //length는 과자들 종류만큼이라는 뜻이다 5가지가 있으니까 5개.
				int k_10sum = k_10price[k_10i] * k_10amount[k_10i]; // k_10price[i] * k_10amount[i] i번째 있는 구매한 과자수량과 가격을 곱한 값이다.
				                                            // 밑에 출력에 합계에 들어간다.
				k_10total_sum = k_10total_sum + k_10sum;	//  k_10price[i] * k_10amount[i] i번째까지의 과자와 수량을 곱한 값들을 전부 합해준것이다.
				System.out.printf("%.6s %7d %9d %12d\n" , k_10item[k_10i], k_10price[k_10i], k_10amount[k_10i], k_10sum);													
		}  // s의 .5는 5만큼의 글자를 출력하는 명령어고 7d의 7은 7만큼 빈칸을 만들어 주는 명령어이다.
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("지불 금액 : %26d\n" , k_10total_sum); // 20줄만큼 띄어쓰고 k_10total_sum값을 입력하는 것이다.
		
		int k_10total_net_price = (int)(k_10total_sum / (1 + k_10tax_rate)); // 내가 산 과자들의 총합을 1+세금으로 나눠준다.
		System.out.printf("과세 금액 : %26d\n" , k_10total_net_price); //25줄에서 계산한 것이 세전 금액이다.
		int k_10tax =k_10total_sum - k_10total_net_price;     //소비자 가격에서 세전금액을 빼주면 세금이 된다.
		System.out.printf("세    금 : %26d\n" , k_10tax);	  //세금 출력
		
		
		
		
		
		}

}
