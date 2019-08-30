package hard.recursive;

import java.util.Scanner;

public class Problem262 {
	private static char[] data = {'a', 'b', 'c', 'd'};
	private static int n = data.length;
	private static boolean[] include = new boolean[n];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int S = stdIn.nextInt();
		powerSet(S);
		
		stdIn.close();
	}
	static void powerSet(int s) {
		if(s == n) {
			for(int i=0; i<n; i++) {
				if(include[i]) {
					System.out.print(data[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		include[s] = false;
		powerSet(s+1);
		include[s] = true;
		powerSet(s+1);
	}
}
