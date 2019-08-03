package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VisitorList2 {
	public static void main(String[] args) {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����Ŭ ������ jdbc������ �ø��� ���
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
					"jdbctest","jdbctest"); // JDBC Oracle ��������, DriverManager�� ���Ӱ���(=�����)
									// @IP�ּ�:��Ʈ��ȣ:Oracle���� �������� ����(��Ÿ����)

			stmt = conn.createStatement(); // Statement�� �������̽�, create�� ��ü������ ������ִ� �޼ҵ�
			String sql = "select name, writedate, memo from visitor"; // �ڹټҽ����� sql���忡 �����ݷ��� ���̸� �ȵȴ�
			rs = stmt.executeQuery(sql); // sql�� ����� ���(��, select���� ��츸)
			while (rs.next()) {
				System.out.print(rs.getString("name"));
				System.out.print(rs.getString("writedate"));
				System.out.println(rs.getString("memo"));
			}
		} catch (Exception e) {
			System.err.println("���� �߻� : " + e.toString()); // toString�� ���ܿ� �޽��� ����
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
