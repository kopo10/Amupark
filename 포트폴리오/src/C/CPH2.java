package C;

import java.util.Scanner;

public class CPH2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] unit = new int[num];
		String[] grade = new String[num];
		double[] score = new double[num];
		double sum = 0;
		double unit1 = 0;
		double Gpa = 0;

		for (int i = 0; i < num; i++) {
			unit[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			grade[i] = sc.next();
			if (grade[i].equals("A+")) {
				score[i] = 4.5;
			} else if (grade[i].equals("A0")) {
				score[i] = 4.0;
			} else if (grade[i].equals("B+")) {
				score[i] = 3.5;
			} else if (grade[i].equals("B0")) {
				score[i] = 3.0;
			} else if (grade[i].equals("C+")) {
				score[i] = 2.5;
			} else if (grade[i].equals("C0")) {
				score[i] = 2.0;
			} else if (grade[i].equals("F")) {
				score[i] = 0;
			}
			sum += unit[i] * score[i];
			unit1 += unit[i];
		}
		Gpa = sum / unit1;
		System.out.println(Gpa);
	}
}
