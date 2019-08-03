package Beginner.ex027;

public class BioCalendar {
//연산자를 이용하여 바이오리듬 값 구하기
	public static final int PHYSICAL = 23;
	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
	}

}
