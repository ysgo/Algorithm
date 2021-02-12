package hard.recursive;

import java.util.Scanner;
// n값에 따른 함수 결과 값
public class Problem252 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		System.out.println("f(n) : " + f(n));
		
		stdIn.close();
	}
	static int f(int n) {
		int answer = 0;
		if(n == 1) return 1;
		else if(n == 2) return 2;
		else {
			if(n % 10 == 0) {
				answer = 5 * f(n-1) - 7 * f(n-5);
			} else if(n % 2 != 0) {
				answer = 2 * f(n - 1) - 1;
			} else if(n % 2 == 0) {
				answer = f(n-1) + 2;
			}
		}
		return answer;
	}
}
