package hard.calendar;

import java.util.Calendar;

public class Example267 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%d %d %d %d\n", year, month, day ,week);
		now.add(Calendar.YEAR, +2);
		System.out.println(now.getTime());
	}
}
