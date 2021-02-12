package string_searching;

import java.util.Scanner;

/*
 * Boyer-Moore법을 이용한 문자열 검색 : 패턴의 마지막 문자부터 앞쪽으로 검사를 진행하면서 일치하지 않는
 * 문자가 있으면 미리 준비한 표에 따라 패턴을 옮길 크기를 정하는 방법 
 */
public class BMmatch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = stdIn.next();

		System.out.print("패턴 : ");
		String s2 = stdIn.next();
		
		int idx = bmMatch(s1, s2);
		if(idx == -1) {
			System.out.println("텍스트에 패턴 문자가 없습니다.");
		} else {
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
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtLen = txt.length();
		int patLen = pat.length();
		int[] skip = new int[Character.MAX_VALUE + 1];	// 건너뛰기 표
							// Character.MAX_VALUE + 1 = 패턴에 존재할 수 있는 모든 문자의 옮길 크기를 계산한 값
		
		// 건너뛰기 표 만들기
		for(pt = 0; pt<=Character.MAX_VALUE; pt++)
			skip[pt] = patLen;
		for(pt = 0; pt<patLen - 1; pt++)
			skip[pat.charAt(pt)] = patLen - pt -1;	// pt == patLen - 1;
		
		//검색
		while(pt < txtLen) {
			pp = patLen - 1;	// pat의 끝 문자에 주목
			
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp == 0)
					return pt;	// 검색 성공
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen-pp;
		}
		return -1;				// 검색 실패
	}
}
