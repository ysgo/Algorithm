package hard.recursive;
/*
Enter the num : 5
5!(팩토리얼) : 120
 */
import java.util.Scanner;

public class Problem242 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = stdIn.nextInt();
		System.out.println(num + "!(팩토리얼) : " + factorial(num));
		stdIn.close();
	}
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}
}
