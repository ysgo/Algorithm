package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VisitorList {
	public static void main(String[] args) throws Exception {		
		Class.forName("oracle.jdbc.driver.OracleDriver"); // ����Ŭ ������ jdbc������ �ø��� ���
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
				"jdbctest", "jdbctest"); // JDBC Oracle ��������, DriverManager�� ���Ӱ���(=�����)
										// @IP�ּ�:��Ʈ��ȣ:Oracle����  �������� ����(��Ÿ����)
		
		Statement stmt = conn.createStatement(); // Statement�� �������̽�, create�� ��ü������ ������ִ� �޼ҵ�
		String sql = "select name, writedate, memo from visitor"; // �ڹټҽ����� sql���忡 �����ݷ��� ���̸� �ȵȴ�
		ResultSet rs = stmt.executeQuery(sql); // sql�� ����� ���(��, select���� ��츸)
		System.out.println(conn.getClass().getName());
		System.out.println(stmt.getClass().getName());
		System.out.println(rs.getClass().getName());
		while(rs.next()) {
			System.out.print(rs.getString("name"));
			System.out.print(rs.getString("writedate"));
			System.out.println(rs.getString("memo"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
