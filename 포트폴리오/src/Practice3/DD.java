package Practice3;

import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] op = { "+", "-", "*", "/" };
		String b = "";
		String c = "";
		String op1 = "";

		for (int i = 0; i < op.length; i++) {
			if (a.contains(op[i])) {
				b = a.substring(0, a.indexOf(op[i]));
				c = a.substring(a.indexOf(op[i]) + 1);
				op1 = op[i];
			}
		}
		if (b.contains(".") || c.contains(".")) {
			double bb = Double.parseDouble(b);
			double cc = Double.parseDouble(c);
			System.out.println(op2(bb, cc, op1));
		} else {
			int bbb = Integer.parseInt(b);
			int ccc = Integer.parseInt(c);
			System.out.println(op2(bbb, ccc, op1));

		}

	}

	public static int op2(int a, int b, String opp) {
		int ret = 0;
		if (opp.contains("+")) {
			ret = a + b;
		} else if (opp.contains("-")) {
			ret = a - b;
		} else if (opp.equals("*")) {
			ret = a * b;
		} else if (opp.contains("/")) {
			ret = a / b;
		}

		return ret;
	}

	public static double op2(double a, double b, String opp) {
		double ret = 0;
		if (opp.contains("+")) {
			ret = a + b;
		} else if (opp.contains("-")) {
			ret = a - b;
		} else if (opp.contains("*")) {
			ret = a * b;
		} else if (opp.contains("/")) {
			ret = a / b;
		}

		return ret;
	}

}
