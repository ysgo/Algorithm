package hard.dimentiontwo;
/* Enter the numbers : 1 2 3 4 5
   1   2   3   4   5
   2   3   4   5   1
   3   4   5   1   2
   4   5   1   2   3
   5   1   2   3   4
 */
import java.util.Scanner;

public class Problem231 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the numbers : ");
		String numbers = stdIn.nextLine();
		String[] numbers_arr = numbers.split(" ");
		int n = numbers_arr.length;
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(numbers_arr[(i+j)%n]);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		stdIn.close();
	}
}
