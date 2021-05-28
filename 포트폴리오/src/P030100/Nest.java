package P030100;

public class Nest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintClass.q = new PrintClass(1, 2, 5);
	}

}


 class PrintClass{
	int a, b, c;
	public PrintClass(int a,int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	public void printInterger() {
		System.out.println(this.a);
		
	}
}