package Beginner.ex018;

public class JavaTypeConversion {
//문자열을 실수로 변환하기
	public static void main(String[] args) {
	String slat=" 37.52127220511242   ";
	
	double latitude=Double.parseDouble(slat.trim());
	System.out.println(latitude);
	}

}
