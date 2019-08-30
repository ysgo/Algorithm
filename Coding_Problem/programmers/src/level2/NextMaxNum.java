package level2;

public class NextMaxNum {
	public static void main(String[] args) {
		SolutionNextMaxNum su = new SolutionNextMaxNum();
		int n = 78;		// 83
//		int n = 15;		// 23
		System.out.println(su.solution(n));
	}
}

class SolutionNextMaxNum {
	public int solution(int n) {
		int answer = n;
		int nLength = nextNum(answer);
		while(true) {
			answer++;
			if(nLength == nextNum(answer))
				break;
		}
		return answer;
	}
	static int nextNum(int i) {
		int val=0;
		StringBuffer sb = new StringBuffer();
		while(i != 1) {
			val = i % 2;
			i /= 2;
			sb.append(val);
		}
		sb.append(i);
		int cnt=0;
		for(int j=0; j<sb.length(); j++) {
			if(sb.charAt(j) == '1') {
				cnt++;
			}
		}
		return cnt;
	}
}