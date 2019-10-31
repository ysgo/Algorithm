package sort;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.NOVEMBER;
import static java.util.Calendar.OCTOBER;
import static java.util.Calendar.YEAR;

import java.util.Arrays;
import java.util.GregorianCalendar;

// 클래스 객체 배열의 정렬(병합 정렬)
// 자연 정렬이 필요한 배열의 경우의 정렬
public class SortCalendar {
	public static void main(String[] args) {
		GregorianCalendar[] x = { 
				new GregorianCalendar(2017, NOVEMBER, 1),
				new GregorianCalendar(1963, OCTOBER, 18),
				new GregorianCalendar(1985, APRIL, 5)
			};
		
		Arrays.sort(x);

		for (int i = 0; i < x.length; i++)
			System.out.printf("%04d년 %02d월 %02d일\n",
					x[i].get(YEAR),
					x[i].get(MONTH) + 1,
					x[i].get(DATE)
				);
	}
}
