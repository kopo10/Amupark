package JAVA2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Comma {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int k_10MyWon = 1000000; // int로 k_10MyWon의 값을 1000000으로 정의해준다.
	double k_10MoneyEx = 1238.21; //double로 환율을 1238.21로 정의해준다.
	double k_10commission = 0.003; // double로 k_10commission을 0.3%로 정의해준다.
	int k_10usd = (int) (k_10MyWon / k_10MoneyEx); // 환전할 원화를 환율로 나눈후 int를 이용해서 정수로 변환
	int k_10remain = (int) (k_10MyWon - k_10usd * k_10MoneyEx);	// 환전할 원화에서 13쥴의 소수점을 제거한 달러에서 환율을 곱해준걸
	                                                            // 빼주면 잔돈이 남게된다.
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
	System.out.printf("★              수수료 없이 계산                   ★\n"); // 수수료 출력
	System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 잔돈: %d원\n", k_10MyWon, k_10usd, k_10remain); //계산된 값을 출력
																	// 환전할 금액과 환전한 달러 그리고 잔돈을 출력해준다. 
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n\n\n\n\n"); //별을 출력

	double k_10ComPerOne = k_10MoneyEx * k_10commission; //환율과 커미션퍼센트를 곱해준다.
	
	double k_10totalcom = k_10usd * k_10ComPerOne; //교환할 달러 * (환율과 커미션퍼센트를 곱해준다.)
	
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
	System.out.printf("★              수수료 계산                                   ★\n"); // 수수료 출력
	System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k_10totalcom, k_10usd, k_10ComPerOne);
																	// f%를 통해 수수료의 소숫점까지 표시해준다. 달러당 수수료도 소수점으로
																	//	표시해준다.
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n\n\n\n\n"); //별을 출력	

	int k_10i_totalcom = 0; //k_10i_totalcom을 0으로 정의해준다.
	if (k_10totalcom != (double) ((int)k_10totalcom)) { //만약 커미션이 정수가 아니라면)
		k_10i_totalcom = (int)k_10totalcom + 1; // 1을 더해줘서 수수료를 극대화한다.
	} else {
		k_10i_totalcom = (int) k_10totalcom; //정수라면 그대로 출력
	}
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");//별을 출력
	System.out.printf("★              수수료 적용환전                                             ★\n"); // 수수료 출력
	System.out.printf("총 수수료: %11d원 => 미화: %d달러, 달러당 수수료: %f원\n", k_10i_totalcom, k_10usd, k_10ComPerOne); // 수수료와 달러는 정수로 표시
																												//달러당 수수료는 소수점까지 표시(어차피 받는 수수료는 올려주기 때문에)				
	k_10remain = (int) (k_10MyWon - k_10usd * k_10MoneyEx - k_10i_totalcom); // 환전할 금액에서 수수료와 내가 받을 미국달러를 환율로 곱해준 금액을 뺴준다
	System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징수: %6d원     잔돈: %d원 \n", k_10MyWon, k_10usd, k_10i_totalcom, k_10remain);
																						//환전할 금액 달러 수수료 잔돈을 출력해준다
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n\n\n\n\n");	//별을 출력																				
														//수수료를 정수로 표현한 k_10i_totalcom를 출력해준다. 문제는 환전 할 당시에는 수수료를 생각 안했길 때문에
														//잔돈이 마이너스가 될 수 있다.
	
	
	k_10usd = (int) (k_10MyWon / (k_10MoneyEx + k_10ComPerOne)); // 내가 환전할 금액에 환율과 달러당 수수료를 더한 값을 나눠준 값을 int로 정의한다.
	k_10totalcom = k_10usd * k_10ComPerOne; // int로 정의한 k_10usd가 내가 환전할 금액이고 그 금액에 달러당 수수룔를 곱해주면 내가 내야할 수수료가 나온다.
	
	if (k_10totalcom != (double) ((int)k_10totalcom)) { //내가 내야할 수수료가 정수가 아니라면
		k_10i_totalcom = (int)k_10totalcom + 1; // 수수료를 int로 변환 후 1을 더해준다.
	} else {
		k_10i_totalcom = (int)k_10totalcom; //정수라면 그것이 나의 수수료.
	}
		
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
	System.out.printf("★              (정확한) 수수료 적용환전                                  ★\n"); // 수수료 출력
	System.out.printf("총 수수료: %11d원 => 미화: %d달러 달러당 수수료: %f원\n",
						k_10i_totalcom, k_10usd, k_10ComPerOne); // 총 수수료(+ 1을 통해 소비자에게 전가한) 달러 수수료를 출력한다
	
	k_10remain = (int) (k_10MyWon - k_10usd * k_10MoneyEx - k_10i_totalcom); // 원하는 환전금액에서 달러를 환율로 곱한 금액이랑 수수료를 뺀다.
	System.out.printf("총 한화환전금액: %d원 => 미화: %d달러 수수료징수:%10d원 잔돈: %d원 \n",
						k_10MyWon, k_10usd, k_10i_totalcom, k_10remain); // 총환전금액 달러 수수료 잔돈을 출력한다.
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n\n\n\n\n");//별을 출력

	
	
	
	DecimalFormat k_10df = new DecimalFormat( "###,###,###,###,###" ); //자릿수 정하기
	
	Calendar k_10cal = Calendar.getInstance(); //Calendar을 불러온다.
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n"); //별을 출력
	System.out.printf("★                         콤마찍기, 날짜 적용                             ★\n");	// 수수료 출력
	System.out.printf("총 수수료: %13s원 => 미화: %s달러 달러당 수수료: %f원 \n", //출력할 값을 한글로 적는다.
			k_10df.format(k_10i_totalcom), k_10df.format(k_10usd), k_10ComPerOne); // 총수수료 , 교환할 달러 달러당 수수료를 출력
	System.out.printf("총 한화환전금액: %s원 => 미화: %s달러 수수료징수: %10s원 잔돈: %s원 \n", k_10df.format(k_10MyWon), k_10df.format(k_10usd), k_10df.format(k_10i_totalcom), k_10df.format(k_10remain));
	 																				//총 환전하고 싶은 금액 바꿀수 있는 달러 수수료 남은 잔돈을 출력해준다.
	SimpleDateFormat k_10sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //현재 시간을 YYYY/MM/dd HH:mm:ss형태로 출력 
	System.out.printf("최종실행시간: %21s\n" , k_10sdt.format(k_10cal.getTime()));  //k_10sdt에 입력한 YYYY/MM/dd HH:mm:ss의																			
	                                                                        // 형태로 현재 시간을 출력해준다.				
	System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");	//별을 출력
	}
}
