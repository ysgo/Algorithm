package array;

import java.util.Scanner;

public class EightNineFiveEight {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int count = stdIn.nextInt();
		String s;
		for(int i=0; i<count; i++) {
			s = stdIn.next();
			int ans = 0;
			int pre = 0;
			int k = 0;
			while(k < s.length()) {
				if(s.charAt(k) == 'O') {
					ans += pre + 1;
					pre++;
				} else {
					pre = 0;
				}
				k++;
			}
			System.out.println(ans);
		}
		stdIn.close();
	}
}
