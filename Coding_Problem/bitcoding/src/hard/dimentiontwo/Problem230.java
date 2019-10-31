package hard.dimentiontwo;
/*Enter the number : 5
   1   1   1   1   1
   1   2   3   4   5
   1   3   6  10  15
   1   4  10  20  35
   1   5  15  35  70
 */
import java.util.Scanner;

public class Problem230 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == 0 | j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
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
