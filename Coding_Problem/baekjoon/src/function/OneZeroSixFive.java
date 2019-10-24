package function;

import java.util.Scanner;

public class OneZeroSixFive {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		System.out.println(hansu(N));
		
		stdIn.close();
	}
	public static int hansu(int N) {
		if(N < 100) return N;
		int ans = 99;
		for(int i=100; i<=N; i++) {
			if((i / 10 % 10)*2 == (i / 100 % 10 + i % 10)) {
				ans++;
			}
			if(i == 1000)
				ans--;
		}
		return ans;
	}
}
