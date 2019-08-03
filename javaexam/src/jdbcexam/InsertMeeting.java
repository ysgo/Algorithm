package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertMeeting {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt  = null;
		Scanner sc1 = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		pstmt = conn.prepareStatement(
				"INSERT into meeting values(meeting_seq.nextval, ?, ?, ?)");
		sc1 = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc1.nextLine();
		System.out.print("�޸� �Է��ϼ��� : ");
		String text = sc1.nextLine();
		System.out.print("�ð��Է� (yyyy mm dd hh mi) :");
		String date = sc1.nextLine();
		
		pstmt.setString(1, name);
		pstmt.setString(2, text);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH mm");
		java.util.Date d = sdf.parse(date);
		pstmt.setDate(3, new java.sql.Date(d.getTime()));
		pstmt.executeUpdate();
		System.out.println("������ ���� ����");
	} catch (ParseException pe) {
		pe.printStackTrace();
		System.out.println("�Ľ� ����");
	} catch (ClassNotFoundException cnfe) {
		cnfe.printStackTrace();
		System.out.println("����̹� �ε� ����");
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("������ ���� ����");
	} finally {
		try {
			if (sc1 != null) sc1.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();			
		} catch (SQLException se) {
			se.printStackTrace();			
		}
	}

	}

}
