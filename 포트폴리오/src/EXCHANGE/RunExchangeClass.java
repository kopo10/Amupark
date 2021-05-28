package EXCHANGE;

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
		returnRealUSD = (int) (returnUSD - (returnUSD % 10));
		charge = (int) (moneyKOR - returnRealUSD * ConstValueClass.EX_USD);
		charge = (charge / 10) * 10;
		//돈이 있나
		
		//있으면
		outClass.outputResultUSD(returnRealUSD);
		outClass.outputResultWON(charge);
	}

	public void changeToEUR(int moneyKOR) {
		double returnEUR;
		int returnRealEUR;
		int charge;	
		returnEUR = moneyKOR / ConstValueClass.EX_EUR;
		returnRealEUR = (int) returnEUR;
		charge = (int) (moneyKOR - returnRealEUR * ConstValueClass.EX_EUR);
		charge = (charge / 10) * 10;
		outClass.outputResultEUR(returnRealEUR);
		outClass.outputResultWON(charge);
	}

	public void changeToJPY(int moneyKOR) {
		double returnJPY;
		int returnRealJPY;
		int charge;		
		returnJPY = moneyKOR / ConstValueClass.EX_JPY;
		returnRealJPY = (int) (returnJPY - (returnJPY % 1000));
		charge = (int) (moneyKOR - returnRealJPY * ConstValueClass.EX_JPY);
		charge = (charge / 10) * 10;
		outClass.outputResultJPY(returnRealJPY);
		outClass.outputResultWON(charge);
		
	}

}