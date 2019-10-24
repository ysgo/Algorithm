package hard.simpledateformat;

import java.util.Calendar;

public class Problem270 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.set(2000, 0, 1);
		long first = now.getTimeInMillis();
		now.set(1970, 0, 1);
		long second = now.getTimeInMillis();
		System.out.println(first - second);
	}
}
