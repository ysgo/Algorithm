package hard.recursive;

import java.util.Scanner;

public class Problem260 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

//		// 재귀를 이용한 풀이 -> / 연산이 오류가 나옴. 해결 필요!!
//		int n = stdIn.nextInt();
//		int count = 0;
//		System.out.println(num_thirteen(n, count));
//		일반 풀이식		
		String n = stdIn.next();
		int answer = 0;
		for(int i=0; i<n.length()-1; i++) {
			if(n.charAt(i) == '1') {
				for(int j=i+1; j<n.length(); j++) {
					if(n.charAt(j) == '3') {
						answer++;
						break;
					}
				}
			}
		}
		System.out.println("n까지의 정수 중 13이 나오는 횟수  : " + answer);
		stdIn.close();
	}
//	public static int num_thirteen(int n, int count) {
//		System.out.println(n + " " + count);
//		int i = 1;
//		if(n < 13) {
//			return count;
//		}
//		for(i=1; n/i > 10; i*=10) {
//			if(n / (i/10) == 13) {
//				count++;
//			}
//		}
//		return num_thirteen(n - n/i*i, count);
//	}
}
