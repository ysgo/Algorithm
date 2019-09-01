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
		
		for(int i=0; i<3; i++)
			result[i] = a[(i+1)%3]*b[(i+2)%3] - a[(i+2)%3]*b[(i+1)%3];
		
		System.out.println("두 벡터의 외적은 (" + result[0] + ", " + result[1] + ", " + result[2]  + ")입니다.");
		stdIn.close();
	}
}
