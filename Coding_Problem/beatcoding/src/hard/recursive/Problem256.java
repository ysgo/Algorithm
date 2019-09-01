package hard.recursive;

import java.util.Scanner;
/*	9 6
	14
	28
	38
	44
	1 */
public class Problem256 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		recurse(a, b);
		
		stdIn.close();
	}
	public static void recurse(int a, int b) {
		if(a == 1)
			System.out.println(a);
		else if(a % 2 == 0) {
			System.out.println(b);
			recurse(a-1, a+b);
		} else {
			recurse(a-1, a+b-1);
		}
	}
}
