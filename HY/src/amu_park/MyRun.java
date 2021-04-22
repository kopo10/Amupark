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
					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' ORDER BY `date` DESC");
					System.out.print("주간권 총 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
						sum1 += rset.getInt(5);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' AND `age` LIKE '유아'");
					System.out.print("유아 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' AND `age` LIKE '어린이'");
					System.out.print("어린이 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' AND `age` LIKE '청소년'");
					System.out.print("청소년 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' AND `age` LIKE '성인'");
					System.out.print("성인 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' AND `age` LIKE '어르신'");
					System.out.print("어르신 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '주간권' ORDER BY `date` DESC");
					System.out.print("주간권 총 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(5);
					}
					System.out.printf("%s원\n\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' ORDER BY `date` DESC");
					System.out.print("야간권 총 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
						sum1 += rset.getInt(5);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' AND `age` LIKE '유아'");
					System.out.print("유아 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' AND `age` LIKE '어린이'");
					System.out.print("어린이 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' AND `age` LIKE '청소년'");
					System.out.print("청소년 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' AND `age` LIKE '성인'");
					System.out.print("성인 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' AND `age` LIKE '어르신'");
					System.out.print("어르신 티켓 수 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s매\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `type` LIKE '야간권' ORDER BY `date` DESC");
					System.out.print("야간권 총 : ");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(5);
					}
					System.out.printf("%s원\n\n", sum);

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `count` IS NOT NULL ORDER BY `price` ASC");
					sum = 0;
					sum1 = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
						sum1 += rset.getInt(5);
					}
					System.out.printf("%s%s%s%s%s", "총 판매 : ", sum, "개\n총 판매 금액 : ", sum1, "원\n");
					out.choose();
					Select = sc.nextInt();

				} else if (Select == 2) {
					out.DiscountLine();
					rset = stmt
							.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '우대사항 없음' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "일반 티켓 판매 수 : ", sum, "매\n");

					rset = stmt.executeQuery(
							"SELECT * FROM `134` WHERE `discount` LIKE '장애인 우대" + "' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "장애인 티켓 수 : ", sum, "매\n");

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '유공자 우대' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "유공자 티켓 수 : ", sum, "매\n");

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '다자녀우대' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "다자녀 티켓 수 : ", sum, "매\n");

					rset = stmt.executeQuery("SELECT * FROM `134` WHERE `discount` LIKE '임산부 우대' ORDER BY `price` ASC");
					sum = 0;
					while (rset.next()) {
						sum += rset.getInt(4);
					}
					System.out.printf("%s%s%s", "임산부 티켓 수 : ", sum, "매\n");
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
						System.out.printf("%s : %s원\n", rset.getString(1), rset.getInt(2));
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
