package hard.recursive;
/*
Enter the num : 5
5 -> 16 -> 8 -> 4 -> 2 -> 1
Colatz conject answer : 1
 */
import java.util.Scanner;

public class Problem247 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the num : ");
		int num = stdIn.nextInt();
		System.out.println("Colatz conject answer : " + colatz(num));
		stdIn.close();
		
	}
	public static int colatz(int num) {
		if(num == 1) {
			System.out.println(num);
			return 1;
		}
		System.out.print(num + " -> ");
		return num%2==0 ? colatz(num/2) : colatz(3*num+1);
	}
}
