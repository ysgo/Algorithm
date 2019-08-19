package dynamic;

import java.util.Scanner;

// 백준 1463 문제(DP문제) - TopDown 방식 : 재귀이용
public class OneFourSixThree_1 {
	static int[] memz;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memz = new int[n+1];
		System.out.println(dp(n));
		sc.close();
	}
	static int dp(int n) {
		if(n == 1) {
			return 0;
		}
		
		memz[n] = dp(n - 1) + 1;
		System.out.println("1 - n : " + n + ", memz[n] : " + memz[n]);
		if(n % 2 == 0) {
			int tmp = memz[n / 2];
			if(tmp < memz[n]) {
				memz[n] = tmp + 1;
			}
		}
		
		if(n % 3 == 0) {
			int tmp = memz[n / 3];
			if(tmp < memz[n]) {
				memz[n] = tmp + 1;
			}
		}
		System.out.println("2 - n : " + n + ", memz[n] : " + memz[n]);
		return memz[n];
	}
}
