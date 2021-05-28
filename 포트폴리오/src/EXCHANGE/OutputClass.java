package EXCHANGE;

public class OutputClass {
	private void printResultUSD (int returnRealUSD, int outputUSD100, 
							   int outputUSD50, int outputUSD10) {				
		System.out.println(returnRealUSD + " �޷�");
		System.out.println("100 �޷� ���� " + outputUSD100 + " �� ");
		System.out.println("50 �޷� ����" + outputUSD50 + " �� ");
		System.out.println("10 �޷� ���� " + outputUSD10 + " �� \n");
	}
	
	private void printResultEUR (int outputEUR500, int outputEUR100, int outputEUR50,
							   int outputEUR20, int outputEUR10, int outputEUR5, 
							   int outputEUR2, int outputEUR1, int returnRealEUR) {
		System.out.println(returnRealEUR + " ����");
		System.out.println("500 ���� ���� " + outputEUR500 + " �� ");
		System.out.println("100 ���� ���� " + outputEUR100 + " �� ");
		System.out.println("50 ���� ���� " + outputEUR50 + " �� ");
		System.out.println("20 ���� ���� " + outputEUR20 + " �� ");
		System.out.println("10 ���� ���� " + outputEUR10 + " �� ");
		System.out.println("5 ���� ���� " + outputEUR5 + " �� ");
		System.out.println("2 ���� ���� " + outputEUR2 + " �� ");
		System.out.println("1 ���� ���� " + outputEUR1 + " �� \n");
	}
	
	private void printResultJPY (int returnRealJPY, int outputJPY10000, 
								int outputJPY5000, int outputJPY1000) {
		System.out.println(returnRealJPY + " �� ");
		System.out.println("10000 �� ���� " + outputJPY10000 + " �� ");
		System.out.println("5000 �� ���� " + outputJPY5000 + " �� ");
		System.out.println("1000 �� ���� " + outputJPY1000 + " �� \n");
	}
					
	private void printResultWON(int charge, int charge5000, int charge1000, int charge500, 
							   int charge100, int charge50, int charge10) {			
		System.out.println("�ܵ� = " + charge + " �� ");
		System.out.println("5000 �� ���� " + charge5000 + " �� ");
		System.out.println("1000 �� ���� " + charge1000 + " �� ");
		System.out.println("500 �� ���� " + charge500 + " �� ");
		System.out.println("100 �� ���� " + charge100 + " �� ");
		System.out.println("50 �� ���� " + charge50 + " �� ");
		System.out.println("10 �� ���� " + charge10 + " �� ");
	}
	
	public void outputResultUSD(int returnRealUSD) {
		int outputUSD100, outputUSD50, outputUSD10;
		outputUSD100 = returnRealUSD / ConstValueClass.CHANGE_USD_100;
		outputUSD50 = (returnRealUSD % ConstValueClass.CHANGE_USD_100) / 50;
		outputUSD10 = ((returnRealUSD % ConstValueClass.CHANGE_USD_100) % 50) / 10;
		printResultUSD(returnRealUSD, outputUSD100, 
				       outputUSD50,outputUSD10);
	}
	public void outputResultEUR(int returnRealEUR) {
		int outputEUR500, outputEUR100, outputEUR50, outputEUR20;
		int outputEUR10, outputEUR5, outputEUR2, outputEUR1;				
		
		outputEUR500 = returnRealEUR / 500;
		outputEUR100 = (returnRealEUR % 500) / 100;
		outputEUR50 = ((returnRealEUR % 500) % 100) / 50;
		outputEUR20 = (((returnRealEUR % 500) % 100) % 50) / 20;
		outputEUR10 = ((((returnRealEUR % 500) % 100) % 50) % 20) / 10;
		outputEUR5 = (((((returnRealEUR % 500) % 100) % 50) % 20) % 10) / 5;
		outputEUR2 = (returnRealEUR % 5) / 2;
		outputEUR1 = (returnRealEUR % 5) % 2;
		
		printResultEUR(outputEUR500, outputEUR100, outputEUR50, outputEUR20,
						outputEUR10, outputEUR5, outputEUR2, outputEUR1, returnRealEUR);
	}

	public void outputResultJPY(int returnRealJPY) {
		int outputJPY10000, outputJPY5000, outputJPY1000;
		outputJPY10000 = returnRealJPY / 10000;
		outputJPY5000 = (returnRealJPY % 10000) / 5000;
		outputJPY1000 = ((returnRealJPY % 10000) % 5000) / 1000;
		printResultJPY(returnRealJPY, outputJPY10000, outputJPY5000, outputJPY1000);
	}

	public void outputResultWON(int charge) {
		 int charge5000, charge1000, charge500,
		     charge100, charge50, charge10;	
		 
		 	
		 	charge5000 = charge / ConstValueClass.CHARGE_KOR_5000;
			charge1000 = (charge % ConstValueClass.CHARGE_KOR_5000) / 1000;
			charge500 = ((charge % ConstValueClass.CHARGE_KOR_5000) % 1000) / 500;
			charge100 = (((charge % ConstValueClass.CHARGE_KOR_5000) % 1000) % 500) / 100;
			charge50 = ((((charge % ConstValueClass.CHARGE_KOR_5000) % 1000) % 500) % 100) / 50;
			charge10 = (((((charge % ConstValueClass.CHARGE_KOR_5000) % 1000) % 500) % 100) % 50) / 10;

		 printResultWON(charge, charge5000, charge1000, charge500, 
				 		charge100, charge50, charge10);	
	}
}
