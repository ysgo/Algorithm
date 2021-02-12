package function;

import java.util.Scanner;

public class OneZeroEightSevenTwo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		System.out.println(factorial(n));
		
		stdIn.close();
	}
	public static int factorial(int n) {
		int ans = 1;
		for(int i=n; i>0; i--) {
			ans *= i;
		}
		return ans;
	}
}
