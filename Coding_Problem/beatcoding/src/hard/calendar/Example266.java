package hard.calendar;

import java.util.Calendar;

public class Example266 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(now.getTimeInMillis());
		now.set(2019, 9, 1);
		System.out.println(now.getTime());
	}
}
