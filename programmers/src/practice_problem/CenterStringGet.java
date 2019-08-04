package practice_problem;

public class CenterStringGet {
	public static void main(String[] args) {
		//String s2 = "abcde";
		String s = "qwer";
		String answer="";
		int len = s.length() / 2;
		if(s.length() % 2 != 0) {
			answer += s.charAt(len);
		} else {
//			for(int i=s.length()/2-1; i<s.length()/2+1; i++) {
//				answer += s.charAt(i);
//			}
			answer = s.charAt(len-1) + "" + s.charAt(len);
		}
		System.out.println(answer);
//		System.out.println();
//		System.out.println(new StringExercise().getMiddle(s));
	}
}
// 한줄 완성 코드
//class StringExercise{
//	String getMiddle(String word) {
//		return word.substring((word.length()-1)/2, word.length()/2+1);
//	}
//}
