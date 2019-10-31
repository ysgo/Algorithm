package Intermediate.ex30;
//멤버 메서드를 이용하여 신체 지수 구하기
public class BioCalendar {
	public static final int PHYSICAL=23;
	
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin( (days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200;
		BioCalendar bio = new BioCalendar();
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	}

}
