package EXCHANGE;

public class Excahnge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		int moneyKOR = 0;
		int input = 0;
		InputClass inputClass = new InputClass();				
		RunExchangeClass runClass = new RunExchangeClass();
		
		do {		
			moneyKOR = inputClass.inpuFromConsoleWon();
			input = inputClass.inpuFromConsoleType();
			switch (input) {
				case ConstValueClass.CHANGE_TYPE_USD:
					runClass.changeToUSD(moneyKOR);
					break;
				case ConstValueClass.CHANGE_TYPE_EUR:
					runClass.changeToEUR(moneyKOR);
					break;
				case ConstValueClass.CHANGE_TYPE_JPY:
					runClass.changeToJPY(moneyKOR);
					break; 							
			}
		} while(moneyKOR != 0);
	}
}
				
 