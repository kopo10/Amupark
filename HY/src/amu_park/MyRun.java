package amu_park;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyRun {
	Scanner sc = null;
	MyOutput out = null;

	public MyRun() {
		sc = new Scanner(System.in);
		out = new MyOutput();
	}

	public int out(int Select) {
		int sum = 0;
		int sum1 = 0;
		// int choose = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kopo10", "root", "kopo10");
			Statement stmt = conn.createStatement();

			ResultSet rset;
			while (Select != 4) {
				if (Select != 1 && Select != 2 && Select != 3) {
					out.Error();
					Select = sc.nextInt();
				}
				if (Select == 1) {
					out.GroupLine();
					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' ORDER BY `date` DESC");
					System.out.print("�ְ��� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
						sum1 += rset.getInt(5);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' AND `age` LIKE '����'");
					System.out.print("���� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' AND `age` LIKE '���'");
					System.out.print("��� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' AND `age` LIKE 'û�ҳ�'");
					System.out.print("û�ҳ� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' AND `age` LIKE '����'");
					System.out.print("���� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' AND `age` LIKE '���'");
					System.out.print("��� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�ְ���' ORDER BY `date` DESC");
					System.out.print("�ְ��� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(5);
					}
					System.out.printf("%s��\n\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' ORDER BY `date` DESC");
					System.out.print("�߰��� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
						sum1 += rset.getInt(5);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' AND `age` LIKE '����'");
					System.out.print("���� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' AND `age` LIKE '���'");
					System.out.print("��� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' AND `age` LIKE 'û�ҳ�'");
					System.out.print("û�ҳ� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' AND `age` LIKE '����'");
					System.out.print("���� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' AND `age` LIKE '���'");
					System.out.print("��� Ƽ�� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s��\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '�߰���' ORDER BY `date` DESC");
					System.out.print("�߰��� �� : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(5);
					}
					System.out.printf("%s��\n\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `count` IS NOT NULL ORDER BY `price` ASC");
					sum = 0;
					sum1 = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
						sum1 += rset.getInt(5);
					}
					System.out.printf("%s%s%s%s%s", "�� �Ǹ� : ", sum, "��\n�� �Ǹ� �ݾ� : ", sum1, "��\n");
					out.choose();
					Select = sc.nextInt();

				} else if (Select == 2) {
					out.DiscountLine();
					rset = stmt
							.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '������ ����' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "�Ϲ� Ƽ�� �Ǹ� �� : ", sum, "��\n");

					rset = stmt.executeQuery(
							"SELECT * FROM `134` WHERE `discount` LIKE '����� ���" + "' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "����� Ƽ�� �� : ", sum, "��\n");

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '������ ���' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "������ Ƽ�� �� : ", sum, "��\n");

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '���ڳ���' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "���ڳ� Ƽ�� �� : ", sum, "��\n");

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '�ӻ�� ���' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "�ӻ�� Ƽ�� �� : ", sum, "��\n");
					out.choose();
					Select = sc.nextInt();

				} else if (Select == 3) {
					out.DayLine();
					rset = stmt.executeQuery("select `date`, sum(price) from `134` Group by `date`");
					sum = 0;
					while (rset.next()) {
						// System.out.println(rset.getString(1));
						// System.out.println(rset.getInt(2));

						// sum += Integer.parseInt(rset.getString(2));
						System.out.printf("%s : %s��\n", rset.getString(1), rset.getInt(2));
					}
					System.out.print("\n");
					// System.out.println(sum);
					out.choose();
					Select = sc.nextInt();
					rset.close();
					// SELECT * FROM `134` WHERE `date` = '2021-04-21'

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sum;
	}
}
