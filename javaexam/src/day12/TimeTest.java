package day12;
import java.util.Date;
public class TimeTest {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date my = new Date(116, 0, 1);
		Date today = new Date();
		long term = today.getTime() - my.getTime();
		System.out.println(today.getTime());
		System.out.println(my.getTime());
		
		System.out.println(term+" �и���");
		term /= 1000;
		System.out.println(term+" ��");
		System.out.println(term/60+" ��");
		System.out.println(term/3600+" �ð�");
		System.out.println(term/(3600*24)+" ��");

	}

}
