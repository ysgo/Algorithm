package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable2 {
	public static void main(String[] args) throws Exception {
		try {
			//JDBC ����̹��� �ε��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//������ ���̽��� �����Ѵ�. ������ JDBC URL �����Ѵ�
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into product values"
					+ "('" + args[0] + "','" + args[1] + "', '" + args[2] + "'," + 
					args[3] + "," + args[4] + ")");
			System.out.println("�����͵��� �߰��Ͽ����ϴ�.");
			stmt.close();
			conn.close();
		} catch(SQLException e) {
			System.out.println("���� �߻� : " + e);
		}
	}
}
