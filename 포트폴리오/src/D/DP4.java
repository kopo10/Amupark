package D;

import java.util.Scanner;

public class DP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String formula = sc.nextLine();
		getOperator(formula);

	}

	private static void getOperator(String formula) {
		// TODO Auto-generated method stub

		String op = "";
		if (formula.contains("+")) {
			op = "+";
		} else if (formula.contains("-")) {
			op = "-";
		} else if (formula.contains("*")) {
			op = "*";
		} else if (formula.contains("/")) {
			op = "/";
		}

		int index = formula.indexOf(op);
		int x = Integer.parseInt(formula.substring(0, index));
		int y = Integer.parseInt(formula.substring(index + 1));

		if (op.equals("+")) {
			plus(x, y);
		} else if (op.equals("-")) {
			minus(x, y);
		} else if (op.equals("*")) {
			multiplication(x, y);
		} else if (op.equals("/")) {
			division(x, y);
		}
	}

	public static void plus(int a, int b) {
		System.out.println(a + b);
	}

	public static void minus(int a, int b) {
		System.out.println(a - b);
	}

	public static void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void division(int a, int b) {
		System.out.println(a / b);
	}
}