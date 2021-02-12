package skill1;

import java.util.Arrays;
import java.util.Collections;

public class Test2 {
	public static void main(String[] args) {
		SolutionTest2 su = new SolutionTest2();
		long n = 118372;
		System.out.println(su.solution(n));
	}
}

class SolutionTest2 {
	public long solution(long n) {
		long answer = 0;
		String[] s = String.valueOf(n).split("");
		Arrays.sort(s, Collections.reverseOrder());
		StringBuffer sb = new StringBuffer();
		for(String data : s)
			sb.append(data);
		answer = Long.parseLong(sb.toString());
		return answer;
	}
}