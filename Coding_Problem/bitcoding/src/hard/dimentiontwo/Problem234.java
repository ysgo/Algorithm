package hard.dimentiontwo;
/* Enter the number : 3 4
   1   2   4   7
   3   5   8  10
   6   9  11  12

 */
import java.util.Scanner;

public class Problem234 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		
		for(int k=0; k<n+m-1; k++) {
			int i=0;
			int j=0;
			int a = arr[i][j];
			while(a != 0) {
				if(j != m-1) {
					j++;
					a = arr[i][j];
				} else {
					i++;
					a = arr[i][j];
				}
			}
			while(i+j == k && n-1 >= i && i>=0 && m-1 >= j && j >= 0) {
				arr[i][j] = count;
				i++;
				j--;
				count++;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		stdIn.close();
	}
}
