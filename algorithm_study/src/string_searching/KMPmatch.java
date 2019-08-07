package string_searching;

import java.util.Scanner;

/*
 * KMP법에 의한 문자열 검색 방법 : 텍스트와 패턴의 겹치는 부분을 찾아내 검사를 다시 시작할 위치를 구하여 검색하는 방법
 * !!! 몇 번째 문자부터 다시 검색할지에 대한 값을 미리 표로 만들어 해결 !!!
 * 1. 패턴의 1~4번째 문자에서 검사에 실패한 경우 패턴을 옮긴 후 다음 1번째 문자부터 다시 검색
 * 2. 패턴의 5번째 문자에서 검사 실패한 경우 다음 1번째 문자부터 일치하므로 2번째 문자부터 다시 검색
 * 3. 패턴의 6번째 문자에서 검사 실패한 경우 3번째 문자부터 다시 검사
 */
public class KMPmatch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = stdIn.next();
		
		System.out.print("패턴 : ");
		String s2 = stdIn.next();
		
		int idx = kmpMatch(s1, s2);
		
		if(idx == -1)
			System.out.println("텍스트에 패턴문자가 없습니다.");
		else {
			int len = 0;
			for(int i=0; i<idx; i++) {
				len += s1.substring(i, i+1).getBytes().length;
			}
			len += s2.length();
			
			System.out.println((idx+1) + "번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " + s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
		}		
		stdIn.close();
	}
	static int kmpMatch(String txt, String pat) {
		int pt = 1;
		int pp = 0;
		int[] skip = new int[pat.length() + 1];		// 건너뛰기 표
		
		// 건너뛰기 표 만들기
		skip[pt] = 0;
		while(pt != pat.length()) {
			if(pat.charAt(pt) == pat.charAt(pp))
				skip[++pt] = ++pp;
			else if(pp == 0)
				skip[++pt] = pp;
			else
				pp = skip[pp];
		} 
		
		// 검색
		pt = pp = 0;
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else if(pp == 0) {
				pt++;
			} else {
				pp = skip[pp];
			}
		}
		
		if(pp == pat.length())
			return pt - pp;
		return -1;
	}
}
