package function;

import java.util.Scanner;

// 하노이의 탑
public class OneOneSevenTwoNine {
	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int count = (int)Math.pow(2, N)-1;
		System.out.println(count);
		hanoi(N, 1, 2, 3);
		System.out.println(sb.toString());
		
		stdIn.close();
	}
	static void hanoi(int n, int from, int by, int to) {
		if(n == 0) return;
		else if(n == 1) {
			sb.append(from + " " + to + "\n");
		} else {
			hanoi(n-1, from, to, by);
			sb.append(from + " " + to + "\n");
			hanoi(n-1, by, from, to);
		}
	}
}
