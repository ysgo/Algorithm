package hard.dimentiontwo;
/*Enter the number : 5
   1   2   3   4   5
  10   9   8   7   6
  11  12  13  14  15
  20  19  18  17  16
  21  22  23  24  25
 */
import java.util.Scanner;

public class Problem233 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int[][] arr = new int[n][n];
		int count = 1;
		
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<n; j++) {
					arr[i][j] = count;
					count++;
				}
			} else {
				for(int j=n-1; j>=0; j--) {
					arr[i][j] = count;
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
