package array;

import java.util.Scanner;

public class OneZeroEightOneEight {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int cnt = stdIn.nextInt();
		int num, max=0, min=0;
		for(int i=0; i<cnt; i++) {
			num = stdIn.nextInt();
			if(i == 0) {
				max = min = num;
				continue;
			}
			if(max < num)
				max = num;
			if(min > num)
				min = num;
		}
		System.out.println(min + " " + max);
		stdIn.close();
	}
}
