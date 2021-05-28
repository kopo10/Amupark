package G;

import java.util.Arrays;
import java.util.Scanner;

public class GP22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();
			sc.nextLine();
			
			String str = sc.nextLine();

			String[] s = str.split(" ");

			int[] nums = new int[n];

			for (int i = 0; i < s.length; i++) {
				nums[i] = Integer.parseInt(s[i]);
			}

			Arrays.sort(nums);
			for (int i = 0; i < s.length; i++) {
				System.out.print(nums[i] + " ");
			}

		} catch (Exception e) {
			System.out.println("error");
		}

	}
}
