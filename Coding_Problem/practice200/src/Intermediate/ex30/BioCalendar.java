package Intermediate.ex30;
//��� �޼��带 �̿��Ͽ� ��ü ���� ���ϱ�
public class BioCalendar {
	public static final int PHYSICAL=23;
	
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin( (days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200;
		BioCalendar bio = new BioCalendar();
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.\n", phyval);
	}

}
