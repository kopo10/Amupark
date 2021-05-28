package P0308;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		showMyMoney1();

		B main = new B();
		main.showMyMoney2();
		main.showMyMoney3();
		main.showMyMoney4();
		main.showMyMoney5();
	}

	public static void showMyMoney1() {
		System.out.println("1000won");
	}

	public void showMyMoney2() {
		System.out.println("1000won");
	}

	private void showMyMoney3() {
		System.out.println("1000won");
	}

	protected void showMyMoney4() {
		System.out.println("1000won");
	}

	void showMyMoney5() {
		System.out.println("1000won");
	}

}
