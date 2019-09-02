package hard.dimentiontwo;
/*
Enter the numbers : 1 5 4 6 8 1 3 9 4 5 6 8 7 2 3 10 1 5
1의 개수 : 3
2의 개수 : 1
3의 개수 : 2
4의 개수 : 2
5의 개수 : 3
6의 개수 : 2
7의 개수 : 1
8의 개수 : 2
9의 개수 : 1
10의 개수 : 1
 */
import java.util.Scanner;

public class Problem227 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the numbers : ");
		String numbers = stdIn.nextLine();
		String[] arr_numbers = numbers.split(" ");
		int[] num = new int[10];
		
		for(String e : arr_numbers)
			num[Integer.parseInt(e) - 1]++;
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%d의 개수 : %d\n", i, num[i-1]);
		}
		
		stdIn.close();
	}
}
