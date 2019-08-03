package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	public static void main(String[] args) throws Exception {
		try {
			//JDBC ����̹��� �ε��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//������ ���̽��� �����Ѵ�. ������ JDBC URL �����Ѵ�
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into product values('00001', '10', '�ڹ� ���α׷���', 50, 16500)");
			stmt.executeUpdate("insert into product values('00002', '10', 'J2EE ���� ����', 40, 12000)");
			stmt.executeUpdate("insert into product values('00003', '10', 'JSP 2.0', 60, 18000)");
			System.out.println("�����͵��� �߰��Ͽ����ϴ�.");
			stmt.close();
			conn.close();
		} catch(SQLException e) {
			System.out.println("���� �߻� : " + e);
		}
	}
}
