package day12;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileOutExam {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try(FileWriter writer = new FileWriter("C:/iotest/today.txt");
				PrintWriter out = new PrintWriter(writer)) {
			GregorianCalendar cal = new GregorianCalendar();
			int yearNum = cal.get(Calendar.YEAR);
			int dateNum = cal.get(Calendar.DAY_OF_YEAR);
			int monthNum = dateNum / 30 + 1;
			int dayNum = dateNum % 30;
			int day = cal.get(Calendar.DAY_OF_WEEK);
			
			out.printf("������ %d�� %d�� %d���Դϴ�.\r\n", yearNum, monthNum, dayNum);
			out.printf("������ %s�Դϴ�.\r\n", getWeek(day));
			
			cal = new GregorianCalendar(1992, 12-1, 7); // gregorian�� moth�� 0���� ����
			out.printf("%s�� %s�� �¾���ϴ�.", "����", getWeek(cal.get(Calendar.DAY_OF_WEEK)));
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
		} catch(Exception e) {
			System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
		}
	}
	public static String getWeek(int num) {
		String day = "";
		switch(num) {
		case 1:
			day = "�Ͽ���";
			break;
		case 2:
			day = "������";
			break;
		case 3:
			day = "ȭ����";
			break;
		case 4:
			day = "������";
			break;
		case 5:
			day = "�����";
			break;
		case 6:
			day = "�ݿ���";
			break;
		case 7:
			day = "�����";
			break;
		}
		return day;
	}
}