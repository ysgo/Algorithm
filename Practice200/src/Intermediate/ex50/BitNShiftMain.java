package Intermediate.ex50;
//shift 연산자를 이용하여 2진수 문자열로 바꾸기
public class BitNShiftMain {
	public static String shifts(int α) {
		String s = "";
		for(int i = 0; i<=31; i++) {
			int αα = α%2;
			s = (αα>=0)? αα+s : (-αα)+s;
			α>>=1;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}

}
