package hard.recursive;
/*
Enter the num : 5
f(num) 피보나치수열의 합 : 5
 */
import java.util.Scanner;

public class Problem244 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the num : ");
		int num = stdIn.nextInt();
		System.out.println("f(num) 피보나치수열의 합 : " + fibonacci(num));
		stdIn.close();
	}
	public static int fibonacci(int num) {
		if(num == 2 || num == 1)
			return 1;
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
