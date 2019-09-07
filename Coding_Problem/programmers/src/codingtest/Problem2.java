package codingtest;

import java.util.Stack;

public class Problem2 {
	public static void main(String[] args) {
		SolutionProblem2 su = new SolutionProblem2();
//		String p = "(()())()";	// "(()())()" 
//		String p = ")(";		// "()"
//		String p = "";			// ""
		String p = "()))((()";	// "()(())()"
		System.out.println("answer : " + su.solution(p));
	}
}

class SolutionProblem2 {
	static StringBuffer bf;
	static String answer = "";
	public String solution(String p) {
		return returnString(p);
	}
	static String returnString(String p) {
		if(checkBalance(p) && checkRight(p)) {
			answer = p;
		} else {
			String[] arr = new String[2];
			arr = splitString(p);	// 균형잡인 문자열 분리
			String u = arr[0];
			String v = arr[1];
			if(checkRight(u)) {
				answer += returnString(v);
			} else {
				String tmp = "(";
				bf = new StringBuffer();
				bf.append(u);
				tmp += returnString(v);
				tmp += ")";
				bf.deleteCharAt(0);
				bf.deleteCharAt(bf.length()-1);
				bf.reverse();
				tmp += bf.toString();
				answer += tmp;
			}
		}
		return answer;
	}
	static String[] splitString(String p) {
		bf = new StringBuffer();
		String[] arr = new String[2];
		int l_cnt = 0; int r_cnt = 0;
		for(int i=0; i<p.length(); i++) {
			if(p.charAt(i) == '(') {
				l_cnt++;
				bf.append('(');
			} else {
				r_cnt++;
				bf.append(')');
			}
			if(l_cnt == r_cnt) {
				arr[0] = bf.toString();
				arr[1] = p.substring(i+1);
				break;
			}
		}
		return arr; 
	}
	static boolean checkBalance(String p) {
		int l_cnt = 0; int r_cnt = 0;
		for(int i=0; i<p.length(); i++) {
			if(p.charAt(i) == '(') {
				l_cnt++;
			} else {
				r_cnt++;
			}
		}
		return l_cnt == r_cnt? true : false;
	}
	static boolean checkRight(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.add('(');
			} else {
				if(st.isEmpty()) {
					st.add(')');
				} else {
					st.pop();
				}
			}
		}
		return st.size() == 0 ? true : false;
	}
}