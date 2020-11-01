package hard.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example269 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyy년 MM월 dd일");
		System.out.println(sd.format(now.getTime()));
		
		sd = new SimpleDateFormat("yyyy년 w주 E요일");
		System.out.println(sd.format(now.getTime()));
		
		sd = new SimpleDateFormat("W주 E요일 hh:mm");
		System.out.println(sd.format(now.getTime()));
	}
}
