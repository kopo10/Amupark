package P03099;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintClass printClass = new PrintClass(1, 7, 3);
		printClass.printAdd();
		printClass.printInteger();
	}

}

class PrintClass {
	int a, b, n ;
	
	public PrintClass (int a, int b, int n) {
		this.a = a;
		this.b = a;
		this.n = a;						
	}
	public void printInteger() {
		System.out.println(this.n);
	}
	public void printAdd() {
		int sum;
		sum = this.a +this.b;
		System.out.println(sum);
	}


}
