package hard.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Problem271 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.set(3000, 3, 25);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 w주 E요일");
		System.out.println(sd.format(now.getTime()));
	}
}
