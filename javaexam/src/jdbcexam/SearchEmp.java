package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmp {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
				"scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement("select upper(ename) ename, "
				+ "to_char(hiredate, 'yyyy\"��\" mm\"��\"') hiredate, deptno from emp where deptno=?");
		Scanner scn = new Scanner(System.in);
		boolean bl = true;
		while(bl) {
			System.out.print("�˻��� ������ �μ���ȣ�� �Է��Ͻÿ� : ");
			String deptno = scn.next();
			pstmt.setString(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
				System.out.println(rs.getString("ename") + " ������ �ٹ����Դϴ�.");
				System.out.println(rs.getString("hiredate") + "�� �Ի��߰� ���� " + rs.getString("deptno") + "�μ����� �ٹ��ϰ� �ֽ��ϴ�.");
				} while(rs.next());
			}
			else {
				System.out.println(deptno + "������ �ٹ����� �ʽ��ϴ�.");
			}
			System.out.print("���(1) | ����(1����) : ");
			int n = scn.nextInt();
			if(n != 1)
				bl = false;
			System.out.println("�˻� ��");
		}
		scn.close();
		pstmt.close();
		conn.close();
	}
}
