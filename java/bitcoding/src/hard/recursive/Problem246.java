package hard.recursive;
/*
Enter the num1 : 2
Enter the num2 : 10
a와 b사이 짝수 값 : 2
a와 b사이 짝수 값 : 4
a와 b사이 짝수 값 : 6
a와 b사이 짝수 값 : 8
 */
import java.util.Scanner;

public class Problem246 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the num1 : ");
		int a = stdIn.nextInt();
		System.out.print("Enter the num2 : ");
		int b = stdIn.nextInt();
		evennum(a, b);
		
		stdIn.close();
	}
	public static int evennum(int a, int b) {
		if(a == b) return 0;
		if(a % 2 == 0) {
			System.out.println("a와 b사이 짝수 값 : " + a);
		}
		return evennum(a+1, b);
	}
}
