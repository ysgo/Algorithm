package jdbcexam;

import java.sql.*;
import java.util.Scanner;

public class SearchEmp2_4 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String dname;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement(
				"select ename, deptno from emp E RIGHT JOIN DEPT D USING(DEPTNO) WHERE DNAME = UPPER(?)");
		ResultSet rs = null;
		while (true) {
			System.out.print("�˻��� �μ� �̸�: ");
			dname = in.next();
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1) == null) {
					System.out.println(dname+" �μ����� �ٹ��ϴ� ������ �����ϴ�.");
				} else {
					System.out.println(dname + " �μ����� �ٹ��ϴ� ������");
					do {
						System.out.println(rs.getString(1));
					} while (rs.next());
				}
			} else
				System.out.println(dname + " �μ��� �������� �ʽ��ϴ�.");

			System.out.println("��� �����Ͻðڽ��ϱ�?(�ƴϿ�: n) ");

			if (in.next().equals("n"))
				break;
		}
		in.close();
	}

}
