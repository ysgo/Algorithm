package hard.recursive;

import java.util.Scanner;

public class Problem259 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Enter N : ");
		int N = stdIn.nextInt();
		System.out.print("Enter x : ");
		int x = stdIn.nextInt();
		System.out.print("Enter y : ");
		int y = stdIn.nextInt();
		int[][] arr = new int[N][N];
		arr = Rarray(1, 1, arr, N, 1);
		System.out.println(arr[x - 1][y - 1]);
		for (int[] ar : arr) {
			for (int e : ar) {
				System.out.printf("%4d", e);
			}
			System.out.println();
		}
		System.out.println("Finish");
		stdIn.close();
	}
	public static int[][] Rarray(int x, int y, int[][] arr, int n, int count) {
		arr[y-1][x-1] = count;
		if(n == 1) {
			return arr;
		}
		if(x < n) {
			arr = Rarray(x+1, y, arr, n, count+1);
		} else if(y < arr.length) {
			arr = Rarray(x, y+1, arr, n, count+1);
		} else if(x == n && y == arr.length) {
			int new_y = 1;
			while(arr[new_y-1][0] != 0) {
				new_y++;
			}
			arr = Rarray(1, new_y, arr, n-1, count+1);
		}
		return arr;
	}
}
