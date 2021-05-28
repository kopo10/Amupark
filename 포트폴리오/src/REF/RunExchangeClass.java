package REF;


public class RunExchangeClass {
	public OutputClass outClass = null;
	
	public RunExchangeClass() {
		outClass = new OutputClass();
	}
	
	public void changeToUSD(int moneyKOR) {
		double returnUSD;
		int returnRealUSD;
		int charge;
		
		returnUSD = moneyKOR / ConstValueClass.EX_USD;
		returnRealUSD = (int)returnUSD;	
		
		outClass.outputResultUSD(returnRealUSD);
		
		charge = (int) (moneyKOR - returnRealUSD * ConstValueClass.EX_USD);
		charge = (charge / 10) * 10;  	
		
		outClass.outputResultWon(charge);												
	}
	public void changeToEUR(int moneyKOR) {
		double returnEUR;
		int returnRealEUR;
		int charge;
		returnEUR = moneyKOR / ConstValueClass.EX_EUR;
		returnRealEUR = (int)returnEUR;		
		System.out.println(returnRealEUR + " ����");
		System.out.println("500 ���� ���� " 
							+ (returnRealEUR / 500) + " �� ");
		System.out.println("100 ���� ���� " 
							+ ((returnRealEUR % 500) / 100) + " �� ");
		System.out.println("50 ���� ���� " 
							+ (((returnRealEUR % 500) % 100) / 50) + " �� ");
		System.out.println("20 ���� ���� " 
							+ ((((returnRealEUR % 500) % 100) % 50) / 20) + " �� ");
		System.out.println("10 ���� ���� " 
							+ (((((returnRealEUR % 500) % 100) % 50) % 20) / 10) + " �� ");
		System.out.println("5 ���� ���� " 
							+ ((((((returnRealEUR % 500) % 100) % 50) % 20) % 10) / 5) + " �� ");																				
		System.out.println("2 ���� ���� " 
							+ ((returnRealEUR % 5) / 2) + " �� ");
		System.out.println("1 ���� ���� " 
							+ (((returnRealEUR % 5)) % 2) + " �� ");
					
		charge = (int) (moneyKOR - returnRealEUR * ConstValueClass.EX_EUR);
		charge = (charge / 10) * 10;  	
		
		outClass.outputResultWon(charge);	
	}
	public void changeToJPY(int moneyKOR) {
		double returnJPY;
		int returnRealJPY;
		int charge;
		returnJPY = moneyKOR / ConstValueClass.EX_JPY;
		returnRealJPY = (int)returnJPY;		
		System.out.println(returnRealJPY + " �� ");
		System.out.println("10000 �� ���� " 
							+ (returnRealJPY / 10000) + " �� ");
		System.out.println("5000 �� ���� " 
							+ ((returnRealJPY % 10000) / 5000) + " �� ");
		System.out.println("1000 �� ���� " 
							+ (((returnRealJPY % 10000) % 5000) / 1000) + " �� ");
		System.out.println("500 �� ���� " 
							+ ((((returnRealJPY % 10000) % 5000) % 1000) / 500) + " �� ");
		System.out.println("100 �� ���� " 
							+ (((((returnRealJPY % 10000) % 5000) % 1000) % 500) / 100) + " �� ");
						
		charge = (int) (moneyKOR - returnRealJPY * ConstValueClass.EX_JPY);
		charge = (charge / 10) * 10;  	
		
		outClass.outputResultWon(charge);		
	}
}
