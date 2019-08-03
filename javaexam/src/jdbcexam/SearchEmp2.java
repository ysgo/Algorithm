package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmp2 {
	public static void main(String[] args) throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			Scanner sc = new Scanner(System.in);
			String sql = "select ename from emp e natural join dept d where d.dname=?";
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			boolean bl = true;
			while(bl) {
				System.out.print("�˻��� ������ �μ����� �Է��ϼ��� : ");
				String dn = sc.next().toUpperCase();
				pstmt.setString(1, dn);
				ResultSet rs = pstmt.executeQuery();
				if(rs.isBeforeFirst()) {
					if(rs.getString(1) == null) {
						System.out.println(dn + "�μ����� �ٹ��ϴ� ������ �����ϴ�.");
					} else {
						System.out.println(dn + "�μ����� �ٹ��ϴ� ������");
						while(rs.next()) {
							System.out.println(rs.getString(1));
						}	
					}
				}
//					System.out.println(dn + "�μ����� �ٹ��ϴ� ������");
//					do {
//						System.out.println(rs.getString(1));
//					} while(rs.next());
//				} else {
//					String sql2 = "select dname from dept where dname='"+dn+"'";
//					Statement st = conn.createStatement();
//					ResultSet st1 = st.executeQuery(sql2);
//					if(st1.next()) {
//						System.out.println(dn + "�μ����� �ٹ��ϴ� ������ �����ϴ�.");
//					} else {
//						System.out.println(dn + "�μ��� �������� �ʽ��ϴ�.");
//				}
				else {
					System.out.println(dn + "�μ��� �������� �ʽ��ϴ�.");
				}
				System.out.print("���(Y) | ����(N) : ");
				dn = sc.next().toUpperCase();
				if(dn.equals("N")) {
					bl = false;
					System.out.println("�˻� ����");
				}
			}
			sc.close();
			pstmt.close();
			conn.close();
	}
}
