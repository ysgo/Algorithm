package hard.method;

import java.util.Scanner;

// 최대공약수와, 최소공배수 구하기 (유클리드의 호제법 기억하기)
public class Problem180 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int n = sc.nextInt();
		System.out.print("Enter the 2st number : ");
		int m = sc.nextInt();
		int GCD = gcd(n, m);
		int LCM = lcm(n, m);
		
		System.out.printf("GCD of %d and %d is %d%n", n, m, GCD);
		System.out.printf("LCM of %d and %d is %d", n, m, LCM);
		sc.close();
	}
	public static int gcd(int n, int m) {
		int num = n>m? m+1 : n+1;
		while(num >= 2) {
			num--;
			if(n % num == 0 & m % num == 0) {
				break;
			}
		}
		return num;
	}
	public static int lcm(int n, int m) {
		int num = n>m? n : m;
		while(true) {
			if(num %n == 0 & num % m == 0) {
				break;
			}
			num++;
		}
		return num;
	}
}
