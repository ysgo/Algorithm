package hard.method;

import java.util.Scanner;

// 입력한 정수 n에서 1부터 n까지의 수중 1의 개수를 구하시오. n = 4일때 , return 1. n = 13일 때, return 6
public class Problem187 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = stdIn.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(i < 10) {
				if(i == 1)
					count++;
			} else {
				String num = String.valueOf(i);
				for(int j=0; j<num.length(); j++) {
					if(num.charAt(j) == '1')
						count++;
				}
			}
		}
		System.out.println(count);
		stdIn.close();
	}
}
