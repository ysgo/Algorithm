package hard.recursive;

import java.util.Scanner;

public class Problem258 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		System.out.println(rec2(n));
		
		stdIn.close();
	}
	public static int rec1(int n) {
		if(n == 1) return 2;
		else if(n == 2) return 3;
		else return rec1(n-1) + rec1(n-2);
	}
	public static int rec2(int n) {
		if(n == 1) return 1;
		else return n * rec2(n-1) + rec1(n);
	}
}
