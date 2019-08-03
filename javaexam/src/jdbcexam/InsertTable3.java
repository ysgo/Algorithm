package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTable3 {
	public static void main(String[] args) throws Exception {
		try {
			//JDBC ����̹��� �ε��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//������ ���̽��� �����Ѵ�. ������ JDBC URL �����Ѵ�
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			PreparedStatement pstmt = conn.prepareStatement(
					"insert into product values (?,?,?,?,?)");
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setInt(4, Integer.parseInt(args[3]));
			pstmt.setFloat(5, Float.parseFloat(args[4]));
			pstmt.executeUpdate();
			System.out.println("�����͵��� �߰��Ͽ����ϴ�.");
			pstmt.close();
			conn.close();
		} catch(SQLException e) {
			System.out.println("���� �߻� : " + e);
		}
	}
}
