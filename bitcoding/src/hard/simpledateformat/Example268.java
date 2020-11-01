package hard.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example268 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyy년 MM월 dd일");
		System.out.println(sd.format(now.getTime()));
	}
}
