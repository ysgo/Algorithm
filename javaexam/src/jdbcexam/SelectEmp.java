package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmp {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE"
				, "scott", "tiger");
		Statement stmt = conn.createStatement();
		String sql = "select ename, to_char(sal, '999,999') as sal"
				+ ", to_char(hiredate, 'yyyy\"��\" mm\"��\" dd\"��\"') as hiredate from emp";
		// ��, �̷��� �Ǹ� �Ѱ��� ���� �����ԵǾ� ȿ���� �������� �ִ�.
		ResultSet rs = stmt.executeQuery(sql);
		// �ϳ��� Statement ��ü������ �ϳ��� ResultSet�� �޴´�. 2���̻��� �ɰ�� ������ ResultSet�� �����
		Random rd = new Random();
		boolean bl = rd.nextBoolean();
		if(bl) {
			while(rs.next()) {
				System.out.printf("%s ������ ������%s���Դϴ�.\n", rs.getString("ename"), rs.getString("sal"));
			}
		} else {
			while(rs.next()) {
				System.out.printf("%s ������ %s�� �Ի��Ͽ����ϴ�.\n", rs.getString("ename"), 
						rs.getString("hiredate"));		
			}
		}		
		rs.close();
		stmt.close();
		conn.close();
	}
}
