package PRACTICE;

public class ssssss {

}
//int outputUSD100, outputUSD50, outputUSD10;				
//returnUSD = moneyKOR / EX_USD;
//returnRealUSD = (int)(returnUSD - (returnUSD % 10));	
//outputUSD100 = returnRealUSD / CHANGE_USD_100;
//outputUSD50 = (returnRealUSD % CHANGE_USD_100) / 50;
//outputUSD10 = ((returnRealUSD % CHANGE_USD_100) % 50) / 10;

//		System.out.println(returnRealUSD + " �޷�");
//	System.out.println("100 �޷� ���� " + ConstValueClass.outputUSD100 + " �� ");
//System.out.println("50 �޷� ����" + outputUSD50 + " �� ");
//System.out.println("10 �޷� ���� " + outputUSD10 + " �� \n");
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

System.out.println("�ܵ� = " + charge + " �� ");
System.out.println("5000 �� ���� " + charge5000 + " �� ");
System.out.println("1000 �� ���� " + charge1000 + " �� ");
System.out.println("500 �� ���� " + charge500 + " �� ");
System.out.println("100 �� ���� " + charge100 + " �� ");
System.out.println("50 �� ���� " + charge50 + " �� ");
System.out.println("10 �� ���� " + charge10 + " �� ");														
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
		
System.out.println(returnRealEUR + " ����");
System.out.println("500 ���� ���� " + outputEUR500 + " �� ");
System.out.println("100 ���� ���� " + outputEUR100 + " �� ");
System.out.println("50 ���� ���� " + outputEUR50 + " �� ");
System.out.println("20 ���� ���� " + outputEUR20 + " �� ");
System.out.println("10 ���� ���� " + outputEUR10 + " �� ");
System.out.println("5 ���� ���� " + outputEUR5 + " �� ");																				
System.out.println("2 ���� ���� " + outputEUR2 + " �� ");
System.out.println("1 ���� ���� " + outputEUR1 + " �� \n");
			
charge = (int) (moneyKOR - returnRealEUR * EX_EUR);
charge = (charge / 10) * 10;  		
charge5000 = charge / 5000;
charge1000 = (charge / 5000) / 1000;
charge500 = ((charge % 5000) % 1000) / 500;
charge100 = (((charge % 5000) % 1000) % 500) / 100;	
charge50 = ((((charge % 5000) % 1000) % 500) % 100) / 50;
charge10 = (((((charge % 5000) % 1000) % 500) % 100) % 50) / 10;

System.out.println("�ܵ� = " + charge + " �� ");
System.out.println("5000 �� ���� " + charge5000 + " �� ");
System.out.println("1000 �� ���� " + charge1000 + " �� ");
System.out.println("500 �� ���� " + charge500 + " �� ");
System.out.println("100 �� ���� " + charge100 + " �� ");
System.out.println("50 �� ���� " + charge50 + " �� ");
System.out.println("10 �� ���� " + charge10 + " �� ");		
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

System.out.println(returnRealJPY + " �� ");
System.out.println("10000 �� ���� " + (returnRealJPY / 10000) + " �� ");
System.out.println("5000 �� ���� " + ((returnRealJPY % 10000) / 5000) + " �� ");
System.out.println("1000 �� ���� " + (((returnRealJPY % 10000) % 5000) / 1000) + " �� \n");
//System.out.println("500 �� ���� " + ((((returnRealJPY % 10000) % 5000) % 1000) / 500) + " �� ");
//System.out.println("100 �� ���� " + (((((returnRealJPY % 10000) % 5000) % 1000) % 500) / 100) + " �� ");
				
charge = (int) (moneyKOR - returnRealJPY * EX_JPY);
charge = (charge / 10) * 10;  		
charge5000 = charge / 5000;
charge1000 = (charge % 5000) / 1000;
charge500 = ((charge % 5000) % 1000) / 500;
charge100 = (((charge % 5000) % 1000) % 500) / 100;	
charge50 = ((((charge % 5000) % 1000) % 500) % 100) / 50;
charge10 = (((((charge % 5000) % 1000) % 500) % 100) % 50) / 10;

System.out.println("�ܵ� = " + charge + " �� ");
System.out.println("5000 �� ���� " + charge5000 + " �� ");
System.out.println("1000 �� ���� " + charge1000 + " �� ");
System.out.println("500 �� ���� " + charge500 + " �� ");
System.out.println("100 �� ���� " + charge100 + " �� ");
System.out.println("50 �� ���� " + charge50 + " �� ");
System.out.println("10 �� ���� " + charge10 + " �� ");										
break;				
} 
System.out.println("\nNext or please press 0 if you want to exit");
}while (moneyKOR != 0);	*/												
} 
}