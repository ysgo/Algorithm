package hard.dimentiontwo;
/*
Enter the two number : 3 4
[3, 4, 2, 8, 6, 8, 8, 4, 2, 8]
 */
import java.util.Scanner;

public class Problem224 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num_arr = new int[10];
		
		System.out.print("Enter the two number : ");
		num_arr[0] = stdIn.nextInt();
		num_arr[1] = stdIn.nextInt();
		
		for(int i=2; i<num_arr.length; i++) {
			num_arr[i] = num_arr[i-2] * num_arr[i-1] % 10;
		}
		
		System.out.print("[" + num_arr[0]);
		for(int i=1; i<10; i++) {
			System.out.print(", " + num_arr[i]);
		}
		System.out.print("]");
		stdIn.close();
	}
}
