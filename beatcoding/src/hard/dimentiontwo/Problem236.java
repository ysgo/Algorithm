package hard.dimentiontwo;
/*
Enter the number : 3 4
   1   2   3   4
  10  11  12   5
   9   8   7   6 */
import java.util.Scanner;

public class Problem236 {
	public static boolean is_right(int i, int j, int[][] arr) {
//		int n = arr.length; 
		int m = arr[0].length;
		if(i == 0 && j != m-1 && arr[i][j+1] == 0) {
			return true;
		} else if(j == 0 && arr[i-1][j] != 0) {
			return true;
		} else if(j != 0 && j != m-1 && arr[i][j-1] != 0 &&
				arr[i][j] != 0 && arr[i][j+1] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean is_down(int i, int j, int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		if(j == m-1 && i != n-1 && arr[i+1][j] == 0) {
			return true;
		} else if(j != 0 && i != 0 && i != n-1 && arr[i-1][j] != 0
				&& arr[i][j+1] != 0 && arr[i+1][j] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean is_left(int i, int j, int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		if(i == n-1 && j != 0 && arr[i][j-1] ==0) {
			return true;
		} else if(j != 0 && j != m-1 && i != n-1 &&
				arr[i][j+1] != 0 && arr[i+1][j] != 0 && arr[i][j-1] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		int i = 0;
		int j = 0;
		
		while(count <= n*m) {
			arr[i][j] = count;
			if(is_right(i,j,arr)) {
				j++;
			} else if(is_left(i,j,arr)) {
				j--;
			} else if(is_down(i,j,arr)) {
				i++;
			} else {
				i--;
			}
			count++;
		}
		
		for(int a=0; a<n; a++) {
			for(int b=0; b<m; b++) {
				System.out.printf("%4d", arr[a][b]);
			}
			System.out.println();
		}
		
		stdIn.close();
	}
}
