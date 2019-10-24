package hard.recursive;
/*
Enter the underNum : 4
Enter the exponentialNum : 7
지수 함수의 값 : 16384
 */
import java.util.Scanner;

public class Problem245 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the underNum : ");
		int a = stdIn.nextInt();
		System.out.print("Enter the exponentialNum : ");
		int n = stdIn.nextInt();
		System.out.println("지수 함수의 값 : " + exp(a, n));
		
		stdIn.close();
	}
	public static int exp(int a, int n) {
		if(n == 1) return a;
		return a*exp(a, n-1);
	}
}
