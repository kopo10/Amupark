package G;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GP5<Q> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<String> Q = new LinkedList<String>();

		try {
			for (int i = 0; i < 5; i++) {
				String input = sc.nextLine();
				Q.offer(input);
			}

			Iterator<String> iterator = Q.iterator();
			int count = 1;
			String target = sc.nextLine();
			while (iterator.hasNext()) {

				if (target.equals(iterator.next())) {
					System.out.println(count);
					break;
				} else {
					count++;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}

	}

}