package PRACTICE;

public class ssssss {

}
//int outputUSD100, outputUSD50, outputUSD10;				
//returnUSD = moneyKOR / EX_USD;
//returnRealUSD = (int)(returnUSD - (returnUSD % 10));	
//outputUSD100 = returnRealUSD / CHANGE_USD_100;
//outputUSD50 = (returnRealUSD % CHANGE_USD_100) / 50;
//outputUSD10 = ((returnRealUSD % CHANGE_USD_100) % 50) / 10;

//		System.out.println(returnRealUSD + " 달러");
//	System.out.println("100 달러 지폐 " + ConstValueClass.outputUSD100 + " 장 ");
//System.out.println("50 달러 지폐" + outputUSD50 + " 장 ");
//System.out.println("10 달러 지폐 " + outputUSD10 + " 장 \n");
runClass.changeToUSD();
}




int charge5000, charge1000, charge500;
int charge100, charge50, charge10;				
charge = (int) (moneyKOR - returnRealUSD * EX_USD);
charge = (charge / 10) * 10;
charge5000 = charge / CHARGE_KOR_5000;
charge1000 = (charge % CHARGE_KOR_5000) / 1000;
charge500 = ((charge % CHARGE_KOR_5000) % 1000) / 500;
charge100 = (((charge % CHARGE_KOR_5000) % 1000) % 500) / 100;	
charge50 = ((((charge % CHARGE_KOR_5000) % 1000) % 500) % 100) / 50;
charge10 = (((((charge % CHARGE_KOR_5000) % 1000) % 500) % 100) % 50) / 10;

System.out.println("잔돈 = " + charge + " 원 ");
System.out.println("5000 원 지폐 " + charge5000 + " 장 ");
System.out.println("1000 원 지폐 " + charge1000 + " 장 ");
System.out.println("500 원 지폐 " + charge500 + " 장 ");
System.out.println("100 원 지폐 " + charge100 + " 장 ");
System.out.println("50 원 지폐 " + charge50 + " 장 ");
System.out.println("10 원 지폐 " + charge10 + " 장 ");														
break;

case CHANGE_TYPE_EUR:
int outputEUR500, outputEUR100, outputEUR50, outputEUR20;
int outputEUR10, outputEUR5, outputEUR2, outputEUR1;
returnEUR = moneyKOR / EX_EUR;
returnRealEUR = (int)returnEUR;		

outputEUR500 = returnRealEUR / 500;
outputEUR100 = (returnRealEUR % 500) / 100;
outputEUR50 = ((returnRealEUR % 500) % 100) / 50;
outputEUR20 = (((returnRealEUR % 500) % 100) % 50) / 20;
outputEUR10 = ((((returnRealEUR % 500) % 100) % 50) % 20) / 10;
outputEUR5 = (((((returnRealEUR % 500) % 100) % 50) % 20) % 10) / 5;
outputEUR2 = (returnRealEUR % 5) / 2;
outputEUR1 = (returnRealEUR % 5) % 2;
		
System.out.println(returnRealEUR + " 유로");
System.out.println("500 유로 지폐 " + outputEUR500 + " 장 ");
System.out.println("100 유로 지폐 " + outputEUR100 + " 장 ");
System.out.println("50 유로 지폐 " + outputEUR50 + " 장 ");
System.out.println("20 유로 지폐 " + outputEUR20 + " 장 ");
System.out.println("10 유로 지폐 " + outputEUR10 + " 장 ");
System.out.println("5 유로 지폐 " + outputEUR5 + " 장 ");																				
System.out.println("2 유로 동전 " + outputEUR2 + " 개 ");
System.out.println("1 유로 동전 " + outputEUR1 + " 개 \n");
			
charge = (int) (moneyKOR - returnRealEUR * EX_EUR);
charge = (charge / 10) * 10;  		
charge5000 = charge / 5000;
charge1000 = (charge / 5000) / 1000;
charge500 = ((charge % 5000) % 1000) / 500;
charge100 = (((charge % 5000) % 1000) % 500) / 100;	
charge50 = ((((charge % 5000) % 1000) % 500) % 100) / 50;
charge10 = (((((charge % 5000) % 1000) % 500) % 100) % 50) / 10;

System.out.println("잔돈 = " + charge + " 원 ");
System.out.println("5000 원 지폐 " + charge5000 + " 장 ");
System.out.println("1000 원 지폐 " + charge1000 + " 장 ");
System.out.println("500 원 지폐 " + charge500 + " 장 ");
System.out.println("100 원 지폐 " + charge100 + " 장 ");
System.out.println("50 원 지폐 " + charge50 + " 장 ");
System.out.println("10 원 지폐 " + charge10 + " 장 ");		
break;

case CHANGE_TYPE_JPY:
int outputJPY10000, outputJPY5000, outputJPY1000;
int outputJPY500, outputJPY100;										
returnJPY = moneyKOR / EX_JPY;
returnRealJPY = (int)(returnJPY - (returnJPY % 1000));		

outputJPY10000 = returnRealJPY / 10000;
outputJPY5000 = (returnRealJPY % 10000) / 5000;
outputJPY1000 = ((returnRealJPY % 10000) % 5000) / 1000;
outputJPY500 = (((returnRealJPY % 10000) % 5000) % 1000) / 500;
outputJPY100 = ((((returnRealJPY % 10000) % 5000) % 1000) % 500) / 100;

System.out.println(returnRealJPY + " 엔 ");
System.out.println("10000 엔 지폐 " + (returnRealJPY / 10000) + " 장 ");
System.out.println("5000 엔 지폐 " + ((returnRealJPY % 10000) / 5000) + " 장 ");
System.out.println("1000 엔 지폐 " + (((returnRealJPY % 10000) % 5000) / 1000) + " 장 \n");
//System.out.println("500 엔 동전 " + ((((returnRealJPY % 10000) % 5000) % 1000) / 500) + " 개 ");
//System.out.println("100 엔 동전 " + (((((returnRealJPY % 10000) % 5000) % 1000) % 500) / 100) + " 개 ");
				
charge = (int) (moneyKOR - returnRealJPY * EX_JPY);
charge = (charge / 10) * 10;  		
charge5000 = charge / 5000;
charge1000 = (charge % 5000) / 1000;
charge500 = ((charge % 5000) % 1000) / 500;
charge100 = (((charge % 5000) % 1000) % 500) / 100;	
charge50 = ((((charge % 5000) % 1000) % 500) % 100) / 50;
charge10 = (((((charge % 5000) % 1000) % 500) % 100) % 50) / 10;

System.out.println("잔돈 = " + charge + " 원 ");
System.out.println("5000 원 지폐 " + charge5000 + " 장 ");
System.out.println("1000 원 지폐 " + charge1000 + " 장 ");
System.out.println("500 원 지폐 " + charge500 + " 장 ");
System.out.println("100 원 지폐 " + charge100 + " 장 ");
System.out.println("50 원 지폐 " + charge50 + " 장 ");
System.out.println("10 원 지폐 " + charge10 + " 장 ");										
break;				
} 
System.out.println("\nNext or please press 0 if you want to exit");
}while (moneyKOR != 0);	*/												
} 
}