package G;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		int print = num;
		int print1 = base;
		int aa = 0;
		// int print2 = 100;
		int sum = 0;
		int[] print3 = new int[sum];
		while (true) {
			aa = print % base;
			print1 = print / base;
			// print1 = num / base;
			// System.out.println(aa + " ");
			list.add(aa);
			print = print1;
			sum++;
			if (print < base) {
				list.add(print);
				break;
			}
		}
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i).toString();
		}

		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(array[i]);
			;
		}
	}
}

//인터페이스랑 비슷하게 껍대기만
//인터페이스랑 다른점은 조금 더 구현이 가능
//int[] array = new int[list.size()];
//for(int i = 0; i < list.size(); i++) {
//     array[i] = list.get(i);
//}