package hard.dimentionone;

import java.util.Scanner;

// 벡터의 외적
public class Problem215 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] result = new int[3];
		
		System.out.print("벡터 1 : ");
		for(int i=0; i<3; i++)
			a[i] = stdIn.nextInt();

		System.out.print("벡터 2 : ");
		for(int i=0; i<3; i++)
			b[i] = stdIn.nextInt();
		
		
		System.out.println("두 벡터의 외적은 " + getExternal(a, b) + "입니다.");
		stdIn.close();
	}
	static int getExternal(int[] a, int[] b) {
		int mul = 0;
		for(int i=0; i<a.length; i++) {
			
		}
		return mul;
	}
}
