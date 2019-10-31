package Beginner.ex016;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
//API에서 제공하는 참조 타입 사용하기
	public static void main(String[] args) {
		int[] m = {1,2,3};
		int[] n = new int[] {1,2,3};
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}
}
