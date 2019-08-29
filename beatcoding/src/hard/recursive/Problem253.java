package hard.recursive;

import java.util.Scanner;
// 피보나치와 비슷한 수열
public class Problem253 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		System.out.println("fibo_similar(" + n + ") : " + fibo_similar(n));
		
		stdIn.close();
	}
	static int fibo_similar(int n) {
		if(n == 1 || n == 2 || n == 3) return 1;
		else {
			return fibo_similar(n-1) + fibo_similar(n-3);
		}
	}
}
