package codingtest.easysoft;

import java.util.ArrayList;

public class ESTProblem1 {
	static String aaa = "aaa";
	static String bbb = "bbb";
	static StringBuilder sb = new StringBuilder();
	static ArrayList<String> list = new ArrayList<>();
	static ArrayList<String> list2 = new ArrayList<>();
	public static int solution(String S) {
		int answer = 0;
		for(int i=0; i<S.length()-2; i++) {
			recurSplit(S, i);
//			if(check(S, aaa, i) || check(S, bbb, i)) {
//				sb.append(S.charAt(i));
//				System.out.println(sb.toString());
////				list.add(sb.toString());
//				sb = new StringBuilder();
//			} else {
//				sb.append(S.charAt(i));
//			}
		}
//		list.add(S.substring(S.length()-2));
//		System.out.println(list);
		return answer;
    }
	public static void recurSplit(String S, int i) {
		if(i == S.length()-3) {
			return;
		}
		if(check(S, aaa, i) || check(S, bbb, i)) {
			System.out.println(i);
			sb.append(S.substring(i,  ++i));
			list.add(sb.toString());
			System.out.println(i);
			recurSplit(S, i);
			sb.append(S.substring(i,  ++i));
			list2.add(sb.toString());
			System.out.println(i);
			recurSplit(S, i);
			System.out.println(list + " " + i);
			System.out.println(list2  + " " + i);
		}
		sb.append(S.substring(i, i+1));
	}
	public static boolean check(String S, String str, int i) {
		return S.substring(i, i+3).equals(str) ? true : false;
	}
	public static void main(String[] args) {
		String s = "baaabbabbb";	// 7
//		String s = "babba";			// 5
//		String s = "abaaaa";		// 4
		System.out.println(solution(s));
	}
}
