package codingtest;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
	public static void main(String[] args) {
		SolutionProblem1 su = new SolutionProblem1();
//		String s = "aabbaccc"; // 7
//		String s = "ababcdcdababcdcd";	// 9
//		String s = "abcabcdede";	// 8
		String s = "abcabcabcabcdededededede";	// 14
//		String s = "xababcdcdababcdcd";	// 17
		System.out.println("answer : " + su.solution(s));
	}
}
class ChangeString {
	int cnt;
	String str;
	ChangeString(String str) {
		this.cnt = 1;
		this.str = str;
	}
}
class SolutionProblem1 {
	static int answer;
	static List<ChangeString> list;
	public int solution(String s) {
		answer = s.length();
		recur(s, 1);
		return answer;
	}
	static void recur(String s, int n) {
		if(n >= 2 && !s.substring(n).contains(s.substring(0, n))) return;
		list = new ArrayList<>();
		int cur = 0; int prev = 0;
		String curStr = "";
//		String preStr = "";
		for(int i=0; i<s.length(); i++) {
			cur = i*n;
			if(cur > s.length()|| cur+n > s.length()) {
				if(!s.substring(cur).isEmpty()) {
					list.add(new ChangeString(s.substring(cur)));
				}
				break;
			}
//			System.out.println("prev : " + prev + ", cur : " + cur + ", (cur+n) : " + (cur+n));
			curStr = s.substring(cur, cur+n);
//			preStr = s.substring(prev, prev+n);
//			System.out.println("i : " + i + ", cur : " + cur + ", (cur+n) : " + (cur+n));
			if(!list.isEmpty()) {
//				System.out.println("prev str : " + list.get(prev).str);
				if(list.get(prev).str.equals(curStr)) {
					list.get(prev).cnt++;
				} else {
					list.add(new ChangeString(curStr));
					prev++;
				}
//				System.out.println(list.get(prev).cnt + " " + list.get(prev).str);
			} else {
				list.add(new ChangeString(curStr));
			}
		}
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).cnt + " " + list.get(i).str);
//		}
		length();
		recur(s, n+1);
	}
	static void length() {
		ChangeString tmp;
		StringBuffer bf = new StringBuffer();
		for(int i=0; i<list.size(); i++) {
			tmp = list.get(i);
			if(tmp.cnt == 1) {
				bf.append(tmp.str);
			} else {
				bf.append(tmp.cnt + tmp.str);
			}
		}
//		System.out.println(bf.toString());
		answer = answer > bf.length()? bf.length() : answer;
	}
}