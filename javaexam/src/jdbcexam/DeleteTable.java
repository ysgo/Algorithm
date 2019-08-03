package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTable {
	public static void main(String[] args) throws Exception {
		//JDBC ����̹��� �ε��Ѵ�.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// �����ͺ��̽� ����. ������ JDBC URL ����
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		PreparedStatement pstmt = conn.prepareStatement(
			"delete from product where balance < ?");
		pstmt.setInt(1, Integer.parseInt(args[0]));
		int del_su = pstmt.executeUpdate();
		System.out.println("��� " + args[0] + "������ ��ǰ ������ " + del_su + "�� �����Ͽ����ϴ�.");
		pstmt.close();
		conn.close();
	}
}
