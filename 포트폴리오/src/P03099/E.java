package P03099;

public class E  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E m = new E();	
		m.getPriceA(100);
		m.getPriceB(300);
	}

	public void getPriceA(int price) {
		System.out.println(price + 100);
	}
	
	public void getPriceB(int price) {
		System.out.println(price + 1000);
	}
	
	
}
