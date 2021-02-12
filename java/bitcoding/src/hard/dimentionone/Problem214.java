package hard.dimentionone;

import java.util.Scanner;

public class Problem214 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		
		System.out.print("벡터 1 : ");
		for(int i=0; i<3; i++) {
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("벡터 2 : ");
		for(int i=0; i<3; i++) {
			b[i] = stdIn.nextInt();
		}
		
		int result = getInternal(a, b);
		System.out.println("두 벡터의 내적은 " + result + "입니다.");
		stdIn.close();
	}
	static int getInternal(int[] a, int[] b) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}
}
