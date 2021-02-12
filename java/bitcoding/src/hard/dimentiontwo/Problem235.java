package hard.dimentiontwo;
/*
Enter the number : 4 5
  20  19  17  14  10
  18  16  13   9   6
  15  12   8   5   3
  11   7   4   2   1 */
import java.util.Scanner;

public class Problem235 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		
		for(int k=n+m-1; k>=0; k--) {
			int i=n-1;
			int j=m-1;
			int a = arr[i][j];
			while(a != 0) {
				if(j != 0) {
					j--;
					a = arr[i][j];
				} else {
					i--;
					a = arr[i][j];
				}
			}
			while(i+j == k && n-1 >= i && i>=0 && m-1 >= j && j >= 0) {
				arr[i][j] = count;
				i--;
				j++;
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
