package string_searching;

import java.util.Scanner;

/* 문자열 검색 방법 1 : 브루트-포스법(단순법 or 소박법)
 * 선형 검색을 확장한 알고리즘
 */
public class BFmatch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = stdIn.next();
		
		System.out.print("패턴 : ");
		String s2 = stdIn.next();
		
		int idx = bfMatch(s1, s2);		// 문자열 s1에서 문자열 s2를 검색
		
		if(idx == -1)
			System.out.println("텍스트에 패턴이 없습니다.");
		else {
			// 일치하는 문자 바로 앞까지의 길이를 구합니다
			int len = 0;
			for(int i=0; i<idx; i++) {
				len += s1.substring(i, i+1).getBytes().length;
			}
			len += s2.length();
			System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " + s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
		}
		stdIn.close();		
	}
	static int bfMatch(String txt, String pat) {
		int pt = 0;		// txt 커서
		int pp = 0;		// pat 커서
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == pat.length())
			return pt - pp;		// 검색 성공
		return -1;				// 검색 실패
	}
}
