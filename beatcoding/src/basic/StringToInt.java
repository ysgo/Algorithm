package basic;


// 이 클래스는 학습테스트 전

public class StringToInt {
	public static void main(String[] args) {
		String s = "-1234";
		char c = s.charAt(0);
		int result;
		if(c == '-') {
			s = s.substring(1);
			result = -Integer.parseInt(s);
		} else {
			result = Integer.parseInt(s);
		}
		System.out.println(result);
		System.out.println();
		System.out.println(new StrToInt().getStrToInt("-1234"));
	}
}
// Integer.parseInt() 함수 사용 없이 작성
class StrToInt {
	public int getStrToInt(String str) {
		boolean sign = true;
		int result = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '-') {
				sign = false;
			} else if(ch != '+') {
				result = result*10 + (ch - '0');
			}
		}
		return sign? 1: -1 * result;
	}
}
