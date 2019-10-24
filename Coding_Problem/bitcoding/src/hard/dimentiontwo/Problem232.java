package hard.dimentiontwo;
/* Enter the number : 3
   1   6   7
   2   5   8
   3   4   9
 */
import java.util.Scanner;

public class Problem232 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int[][] arr = new int[n][n];
		int count = 1;
		
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<n; j++) {
					arr[j][i] = count;
					count++;
				}
			}
			else {
				for(int j=n-1; j>=0; j--) {
					arr[j][i] = count;
					count++;
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
