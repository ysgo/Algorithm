package function;

import java.util.Scanner;

public class OneFiveFiveNineSix {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		System.out.println(sum(a));
		
		stdIn.close();
	}
	public static long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
