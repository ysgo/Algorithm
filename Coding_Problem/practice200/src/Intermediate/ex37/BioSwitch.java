package Intermediate.ex37;
//상수값에 따라 신체, 감정, 지성값 출력하기
public class BioSwitch {
	
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;
	
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
			case PHYSICAL :
				result="신체 지수:";
				break;
			case EMOTIONAL :
				result="감정 지수:";
				break;
			case INTELLECTUAL :
				result="지성 지수:";
				break;
			default :
				result="미결정";
				break;
		}
		return result+(value*100);
	}
	
	public static void main(String[] args) {
		int index=PHYSICAL;
		double value=0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}

}
