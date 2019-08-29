package hard.recursive;

import java.util.Scanner;
// 페르마의 마지막 정리
public class Problem255 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int k = stdIn.nextInt();
		System.out.println("fermat(a, b, c, k) : " + fermat(a,b,c,k));
		
		stdIn.close();
	}
	static boolean fermat(int a, int b, int c, int k) {
		boolean result = true;
		if(k == 2) return true;
		else if(Math.pow(a, k) + Math.pow(b, k) == Math.pow(c, k)) {
			return false;
		} else {
			result = fermat(a, b, c, k-1);
		}
		return result;
	}
}
