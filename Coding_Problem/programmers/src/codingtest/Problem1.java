package codingtest;

import java.util.HashMap;

public class Problem1 {
	public static void main(String[] args) {
		SolutionProblem1 su = new SolutionProblem1();
		String s = "aabbaccc"; // 7
//		String s = "ababcdcdababcdcd";	// 9
//		String s = "abcabcdede";	// 8
//		String s = "abcabcabcabcdededededede";	// 14
//		String s = "xababcdcdababcdcd";	// 17
		System.out.println("answer : " + su.solution(s));
	}
}

class SolutionProblem1 {
	static int answer;
	static HashMap<String, Integer> map;
	static StringBuffer bf;

	public int solution(String s) {
		int size = 0;
		answer = s.length();
		map = new HashMap<>();
		recur(s, 2, size);
		return answer;
	}
	static void recur(String s, int n, int size) {
		bf = new StringBuffer();
		int cur = 0; int prev = 0;
		String curStr = "";
		String preStr = "";
		for(int i=0; i<s.length(); i++) {
			cur = i*n;
			curStr = s.substring(cur, cur+n);
			preStr = s.substring(prev, prev+n);
			System.out.println("i : " + i + ", cur : " + cur + ", (cur+n) : " + (cur+n));
			if(s.substring(prev+1).contains(curStr)) {
				
			}
			bf.append(curStr);
			System.out.println(bf.length());
			prev = cur;
			if(bf.length() == s.length()) {
				break;
			}
		}
		System.out.println(bf.toString());
	}
	
	static int getSize(int size) {
		for(String data : map.keySet())
			size += map.get(data);
		return size;
	}
	
	static void splitString(String s, int splitLength, int size) {
		if(answer < size && splitLength > s.length()/2-1) {
			return;
		}
		int cur = 0; int prev = 0;
		String curStr = "";
		String preStr = "";
		for(int i=0; i<s.length(); i++) {
			cur = i*splitLength;
			curStr = s.substring(cur, cur+splitLength);
			preStr = s.substring(prev, prev+splitLength);
			System.out.println(i + " " + cur + " " + (cur+splitLength));
			if(i != 0) {
				if(s.substring(cur).length() >= splitLength) {
					if(curStr.equals(preStr)) {
						map.put(curStr, map.get(curStr)+1);
					} else {
						if(map.containsKey(curStr)) {
							map.put(curStr, map.get(curStr));
						} else 
							map.put(curStr, 1);
					}
				} else {
					map.put(s.substring(cur), 1);
				}
			} else {
				map.put(curStr, 1);
			}
			System.out.println(map);
			prev = cur;
		}
		size = getSize(size);
		if(answer > size) {
			answer = size;
		}
		map.clear();
		splitString(s, splitLength+1, size);
	}
}