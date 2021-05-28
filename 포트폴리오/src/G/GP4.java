package G;

import java.util.HashSet;
import java.util.Scanner;

public class GP4 {

	public static HashSet<String> h1 = new HashSet<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] p = sc.nextLine().split("");
		String[] q = sc.nextLine().split("");

		System.out.println(p.length);
		System.out.println(q.length);
		try {
			int count = 0;
			for (int i = 0; i < p.length; i++) {
				h1.add(p[i]);
			}
			for (int i = 0; i < q.length; i++) {
				if (h1.contains(q[i])) {
					count++;
				}
			}
			System.out.println(count);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}