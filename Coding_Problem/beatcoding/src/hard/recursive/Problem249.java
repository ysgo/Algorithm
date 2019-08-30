package hard.recursive;

import java.util.Scanner;

public class Problem249 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the num : ");
		int n = stdIn.nextInt();
		System.out.println("계단을 오를 수 있는 가짓 수 : " + step(n));
		
		stdIn.close();
	}
	public static int step(int n) {
		if(n == 1 | n == 0) {
			return 1;
		} else if(n == 2) {
			return 2;
		} else {
			int sum = 0;
			for(int i=0; i<n; i++) {
				sum += step(i);
			}
			return sum;
		}
	}
}
