package day12;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutExam3 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try(FileWriter writer = new FileWriter("C:/iotest/today1.txt", true);
				PrintWriter out = new PrintWriter(writer);) {
			LocalDate ld = LocalDate.now();
			int yearNum = ld.getYear();
			int monthNum = ld.getMonthValue();
			int dateNum = ld.getDayOfMonth();
			DayOfWeek day = ld.getDayOfWeek();
			String korday = day.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			
			out.printf("������ %d�� %d�� %d���Դϴ�.\r\n", yearNum, monthNum, dateNum);
			out.printf("������ %s�Դϴ�.\r\n", korday);
			
			LocalDate myld = LocalDate.of(2019,05,11);
			DayOfWeek myday = myld.getDayOfWeek();
			String mykorday = myday.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("%s�� %s�� �¾���ϴ�.%n", "XXX", mykorday);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
		} catch(Exception e) {
			System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
		}
	}	
}