package PRACTICE;



public class C {

	public static void menu() {
		// TODO Auto-generated method stub			
		System.out.println("Price\n1. apple\n2. Strawberry\n3. Grape\n4. Watermelon");	
				
	}
	public int getG (int a) {
		int price = 0;
		if (a == 1) {
			price = 1000;
		} else if (a == 2) {
			price = 2000;
		} else if (a == 3) {
			price = 3000;
		} else if (a == 4) {
			price = 4000;
		}
			return  price;
	}
}
