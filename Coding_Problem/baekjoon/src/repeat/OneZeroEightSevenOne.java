package repeat;

import java.util.Scanner;

public class OneZeroEightSevenOne {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int[] a = new int[n];
		
		if(n >= 1 && x <= 10000) {
			for(int i=0; i<a.length; i++) {
				a[i] = scn.nextInt();
			}
			for(int j=0; j<a.length; j++) {
				if(a[j] < x) {
					System.out.print(a[j] + " ");
				}
			}
		}
		scn.close();
	}
}
